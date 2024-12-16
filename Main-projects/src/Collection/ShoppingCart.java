package Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ShoppingCart {
        private Map<String, Double> cart;
        public ShoppingCart(){
            cart=new HashMap<>();
        }
        public void addProduct(String productName,double productPrice){
            cart.put(productName,productPrice);
        }
        public void displayCart() {
            if (cart.isEmpty()) {
                System.out.println("THE CART IS EMPTY");
            } else {
                for (Map.Entry<String, Double> product : cart.entrySet()) {
                    System.out.println(product);
                }
            }
        }
        public double cartTotal(){
            double total=0.0;
            for(double price: cart.values()){
                total+=price;
            }
                return total;
            }
                public boolean productAvailability(String productName){
                return cart.containsKey(productName);
            }
            public static void main(String[]args){
            Scanner sc=new Scanner(System.in);
            ShoppingCart cart=new ShoppingCart();
            cart.addProduct("laptop",800000);
            cart.addProduct("headphone",10000);
            cart.addProduct("pc",1000000);
            cart.addProduct("keyboard",2000);
            cart.displayCart();
            System.out.println("total amount is:"+cart.cartTotal());
            System.out.println("Enter a product to check:");
            String name=sc.nextLine();
            if(cart.productAvailability(name)){
                System.out.println("The product is added");
            }
            else
            {
                System.out.println("Product not available");
            }
        }
    }