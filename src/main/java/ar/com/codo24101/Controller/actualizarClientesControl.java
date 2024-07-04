package ar.com.codo24101.Controller;


import ar.com.codo24101.Dominio.Cliente;
import ar.com.codo24101.Service.ClienteService;

public class actualizarClientesControl {
    public static void main(String[] args) {

      
        ClienteService service = new ClienteService();

        Cliente cliente = service.listarClientes().get(0);
        System.out.println(" Datos originales del cliente");
        System.out.println(cliente);

        cliente.setNombre("Maria Celeste");
        cliente.setApellido("Blestcher Villalba");
        cliente.setDni("33068762");
        cliente.setMail("celestebv@gmail.com");

        service.actualizar(cliente);
        

        System.out.println("Datos actualizados del Cliente");

        System.out.println(cliente);



    }

}
