package by.belhard.j2.homework3;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Market {
    private Map<String,Product> product = new HashMap<>();
    private Map<String,Product> cart = new HashMap<>();

    public Map<String, Product> getProduct() {
        return product;
    }

    public Map<String, Product> getCart() {
        return cart;
    }



}
    //    public void AddToP(String name, Product product,) {
//        Map<String, Product> product = new HashMap<>();
//        product.put("name", new Prod("name", x));
////        product.put("prod1", new Prod("prod1", 10));
////        product.put("prom1", new Prom("prom1", 20));
////        product.put("forA1", new ForAnimals("forA1", 15));
////        product.put("prod2", new Prod("prod2", 30));
//    }
//
//    public void AddToCart(){
//        Map<String, Product> cart = new HashMap<>();
//        cart.put("cart1", product.get("prom1"));
//        cart.put("cart2", product.get("prom1"));
//        cart.put("cart3", product.get("prod1"));
//        System.out.println(cart.values());
//        double sum = 0;
//        for (Map.Entry<String, Product> entry : cart.entrySet())
//            sum += entry.getValue().getPrice();
//        System.out.println("Full Price=" + sum);


//        Iterator  <Map.Entry<String ,Product> > itr = cart.entrySet().iterator();
//            while (itr.hasNext())
//                System.out.println("Full price="+(itr.next().getValue().getPrice()+ itr.next().getValue().getPrice()));


   // }


//}
