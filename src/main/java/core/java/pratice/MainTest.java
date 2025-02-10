package core.java.pratice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainTest {
        public static void main(String[] args) {
            List<Integer> list =  Arrays.asList(1,8,2123, 789, 321, 614, 987, 51);
            System.out.println("Hello, World!");

            List<Integer> resultList = new ArrayList<>();

            for(int number : list) {
                    if(number >=10 ) {
                        while (number >= 100) {
                            number = number / 10;  // 212
                        }
                            int secondDigit = number % 10;  // 2
                            if (secondDigit == 1)
                                System.out.println(number);
                        }
            }

        }
    }

