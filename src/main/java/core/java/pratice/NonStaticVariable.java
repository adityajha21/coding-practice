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
        System.out.println(nsv.instance);
    }

    public static void main(String[] args) {
        staticMethod();
    }
}
