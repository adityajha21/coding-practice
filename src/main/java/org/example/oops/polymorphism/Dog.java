package org.example.oops.polymorphism;

class Animal {
    public void sound(){
        System.out.println("Animal sound");
    }
}

public class Dog extends Animal{

    @Override
    public void sound() {
        System.out.println("Dog bark");
    }
    public void eat(){
        System.out.println("Animal eat");
    }
}
class polymorphismMain{
    public static void main(String[] args) {
      //  Animal a = new Dog();
        Animal a = new Dog();
        a.sound();
        ((Dog) a).eat();
    }
}
