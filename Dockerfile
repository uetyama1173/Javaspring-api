FROM openjdk:17-slim

# 作業ディレクトリを作成
WORKDIR /app
COPY target/*.jar app.jar

# Maven をインストール
RUN apt-get update && apt-get install -y maven

# JDK のバージョンを確認
RUN java -version

# Maven のバージョンを確認
RUN mvn -version

# JAR をビルドして実行できるようにする
CMD ["java", "-jar", "app.jar"]
