package com.company;

public class Main {

    public static void main(String[] args) {
        String s = "This string is used to show the method lastIndexOf";
        System.out.println("index = " + s.lastIndexOf("method"));
        //This method searches from the end of the string and finds the substring called from right to left
        //It returns the index of the first letter of the substring you called for from the string.
        //It accepts substrings from a particular string and returns the index in int's
        //If you call for a substring that doesn't exist, it will always return index of -1
    }
}
