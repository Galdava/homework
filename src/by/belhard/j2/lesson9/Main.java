package by.belhard.j2.lesson9;

public class Main {
    public static void main(String[] args) {
        try {
            throwFirst();
            throwSecond();
        } catch (Exception2 exc) {
            exc.printStackTrace();
            System.out.println("exc2");
        } catch (Exception1 e) {
            System.out.println("exc1");
        } catch (RuntimeException e) {
            System.out.println("runtime");

        } catch (Exception e) {
            System.out.println("exception");
        } finally {
            System.out.println("final");

        }try{
            throwSecond();
        }finally {
            System.out.println("finally second");

        }
    }

    public static void throwFirst() {
        throw new Exception1();
    }

    public static void throwSecond() {
        throw new Exception2();
    }
}



