package org.example.exception;

public class ExceptionTest {
    public static void main(String[] args)  {
           int age1 = 20;
           int age2 = 30;
               if(age1 > 10)
               throw new InvalidAgeException("age is invalid");
    }
}
