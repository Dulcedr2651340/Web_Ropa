package DB;

import java.sql.Connection;
import java.sql.DriverManager;


public class Conexion {
    
 public static Connection SQLServer() throws Exception
    {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String url="jdbc:sqlserver://localhost:1433;databaseName=Prenda;";
        
        return DriverManager.getConnection(url,"Dulce","123");
    }
    
}