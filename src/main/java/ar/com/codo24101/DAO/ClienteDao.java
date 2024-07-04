package ar.com.codo24101.DAO;



import java.util.ArrayList;

import ar.com.codo24101.Dominio.Cliente;

public interface ClienteDao {

    public Cliente getById(long id);

    public void create(Cliente cliente);

    public ArrayList<Cliente> findAll();

    public void update(Cliente cliente);

    public void delete(long id);



}
