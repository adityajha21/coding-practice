package org.example.exception;

public class A {
    public void calculate(){
        System.out.println("calling from A");
    }
    private void print(){
        System.out.println("Print from Class A");
    }

    static class B extends A{
        public static void main(String[] arg){
            A a = new B();
            a.calculate();
            a.print();
        }
       @Override
        public void calculate(){
           System.out.println("calling from B");


       }
      /* @Override
        private void print(){
           System.out.println("Calling private from B");
       }*/
    }


}
