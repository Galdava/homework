package by.belhard.j2.homework4;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Banking {

    private static final String DRIVER_NAME = "com.mysql.cj.jdbc.Driver";
    private static final String USER = "root";
    private static final String PASSWORD = "root";
    private static final String URL =
            "jdbc:mysql://localhost:3306/company?serverTimezone=UTC";

//    public static void main(String[] args) {

//        try {
//            Class.forName(DRIVER_NAME);
//        } catch (ClassNotFoundException e) {
//            System.err.println(DRIVER_NAME + " loading failure");
//            return;
//        }

        Connection connection;
        List<Account> accs = new ArrayList<>();

        try {
        connection = DriverManager.getConnection(URL, USER, PASSWORD);

        Statement statement = connection.createStatement();

//            statement.execute("insert into employees values (null, 'Bruce', null, 150, current_date)");
            /*int result = statement.executeUpdate("delete from employees where name = 'Bruce'");
            System.out.println(result + " row(s) affected");*/
        String query = "select * from employees e " +
                "left join specialties s on (e.specialty_id = s.id);";
        ResultSet resultSet = statement.executeQuery(query);

        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            int pass = resultSet.getInt("pass");
            // String specialty = resultSet.getString("specialty");
            int money = resultSet.getInt("money");
            //  java.util.Date date = resultSet.getDate("date_of_employment");

            Account acc = new Account(id, name,pass, money);
            accs.add(acc);
                /*System.out.printf("%-2d) %-10s %-10s %5d  %5$td/%5$tm/%5$tY\n",                        id, name, specialty, salary, date);*/
        }

//            query = "update employees set (salary = salary + ?) where salary < ?;";
        PreparedStatement preparedStatement = connection
                .prepareStatement("update account set money = money + ? where name = ?;");

        int delta = 100;
        String nameIn = "Victor";

        preparedStatement.setInt(1, delta);
        preparedStatement.setString(2, nameIn);

        preparedStatement.execute();

    } catch (SQLException e) {
        e.printStackTrace();
    }

        accs.forEach(System.out::print);

//    }
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


}



