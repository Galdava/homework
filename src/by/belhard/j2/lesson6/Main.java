package by.belhard.j2.lesson6;

import java.util.*;

public class Main {
    public static void main(String[] args) {
       /* List<String> list = new LinkedList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add(1, "one and half");
        boolean contains = list.contains("two");
        list.set(3,"five");
        list.remove("two");
        list.add("one");
        list.add("one");
        list.add("one");
        list.add("one");



        System.out.println(list);
        System.out.println(list.size() + " " + list.isEmpty());
        System.out.println("contains 'two' : " + contains);*/

        Set<String> set = new HashSet<>();
        set.add("one");
        set.add("two");
        set.add("three");
        set.add("three");
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()){
            String next = iterator.next();
            if (next.equals("two"));
                iterator.remove();

        }
        System.out.println(set);

    }
}
