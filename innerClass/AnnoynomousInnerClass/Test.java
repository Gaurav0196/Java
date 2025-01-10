package innerClass.AnnoynomousInnerClass;

public class Test {

    public static void main(String[] args){
        ShoppingCart shoppingCart=new ShoppingCart(150);
        shoppingCart.processPayment(new Payment() {
            @Override
            public void pay(Double amount) {
                System.out.println("Paid " + amount + " using Credit Card");
            }
        }); // Here we created object of implementation class without creating implementation class
//to do this we need tto create a new class which implement payment method  and pass instance of that class.

//BUt by using anonymous inner class we can avoid this

        shoppingCart.processPayment(new Payment() {
            @Override
            public void pay(Double amount) {
                System.out.println("Paid " + amount + " using Debit Card");
            }
        });
    }
}
