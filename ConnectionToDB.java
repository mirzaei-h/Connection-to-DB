import java.sql.*;

public class ConnectionManager {


    private static String driver = "com.mysql.jdbc.Driver";
    private static String url = "jdbc:mysql://localhost:3306/firstdb";
    private static String username = "root";
    private static String password = "password";


    public static void main(String[] args) {

        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement( );
            ResultSet resultSet= statement.executeQuery("select * from city");

            while (resultSet.next()) {
                System.out.println( resultSet.getString("name"));

            }
        } catch (SQLException e) {
            System.out.println("Oops, error!");
            throw new RuntimeException(e);
        }
    }
}