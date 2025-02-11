# Spring API

## 概要
このプロジェクトは、**Spring Boot** を使用して構築したシンプルな REST API です。  
エンドポイント `/hello` にアクセスすると、指定した `name` パラメータを使って挨拶を返します。  
Dockerを利用した環境構築

## 使用環境
このプロジェクトを動かすために、以下の環境が必要です。

- **Docker** 
- **Maven** 
- **JDK 17** 

## 使用方法

```bash
docker run --rm -v "$(pwd):/app" -w /app spring-jdk17 mvn clean package
