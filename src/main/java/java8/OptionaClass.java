package java8;

import java.util.Optional;

public class OptionaClass {
    public static void main(String[] args) {

        // Transforming the value
        Optional<String> upperCaseName = Optional.of("Java").map(String::toUpperCase);
        System.out.println(upperCaseName.orElse("No Value")); // JAVA

        // Handle Null pointer exception
        String[] words = new String[5];
        Optional<String> checkNULL = Optional.ofNullable(words[2]);
      //  Optional<String> checkNULL = Optional.of(words[0]);
        if(checkNULL.isPresent()) {
            System.out.println(words[2].toLowerCase());
        } else {
            System.out.println("word is null. Hence saved from Null Pointer exception");
        }

    }
}
