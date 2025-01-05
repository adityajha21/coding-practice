package core.java.pratice;

public class SingletonExample {
    public static void main(String[] args) {
        SingletonTest singletonTest = SingletonTest.getInstance();
        // SingletonTest singletonTest = new SingletonTest(); doesnt allow to create new object as constructor is private
        singletonTest.showMessage();
    }
}

class SingletonTest {
    private static SingletonTest INSTANCE ;
    public SingletonTest(){
        System.out.println("Private Constructor");
    };

    public static SingletonTest getInstance(){
        if (INSTANCE == null){
            return new SingletonTest();
        } else {
            return INSTANCE;
        }
    }
    public void showMessage() {
        System.out.println("Hello ! I am creating a new instance of SingletonTest");
    }
}
