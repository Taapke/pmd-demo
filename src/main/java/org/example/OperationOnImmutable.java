package org.example;

public class OperationOnImmutable {
    public static void operationOnImmutable() {
        // Caught by PMD as useless operation on immutable
        String str = "example";
        str.toUpperCase();
    }
}
