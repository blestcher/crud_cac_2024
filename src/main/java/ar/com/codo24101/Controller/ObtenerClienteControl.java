package ar.com.codo24101.Controller;

import ar.com.codo24101.Dominio.Cliente;
import ar.com.codo24101.Service.ClienteService;


public class ObtenerClienteControl {
public static void main(String[] args) {
    

    Long idCliente = 3l;

    ClienteService service = new ClienteService();

    Cliente cliente = service.obtener(idCliente); //me devuelve un cliente

    // mostarar el cliente
    System.out.println(cliente);

    
}

}
