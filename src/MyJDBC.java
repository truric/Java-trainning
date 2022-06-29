import java.sql.*;

public class MyJDBC {
    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/market", "admin", "4564");
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from product");
        while (resultSet.next()){
            System.out.println("Name: " + resultSet.getString("Name") + "\nPrice: " +
                    resultSet.getString("Price") + "\nQuantity: " +
                    resultSet.getString("Quantity") + "\n");
        }
    }
}
