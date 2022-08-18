
package Proyecto_Final;

public abstract class Persona {
    
    private String Nombre;
    private String Apellido;
    private String Fecha_Nacimiento;
    private int Edad;
    private String Contacto;
    private String Correo_electronico;

    public Persona(String Nombre, String Apellido, String Fecha_Nacimiento, int Edad, String Contacto, String Correo_electronico) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Fecha_Nacimiento = Fecha_Nacimiento;
        this.Edad = Edad;
        this.Contacto = Contacto;
        this.Correo_electronico = Correo_electronico;
        
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getFecha_Nacimiento() {
        return Fecha_Nacimiento;
    }

    public void setFecha_Nacimiento(String Fecha_Nacimiento) {
        this.Fecha_Nacimiento = Fecha_Nacimiento;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getContacto() {
        return Contacto;
    }

    public void setContacto(String Contacto) {
        this.Contacto = Contacto;
    }

    public String getCorreo_electronico() {
        return Correo_electronico;
    }

    public void setCorreo_electronico(String Correo_electronico) {
        this.Correo_electronico = Correo_electronico;
    }
    
 }

