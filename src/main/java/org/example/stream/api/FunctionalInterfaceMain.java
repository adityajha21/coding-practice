package org.example.stream.api;

public class FunctionalInterfaceMain {
    public static void main(String[] args) {
        FunctionInterfaceTest fi = () -> {
            System.out.println("Calling functional Interface");
        };

        fi.display();
    }
}
