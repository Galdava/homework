package by.belhard.j2.homework4;

import java.util.HashMap;
import java.util.Map;

public class Banking {
    public Map<Integer, Account> accs = new HashMap<>();

    public void checkAcc(int x) {
        Account a = accs.get(x);
        System.out.println(a);

    }

    public Integer checkPass(int x) {
        int a = accs.get(x).getPass();
        return a;


    }

    public void addAcc(Account account) {
        accs.put(account.getName(), account);


    }public void addAcc(int name, int pass, double money) {
        this.addAcc(new Account(name, pass, money));
    }


//
//    public void minusBalance(int x, double y){
//        int name1 = accs.get(x).getName();
//        int pass1 = accs.get(x).getPass();
//        double a = accs.get(x).getMoney();
//        double sum = a - y;
//        addAcc(name1,pass1,sum);
//        Account i = accs.get(x);
//        System.out.println(i);

//    }
    public void transfer (int a, int b, double y){
        int name1 = accs.get(a).getName();
        int pass1 = accs.get(a).getPass();
        double s = accs.get(a).getMoney();
        int name2 = accs.get(b).getName();
        int pass2 = accs.get(b).getName();
        double s2 = accs.get(b).getMoney();
        double sum = s - y;
        double sum2 = s2 +y;
        addAcc(name1,pass1,sum);
        addAcc(name2,pass2,sum2);
        Account i = accs.get(a);
        System.out.println(i);
//        Account i2 = accs.get(b);
//        System.out.println(i+"\n"+ i2);

    }


    public void addBalance(int x, double y){
        int name1 = accs.get(x).getName();
        int pass1 = accs.get(x).getPass();
        double a = accs.get(x).getMoney();
        double sum = a + y;
        addAcc(name1,pass1,sum);
        Account i = accs.get(x);
        System.out.println(i);

    }


}



