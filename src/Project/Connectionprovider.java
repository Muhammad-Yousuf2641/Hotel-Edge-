package Project;
import java.sql.*;

public class Connectionprovider {
    public static Connection getCon() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/hostel?zeroDateTimeBehavior=CONVERT_TO_NULL",
                "root",
                "Vvbs@2026"
            );
            return con;
        } 
        catch (Exception e) {
            e.printStackTrace();  // Print error details if connection fails
            return null;
        }
    }

    // Test main method to check connection
    public static void main(String[] args) {
        Connection con = getCon();
        if (con != null) {
            System.out.println("Connection Successful!");
            try {
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Connection Failed!");
        }
    }
}
