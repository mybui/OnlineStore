/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MimiHMB
 */
import java.util.Map;
import java.util.HashMap;

public class ShoppingCart {
    private Map<String, Item> list;
    
    public ShoppingCart() {
        this.list = new HashMap<>();
    }
    
    public void add(String product, int price) {
        if (!(this.list.keySet().contains(product))) {
            this.list.put(product, new Item(product, 1, price));
        } else {
            this.list.get(product).increaseQuantity();
        }
    }
    
    public int price() {
        int sum = 0;
        for (Item i: this.list.values()) {
            sum += i.price();
        }
        return sum;
    }
    
    public void print() {
        for (Item i: this.list.values()) {
            System.out.println(i);
        }
    }
}
