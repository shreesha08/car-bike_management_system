
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Connect {
    java.sql.Connection conn;
    public static java.sql.Connection ConnecrDb(){
        
    
try
{
    Class.forName("com.mysql.cj.jdbc.Driver");
    
java.sql.Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3308/car_bike_rental","root","");

return cn;

}catch(Exception e)
{
JOptionPane.showMessageDialog(null, e);
return null;

}

}
}


