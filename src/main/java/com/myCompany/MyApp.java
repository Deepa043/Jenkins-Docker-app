package com.myCompany;

/**
 * Hello world!
 */
public class MyApp
{

    private final String message = "Hello World,How are You?";

    public MyApp() {}

    public static void main(String[] args) {
        System.out.println(new MyApp().getMessage());
    }

    private final String getMessage() {
        return message;
    }

}
