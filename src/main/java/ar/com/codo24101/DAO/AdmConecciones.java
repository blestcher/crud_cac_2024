
package ar.com.codo24101.DAO;
import java.sql.Connection;
import java.sql.DriverManager;



public class AdmConecciones {

 public static Connection conectar(){
    String url = "jdbc:mysql://localhost:3306/24101?serverTimeZone=UTC&userSSL=false"; //poner nombre de Base de Datos
    String user = "root";
    String password = "root"; 
    String driver = "com.mysql.cj.jdbc.Driver" ;

    Connection con = null;
    try {
        Class.forName(driver);
        con = DriverManager.getConnection(url, user, password);
    } catch (Exception e) {
        System.err.println(e);
    }
    return con;
 }

 public static void desconectar(Connection desconectar){
    try {
        desconectar.close();
    } catch (Exception e) {
       System.out.println(e);
    }

 }



}
