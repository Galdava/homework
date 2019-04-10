package by.belhard.j2.homework1;

public class Home4 {
    public static void main(String[] args) {
        for (int x= 1; x<10;x++) {
            for (int y= 1; y<10; y++){
                if (x==1 && y==1){
                    System.out.println("   ");
                    continue;
                }
                System.out.printf("%4d",y*x );
            }
            System.out.println();



        }






    }
}
