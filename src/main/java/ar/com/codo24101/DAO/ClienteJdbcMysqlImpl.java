package ar.com.codo24101.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import ar.com.codo24101.Dominio.Cliente;

public class ClienteJdbcMysqlImpl implements ClienteDao {

    
    public Cliente getById(long id) {
        String sql = "SELECT * FROM cliente WHERE id = "+id;
        Cliente cliente = null;
        Connection conexion = null;

        try {
            
            conexion = AdmConecciones.conectar();
            PreparedStatement statement = conexion.prepareStatement(sql);
            ResultSet resultset = statement.executeQuery();
            if (resultset.next()) {
                Long clienteid = resultset.getLong(1);
                String nombre = resultset.getString(2);
                String apellido = resultset.getString(3);
                String dni = resultset.getString(4);
                String mail = resultset.getString(5);

                cliente = new Cliente(clienteid, nombre, apellido,dni,mail);
            }
            
        } catch (Exception e) {
           System.err.println(e);;
        } finally{
            AdmConecciones.desconectar(conexion);
        }
        return cliente;
    }
    // metodo insert

    
    public void create(Cliente cliente) {
       String sql = "INSERT INTO Cliente(nombre,apellido,dni,mail) values (?,?,?,?)";
       Connection conexion = AdmConecciones.conectar();
       try {
        PreparedStatement pst = conexion.prepareStatement(sql);
        pst.setString(1, cliente.getNombre());
        pst.setString(2, cliente.getApellido());
        pst.setString(3, cliente.getDni());
        pst.setString(4, cliente.getMail());
        pst.executeUpdate();
        if (pst.getUpdateCount() > 0) {
            System.out.println("Insert Ok");
        }
        
       } catch (Exception e) {
        e.printStackTrace();
       } finally {
        AdmConecciones.desconectar(conexion);
       }
    }


   
    public ArrayList<Cliente>findAll() {
        String sql = "SELECT * FROM cliente";
        ArrayList<Cliente> clientes = new ArrayList<>();
        Connection conexion = null;


        try {
            
            conexion = AdmConecciones.conectar();
            PreparedStatement statement = conexion.prepareStatement(sql);
            ResultSet resultset = statement.executeQuery();
            while (resultset.next()) {
                Long clienteid = resultset.getLong(1);
                String nombre = resultset.getString(2);
                String apellido = resultset.getString(3);
                String dni = resultset.getString(4);
                String mail = resultset.getString(5);

                Cliente cliente = new Cliente(clienteid, nombre, apellido,dni,mail);
                clientes.add(cliente);
            }
            
        } catch (Exception e) {
           System.err.println(e);;
        } finally{
            AdmConecciones.desconectar(conexion);
        }
        return clientes;
    }


   

    public void update(Cliente cliente) {
        String sql = "UPDATE cliente set (nombre,apellido,dni,mail) values(?,?,?,?) where id = ?";
        Connection conexion = AdmConecciones.conectar();
        try {
         PreparedStatement pst = conexion.prepareStatement(sql);
         pst.setString(1, cliente.getNombre());
         pst.setString(2, cliente.getApellido());
         pst.setString(3, cliente.getDni());
         pst.setString(4, cliente.getMail());
         pst.setLong(5,cliente.getId());
         pst.executeUpdate();
         if (pst.getUpdateCount() > 0) {
             System.out.println("Update Ok");
         }
         
        } catch (Exception e) {
         e.printStackTrace();
        } finally {
         AdmConecciones.desconectar(conexion);
        }  
        
    }

    

    public void delete(long id) {
        String sql = "DELETE FROM cliente WHERE id = ?";
        Connection conexion = null;
        
        try {
            
            conexion = AdmConecciones.conectar();
            PreparedStatement statement = conexion.prepareStatement(sql);
            statement.setLong(1,id);
            if (statement.executeUpdate()>0) {
                System.out.println("Registro eliminado");
            }
            
        } catch (Exception e) {
           System.err.println(e);;
        } finally{
            AdmConecciones.desconectar(conexion);
        }
        
    }



  


}
