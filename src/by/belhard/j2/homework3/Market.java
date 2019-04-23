package by.belhard.j2.homework3;


import java.util.HashMap;
import java.util.Map;

public class Market {
    public static void main(String[] args) {
        Map<String,Product> product = new HashMap<>();
        product.put("prod1",new Prod("prod1",10));
        product.put("prom1",new Prom("prom1",20));
        product.put("forA1",new ForAnimals("forA1",15));
        product.put("prod2",new Prod("prod2",30));

    }
}
