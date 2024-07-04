package ar.com.codo24101.Controller;

import ar.com.codo24101.Service.ClienteService;




public class eliminarClienteControl {

    public static void main(String[] args) {

    Long id = 2L;

    ClienteService servicio = new ClienteService();
    
    servicio.eliminarCliente(id);


    }
    

}
