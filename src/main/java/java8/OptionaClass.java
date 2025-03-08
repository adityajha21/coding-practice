package java8;

import java.util.Optional;

public class OptionaClass {
    public static void main(String[] args) {
        // Throws null pointer exception
  /*      String[] words = new String[10];
        String word = words[5].toLowerCase();
        System.out.print(word);*/

        // Handle Null pointer exception
        String[] words = new String[5];
        Optional<String> checkNUll = Optional.ofNullable(words[2]);
        if(checkNUll.isPresent()) {
            System.out.println(words[2].toLowerCase());
        } else {
            System.out.println("word is null. Hence saved from Null Pointer exception");
        }

    }
}
