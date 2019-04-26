package by.belhard.j2.lesson8.l4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("example.data"));
        int sum1 =0;
        int sum2 =0;
        int sum3 =0;
        int sum4 =0;
        double sum5 =0;

        String[] line;
        while (scanner.hasNextLine()) {
            line = scanner.nextLine().split(" ");
            sum1 +=Integer.parseInt(line[0]);
            sum2 +=Integer.parseInt(line[1]);
            sum3 +=Integer.parseInt(line[2]);
            sum4 +=Integer.parseInt(line[3]);
            sum5 +=Double.parseDouble(line[4]);

        }


    }
}
