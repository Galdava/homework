package by.belhard.j2.lesson8.l3;

import javax.xml.bind.SchemaOutputResolver;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String inputString;
        System.out.println("enter string");
        while (!(inputString = reader.readLine()).equals("exit")) {
            System.out.println(inputString.toUpperCase());
            System.out.println("enter string");


        }


        System.out.println("bye bye");
    }
}
