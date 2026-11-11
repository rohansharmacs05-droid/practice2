package com.example.maven_github_demo;

public class oddeven {

    public String checkNumber(int number) {

        if (number % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

    public static void main(String[] args) {

        oddeven obj = new oddeven();

        int number = 10;

        System.out.println(number + " is " + obj.checkNumber(number));
    }
}
