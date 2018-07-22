package com.company;

public class Main {

    public static void main(String[] args) {

        iphone7 deviceDisplay = new iphone7();
        System.out.println("iphone 7 has a display of "+deviceDisplay.display); //inherites the display of iphone6 in absence of its own
    }
}
