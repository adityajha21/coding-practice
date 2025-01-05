package java8;

@FunctionalInterface
public interface CustomFunctionalInterface {

    int calculate(int a, int b);

    static int addition(int a, int b) {
        return a+b;
    }
}

class Calculator  {

   public static void main(String[] args) {
       int sum = CustomFunctionalInterface.addition(2,3);
       System.out.println(sum);
       CustomFunctionalInterface cd = (a, b) ->  (a + b );
       int result = cd.calculate(1,2);
       System.out.println(result);
   }

}
