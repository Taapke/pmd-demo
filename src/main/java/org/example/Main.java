package org.example;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("example");

        // PMD: Useless operation on immutable object
        String str = "example";
        str.toUpperCase();

        // SpotBugs: Null pointer dereference
        String nullStr = null;
        // Uncomment the next line to trigger the SpotBugs warning
        // nullStr.length();

        // Error Prone: Collection and array comparison using '=='
        if (list == null) {
            System.out.println("This is never null");
        }

        // SpotBugs: Inefficient use of keySet iterator instead of entrySet iterator
        for (String s : list) {
            System.out.println(s);
        }

    }
    // PMD: Unused method
    public void unusedMethod() {
        System.out.println("This method is not used");
    }
}