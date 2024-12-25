package org.example.oops.polymorphism;

public class Dog extends Animal{

    @Override
    public void sound() {
        System.out.println("Dog bark");
    }
}
class polymorphismMain{
    public static void main(String[] args) {
        Animal a = new Dog();
        a.sound();
    }
}
