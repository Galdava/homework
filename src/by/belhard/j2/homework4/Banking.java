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


    }
    public void addBalance(int x, double y){
        Account i = accs.get(x);
        double a = accs.get(x).getMoney();
        double sum = a + y;
        accs.put(x,i);
//        System.out.println();


    }
    public void minusBalance(int x, double y){

    }
    public void transfer (int a, int b, double x){

    }

    public void addAcc(int name, int pass, double money) {
        this.addAcc(new Account(name, pass, money));
    }


}



