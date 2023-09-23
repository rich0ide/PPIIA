
package II_PARCIAL;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    Connection con;
    public Conexion(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdnegocio", "root", "");
        }catch(Exception e){
            System.err.println("Nel, no sirve tu conexión: "+ e);
        }
    }
    public Connection gertConnection(){
        return con;
    }
}
