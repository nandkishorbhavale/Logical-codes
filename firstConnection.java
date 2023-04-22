//JDBC Connection.
import java.sql.*;

public class firstConnection {
    public static void main(String[] args) {
        try {
            Class.forName(com.mysql.jdbc.Driver);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
