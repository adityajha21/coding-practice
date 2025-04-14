package org.example.exception;

public class ExceptionReturn {
    public static void main(String[] args) {
        System.out.println(checkReturnType());

    }

    private static String checkReturnType() {
        try {
            System.out.print("inside try block ");
            return "xyz ";
        } catch(Exception e) {
            System.out.print("inside catch block ");
        } finally {
            System.out.print("inside finally block ");
        }
        return "";
    }
}
