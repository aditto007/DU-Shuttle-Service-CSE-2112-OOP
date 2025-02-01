
package du.shuttle.service;
import java.sql.*;

public class Conn {
    Connection c;
    Statement s;
    public Conn(){
    try{
       
        c=DriverManager.getConnection("jdbc:mysql:///dusuttleservice", "root","antu1234");
        s=c.createStatement();
        
    } catch(Exception e){
        System.out.println(e);
    }
        
    }
}
