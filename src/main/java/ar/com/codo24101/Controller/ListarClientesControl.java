package ar.com.codo24101.Controller;

import java.util.ArrayList;

import ar.com.codo24101.Dominio.Cliente;
import ar.com.codo24101.Service.ClienteService;

public class ListarClientesControl {

    public static void main(String[] args) {
        
        ClienteService service = new ClienteService();

        ArrayList<Cliente> listado = service.listarClientes();
        
        System.out.println(listado);
    }
}
