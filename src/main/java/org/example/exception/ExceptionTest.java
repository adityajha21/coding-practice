package org.example.exception;

public class ExceptionTest {
    public static void main(String[] args) {
           int age1 = 20;
           int age2 = 30;
           try {
               int num = age1/0;
               throw new InvalidAgeException("age is invalid");
           } catch (InvalidAgeException e) {
               System.out.println(e.getLocalizedMessage());
               System.out.println(e.getMessage());
               System.out.println(e);


           }

    }
}
