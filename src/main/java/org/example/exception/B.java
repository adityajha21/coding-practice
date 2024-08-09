package org.example.exception;

 class B {
    public static void sound() {
        System.out.println("MEOW");
    }
}
    class C extends B{
        public static void sound() {
            System.out.println("MEOW");
        }

        public static void main(String[] args) {
            B b = new C();
         //   b.sou
        }
    }
