package org.example;

public class StringComparison {
    public static void compareStrings() {
        String a = new String("test");
        String b = new String("test");

        if (a == b) {
            System.out.println("Strings are the same");
        } else {
            System.out.println("Strings are different");
        }
    }
}
