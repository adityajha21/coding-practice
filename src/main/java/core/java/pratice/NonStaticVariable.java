package core.java.pratice;

// can we call non static variable from static method ?\
    // No, you cannot directly define non-static (instance) variables inside a static method
    // to overcome this , we can call it via instance of the class

public class NonStaticVariable {
    int instance  = 1;

    public static void staticMethod() {
        //System.out.println(instance); //throwing error

        NonStaticVariable nsv = new NonStaticVariable();
        nsv.instance = 42;
        System.out.println("You are inside static method and you can ony call non static method by creating instance of it" +nsv.instance);
    }
    public void instanceMethod() {
        System.out.println("You are inside Non Static variable and you can call non static method without creating Instance of it" +instance);
    }

    public static void main(String[] args) {
        staticMethod();
        NonStaticVariable nsv = new NonStaticVariable();
        nsv.instanceMethod();
    }
}
