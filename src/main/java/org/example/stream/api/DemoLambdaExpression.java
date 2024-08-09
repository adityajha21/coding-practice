package org.example.stream.api;

import java.util.Optional;

public class DemoLambdaExpression {
    public static void main(String[] args) {
       Optional<String> e = Optional.empty();
       e.ifPresent(g -> System.out.println("gfdg"));
    }
}
