package core.java.pratice;

public class SingletonExample {
    public static void main(String[] args) {
        SingletonTest singletonTest = SingletonTest.getInstance();
        singletonTest.showMessage();
    }
}

class SingletonTest {
    private static SingletonTest INSTANCE ;
    private SingletonTest(){};

    public static SingletonTest getInstance(){
        if(INSTANCE == null){
            return new SingletonTest();
        } else {
            return INSTANCE;
        }
    }
    public void showMessage() {
        System.out.println("Hello ! I am creating a new instance of SingletonTest");
    }
}
