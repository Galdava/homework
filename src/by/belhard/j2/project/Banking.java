package by.belhard.j2.project;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Banking {
    private static final String DRIVER_NAME = "com.mysql.cj.jdbc.Driver";
    private static final String USER = "root";
    private static final String PASSWORD = "root";
    private static final String URL =
            "jdbc:mysql://localhost:3306/bank?serverTimezone=UTC";


    Connection connection;
    PreparedStatement preparedStatement;
    ResultSet resultSet;
    List<Account> accs = new ArrayList<>();


    public void checkAcc(int x) {
        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            preparedStatement = connection
                    .prepareStatement("select * from account  where id = ?;");
            preparedStatement.setInt(1, x);
            resultSet = preparedStatement.executeQuery();
            resultSet.next();

            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");

            double money = resultSet.getDouble("money");


            Account acc = new Account(id, name, money);
            System.out.println(acc);


        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

    public Integer checkPass(int id) {
        int pass = -1;
        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            preparedStatement = connection
                    .prepareStatement("select pass from account  where id = ?;");
//            String query = "select pass from account  where id = ?;";
            preparedStatement.setInt(1, id);
            resultSet = preparedStatement.executeQuery();

            resultSet.next();
            pass = resultSet.getInt("pass");


        } catch (SQLException e) {
            e.printStackTrace();
        }
        return pass;

    }

    public void addBalance(int x, double y) {
        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            preparedStatement = connection
                    .prepareStatement("update account (set money = money + ?) where id = ?;");
//            String query = "select pass from account  where id = ?;";
            preparedStatement.setInt(2, x);
            preparedStatement.setDouble(1, y);
//            preparedStatement = connection
//                    .prepareStatement("select * from account  where id = ?;");
//            preparedStatement.setInt(1, x);
//            resultSet = preparedStatement.executeQuery();
//
//            resultSet.next();
//            int id = resultSet.getInt("id");
//            String name = resultSet.getString("name");
//
//            double money = resultSet.getDouble("money");
//
//
//            Account acc = new Account(id, name, money);
//            System.out.println(acc);


        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

    public void transfer(int a, int b, double y) {
        System.out.println("poka ne sdelal");
//        int name1 = accs.get(a).getName();
//        int pass1 = accs.get(a).getPass();
//        double s = accs.get(a).getMoney();
//        int name2 = accs.get(b).getName();
//        int pass2 = accs.get(b).getName();
//        double s2 = accs.get(b).getMoney();
//        double sum = s - y;
//        double sum2 = s2 + y;
//        addAcc(name1, pass1, sum);
//        addAcc(name2, pass2, sum2);
//        Account i = accs.get(a);
//        System.out.println(i);
////        Account i2 = accs.get(b);
////        System.out.println(i+"\n"+ i2);

    }
}
