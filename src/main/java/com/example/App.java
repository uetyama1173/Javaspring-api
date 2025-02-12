package com.example;

import java.util.Random;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @GetMapping("/quote")
    public String randomQuote() {
        String[] quotes = {
                "hogehoge",
                "Do or do not, there is no try.",
                "Life is what happens when you're busy making other plans.",
                "The best way to predict the future is to create it."
        };
        return quotes[new Random().nextInt(quotes.length)];
    }

    // ヘルプページを表示するエンドポイント
    @GetMapping("/help")
    public String showHelp() {
        return "This is a help page. You can get a random quote by calling /quote.";
    }

}
