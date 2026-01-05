
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBC {
    public static void main(String[] args) {
        String jdbcURL = "jdbc:mysql://localhost:3306/test";
        String username = "root"; 
        String password = ""; 


        Connection connection = null;
        Statement statement = null;

        try {
            // 1. Register JDBC driver (optional for modern drivers)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. Open a connection
            System.out.println("Connecting to database...");
            connection = DriverManager.getConnection(jdbcURL, username, password);
            System.out.println("Connected to database successfully!");

            // 3. Execute a query
            System.out.println("Creating statement...");
            statement = connection.createStatement();
            String sql = "SELECT sid, sname FROM student";
            ResultSet resultSet = statement.executeQuery(sql);

            // 4. Extract data from result set
            System.out.println("Student Records:");
            while (resultSet.next()) {
                // Retrieve data by column name
                int id = resultSet.getInt("sid");
                String name = resultSet.getString("sname");

                // Display values
                System.out.println("ID: " + id + ", Name: " + name);
            }

            // 5. Clean-up environment
            resultSet.close();
            statement.close();
            connection.close();
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            // Ensure resources are closed
            try {
                if (statement != null) statement.close();
                if (connection != null) connection.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
}
