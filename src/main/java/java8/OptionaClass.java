package java8;

import java.util.Optional;

public class OptionaClass {
    public static void main(String[] args) {
        String[] str = new String[10];
     //   System.out.println(str[0].length());

        Optional<String> opStr = Optional.ofNullable(str[1]);
        if(opStr.isEmpty()) {
            System.out.println("Value is empty");
        } else {
            System.out.println(str[1].length());
        }
    }
}
