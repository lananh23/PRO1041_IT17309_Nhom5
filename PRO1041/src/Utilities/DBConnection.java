package Utilities;

import java.sql.*;

public class DBConnection {
    private static Connection con;
    public static Connection getConnection(){
        if(con == null){
            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                String dbUser = "sa", dbPass = "caohieu",
                        dbUrl = "jdbc:sqlserver://localhost:1433;"
                            +"databaseName=QuanLyCHTapHoa;"
                            +"encrypt=true;trustServerCertificate=true;sslProtocol=TLSv1.2";
                con = DriverManager.getConnection(dbUrl, dbUser, dbPass);
                System.out.println("Kết nối thành công");
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            
        }
        return con;
    }
    public static void main(String[] args) {
        getConnection();
    }
}
