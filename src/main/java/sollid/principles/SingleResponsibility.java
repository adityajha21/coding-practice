package sollid.principles;

public class SingleResponsibility {
    // class should have one reason to changes with single responsibility
    int quantity ;
    int price;

    SingleResponsibility(int quantity, int price) {
        this.quantity = quantity;
        this.price = price;
    }
    public int calculatePrice(int price, int quantity) {
        return  price * quantity;
    }
}
 class SingleResponsibilityMain {
     public static void main(String[] args) {
         SingleResponsibility singleResponsibility = new SingleResponsibility(10,11);
         System.out.println(singleResponsibility.calculatePrice(10, 5));

     }
 }