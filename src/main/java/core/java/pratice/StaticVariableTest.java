package core.java.pratice;

public class StaticVariableTest {
    static int count =0;  //Static variable shared by all instances

    StaticVariableTest(){
        count++;
    }

    void display() {
        System.out.println(count);
    }

     public static void main(String[] args) {

        StaticVariableTest test = new StaticVariableTest();
         test.display();
        StaticVariableTest test2 = new StaticVariableTest();
        test2.display();

        // StaticVariableTest.display();

     }
}
