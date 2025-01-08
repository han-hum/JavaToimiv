package week8;

import java.util.HashMap;
import java.util.Map;

public class ShoppingBasket {
    private Map<String, Purchase> purchases;

    public ShoppingBasket() {
        purchases = new HashMap<String, Purchase>();
    }

    public void add(String product, int price) {
        Purchase purchase = new Purchase(product, 1, price);
        if(this.purchases.containsKey(product)){
            this.purchases.get(product).increaseAmount();
        } else {
            this.purchases.put(product, purchase);
        }
    }

    public int price(){
        int price = 0;
        for (Purchase purchase: this.purchases.values()) {
            price += purchase.price();
        }
        return price;
    }

    public void print(){
        for (Purchase purchase: this.purchases.values()) {
            System.out.println(purchase);
        }
    }
}