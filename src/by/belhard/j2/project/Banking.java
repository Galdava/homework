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
    List<Account> accs = new ArrayList<>();


    public void checkAcc(int x) {
        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);


            PreparedStatement preparedStatement = connection
                    .prepareStatement("select * from account  where id = ?;");

            int delta = x;
            preparedStatement.setInt(1, delta);
            Account a = accs.get(x);

            System.out.println(a);


        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

    public Integer checkPass(int id) {
        int pass =-1;
        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement preparedStatement = connection
                    .prepareStatement("select pass from account  where id = ?;");
//            String query = "select pass from account  where id = ?;";
            preparedStatement.setInt(1,id);
            ResultSet resultSet = preparedStatement.executeQuery();

            resultSet.next();
            pass = resultSet.getInt("pass");


        } catch (SQLException e) {
            e.printStackTrace();
        }return pass;

    }
}
