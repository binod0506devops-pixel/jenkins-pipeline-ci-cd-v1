package com.example;

public class App {

    public String getMessage() {
        return "Hello, Jenkins!";
    }

    public static void main(String[] args) {
        App app = new App();
        System.out.println(app.getMessage());

    }
}
//Testing sonarQube  analysis-V2