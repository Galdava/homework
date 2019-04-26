package by.belhard.j2.lesson8;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        String pathInput = "example.data";
        String pathOutput = "exampleOut.data";
//        File nonExistFile = new File("nonExist.ex");
//        nonExistFile.createNewFile();
        File fileInput = new File(pathInput);
        File fileOutput = new File(pathOutput);
        System.out.println(fileInput.getParent());
        InputStream inputStream = new FileInputStream(fileInput);
        OutputStream outputStream = new FileOutputStream(fileOutput);
        int read;
        while ((read = inputStream.read())!=-1){
           outputStream.write(read + 1);

        }
        outputStream.flush();
        System.out.println("\nend of stream");


    }

}
