package by.belhard.j2.homework3;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Market {
    public static void main(String[] args) {
        Map<String,Product> product = new HashMap<>();
        product.put("prod1",new Prod("prod1",10));
        product.put("prom1",new Prom("prom1",20));
        product.put("forA1",new ForAnimals("forA1",15));
        product.put("prod2",new Prod("prod2",30));





        Map<String,Product> cart =new HashMap<>();
        cart.put("cart1" ,product.get("prom1"));
        cart.put("cart2",product.get("prom1"));
        cart.put("cart3",product.get("prod1"));
        System.out.println(cart.values());
        for (Map.Entry<String,Product> entry: cart.entrySet())
            System.out.println(entry.getValue());
        Iterator  <Map.Entry<String ,Product> > itr = cart.entrySet().iterator();
            while (itr.hasNext())
                System.out.println("Full price="+(itr.next().getValue().getPrice()+ itr.next().getValue().getPrice()));











    }



}
