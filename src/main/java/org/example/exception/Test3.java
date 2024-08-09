package org.example.exception;

public class Test3 {
    private Test3(int a){

    }
    public static void main(String[] args) throws Exception {
        Class cls = Class.forName("Test3");
        Test test = (Test)cls.newInstance();
        System.out.println(test.getClass().getName());
    }
}
