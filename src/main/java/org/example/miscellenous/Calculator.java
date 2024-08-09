package org.example.miscellenous;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        char op = sc.next().charAt(0);
        int temp = num;
        switch (op) {
            case '+' :
                int n = sc.nextInt();
                temp = temp +n;
                System.out.println("Total calulated value: " +temp);
            case '-' :
                int n1 = sc.nextInt();
                break;
            case '=':
                System.out.println("Total calulated value: " +temp);
            default:
                System.out.println("Invalid value entered!!!");
        }

    }
}
