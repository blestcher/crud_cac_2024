package ar.com.codo24101.Controller;

import ar.com.codo24101.ClienteDTO.ClienteDTO;

import ar.com.codo24101.Service.ClienteService;

public class CrearClienteControl {

    public static void main(String[] args) {
        String nombre = "Ana Ines";
        String apellido = "Amavet";
        String dni = "30527342";
        String mail = "anaines@gmail.com";

        ClienteDTO cliente = new ClienteDTO(nombre,apellido,dni, mail);

        ClienteService service = new ClienteService();

        service.crear(cliente);

        System.out.println(cliente);


    }

    
    
}
