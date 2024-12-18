package SteamAPI;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class ShoppingCart {
    private Map<String, Double> cart = new HashMap<>();

    public void addProduct(String productName, Double price) {
        cart.put(productName, price);
    }

    public String removeProduct(String productName) {
        cart.remove(productName);
        return productName+"is removed";
    }

    public void getAllProduct() {
        System.out.println(" Products in cart:");
        cart.forEach((productName, price) -> System.out.println("Product: " + productName + "  Price: " + price));
    }

    public double totalPrice() {
        return cart.values().stream().mapToDouble(Double::doubleValue).sum();
    }

    public String findProductName(double price) {
        for (Map.Entry<String, Double> entry : cart.entrySet()) {
            if (entry.getValue() == price) {
                return entry.getKey();
            }
        }
        return "no product with price:" + price;
    }

    public double findProductPrice(String productName) {
        for (Map.Entry<String, Double> entry : cart.entrySet()) {
            if (Objects.equals(entry.getKey(), productName)) {
                return entry.getValue();
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addProduct("apple", 100.5);
        shoppingCart.addProduct("orange", 150.40);
        shoppingCart.addProduct("strawberry", 200.30);
        shoppingCart.addProduct("kiwi", 170.90);
        shoppingCart.addProduct("papaya", 180.0);
        shoppingCart.getAllProduct();
        System.out.println("Total amount:"+shoppingCart.totalPrice());
        String product=shoppingCart.findProductName(150.40);
        System.out.println(product+" is the product with amount "+150.40);
        double price=shoppingCart.findProductPrice("strawberry");
        if(price==-1){
            System.out.println("no product found");
        }
        else{
            System.out.println("Strawberry is "+price);
        }
        shoppingCart.removeProduct("apple");
        System.out.println("UPDATED CART:");
        shoppingCart.getAllProduct();
    }
}


