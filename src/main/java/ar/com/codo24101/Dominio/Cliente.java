package ar.com.codo24101.Dominio;

public class Cliente {
  private long id;
  private String nombre;
  private String apellido;
  private String dni;
  private String mail;
  
public Cliente() {
}


public Cliente(String nombre, String apellido, String dni, String mail) {
    this.nombre = nombre;
    this.apellido = apellido;
    this.dni = dni;
    this.mail = mail;
}


public Cliente(long id, String nombre, String apellido, String dni, String mail) {
    this.id = id;
    this.nombre = nombre;
    this.apellido = apellido;
    this.dni = dni;
    this.mail = mail;
}

public long getId() {
    return id;
}

public void setId(long id) {
    this.id = id;
}

public String getNombre() {
    return nombre;
}

public void setNombre(String nombre) {
    this.nombre = nombre;
}

public String getApellido() {
    return apellido;
}

public void setApellido(String apellido) {
    this.apellido = apellido;
}

public String getDni() {
    return dni;
}

public void setDni(String dni) {
    this.dni = dni;
}

public String getMail() {
    return mail;
}

public void setMail(String mail) {
    this.mail = mail;
}

@Override
public String toString() {
    return "Cliente [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", mail=" + mail
            + "]";
}
  
  

}
