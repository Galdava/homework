package by.belhard.j2.homework3;


import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Market x = new Market();
        Map<String,Product > product =x.getProduct();

        product.put("prod1", new Prod("prod1", 10));
        product.put("prom1", new Prom("prom1", 20));
        product.put("forA1", new ForAnimals("forA1", 15));
        product.put("prod2", new Prod("prod2", 30));

        Map<String, Product> cart = x.getCart();

        cart.put("cart1", product.get("prom1"));
        cart.put("cart2", product.get("prom1"));
        cart.put("cart3", product.get("prod1"));
        System.out.println(cart.values());
        double sum = 0;
        for (Map.Entry<String, Product> entry : cart.entrySet())
            sum += entry.getValue().getPrice();
        System.out.println("Full Price=" + sum);

//        product.put("prod1", new Prod("prod1", 10));
//        product.put("prom1", new Prom("prom1", 20));
//        product.put("forA1", new ForAnimals("forA1", 15));
//        product.put("prod2", new Prod("prod2", 30));
    }
//    Market x = new Market();
//    public void addTo(){
//        HashMap<String,Product> product =x.getProduct();
//        product.put("prod1", new Prod("prod1", 10));
//        product.put("prom1", new Prom("prom1", 20));
//        product.put("forA1", new ForAnimals("forA1", 15));
//        product.put("prod2", new Prod("prod2", 30));
//
//        HashMap<String, Product> cart = x.getCart();
//
//        cart.put("cart1", product.get("prom1"));
//        cart.put("cart2", product.get("prom1"));
//        cart.put("cart3", product.get("prod1"));
//        System.out.println(cart.values());






    //}




}
