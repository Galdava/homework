package by.belhard.j2.lesson8.l2;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        String input = "example.data";
        String output = "exampleOut.data";
        BufferedReader reader = new BufferedReader(new FileReader(input));
        BufferedWriter writer = new BufferedWriter(new FileWriter(output));
        StringBuilder s = new StringBuilder();
        while (reader.ready()) {
            s.append("line: ").append(reader.readLine()).append("\n");

        }
        System.out.println();
        writer.write(s.toString());
        writer.flush();
    }
}
