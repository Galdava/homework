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
                    .prepareStatement("update account set money = money + ? where id = ?;");
            preparedStatement.setInt(2, x);
            preparedStatement.setDouble(1, y);
            preparedStatement.executeUpdate();

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

    public void transfer(int a, int b, double y) {
        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            preparedStatement = connection
                    .prepareStatement("update account set money = money - ? where id = ?;");
            preparedStatement.setInt(2, a);
            preparedStatement.setDouble(1, y);
            preparedStatement.executeUpdate();
            preparedStatement = connection
                    .prepareStatement("update account set money = money + ? where id = ?;");
            preparedStatement.setInt(2, b);

            preparedStatement.setDouble(1, y);
            preparedStatement.executeUpdate();

            preparedStatement = connection
                    .prepareStatement("select * from account  where id = ?;");
            preparedStatement.setInt(1, a);
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
    public Integer checkMoney(int id){
        int cash = -1;
        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            preparedStatement = connection
                    .prepareStatement("select money from account  where id = ?;");
            preparedStatement.setInt(1, id);
            resultSet = preparedStatement.executeQuery();

            resultSet.next();
            cash = resultSet.getInt("money");


        } catch (SQLException e) {
            e.printStackTrace();
        }
        return cash;

    }
}
