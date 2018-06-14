
package tabelacopa;

import java.sql.SQLException; 
import java.sql.Connection;  
import java.sql.DriverManager; 

public class ConnectionFactory {

    public static Connection getConnection() throws SQLException, ClassNotFoundException{
        
        String url     = "jdbc:postgresql://localhost:5432/TabelaCopa";  
        String usuario = "postgres";  
        String senha   = "023570";
        
        Class.forName("org.postgresql.Driver");
        return DriverManager.getConnection(url, usuario, senha);
    }
}
