package by.belhard.j2.lesson5;

public class Worker extends Person{


    public void exampleMethod(){
        System.out.println("this.a="+ this.a + "super.a = " +super.a);}

        @Override
        public void doWork(){

            System.out.println("umeiu");
        }


}
