package ar.com.codo24101.Service;


import java.util.ArrayList;

import ar.com.codo24101.ClienteDTO.ClienteDTO;
import ar.com.codo24101.DAO.ClienteDao;
import ar.com.codo24101.DAO.ClienteJdbcMysqlImpl;
import ar.com.codo24101.Dominio.Cliente;

public class ClienteService {

private ClienteDao dao;

public ClienteService(){
    this.dao = new ClienteJdbcMysqlImpl();

}

public Cliente obtener(long id) {
   return this.dao.getById(id);
}

public void crear(ClienteDTO dto) {

    Cliente cliente = new Cliente(dto.getNombre(), dto.getApellido(),dto.getDni(),dto.getMail());
    this.dao.create(cliente);
     //salta error x el tipo de dato DTO, el metodo create recibe tipo cliente
}

public ArrayList<Cliente> listarClientes() {
    
    return this.dao.findAll();
}

public void actualizar(Cliente dto) {
    Cliente cliente= new Cliente(dto.getId(),dto.getNombre(), dto.getApellido(),dto.getDni(),dto.getMail());
    this.dao.update(cliente);   
   
    
}

public void eliminarCliente(Long id){
    this.dao.delete(id);

}


}
