
package Proyecto_Final;

import Proyecto_Final.Persona;
import javax.swing.JOptionPane;

public class Profesor extends Persona {
    
    private String Materia;
    private String Especialidad;
    private int Cedula;

    public Profesor(String Materia, String Especialidad, int Cedula, String Nombre, String Apellido, String Fecha_Nacimiento, int Edad, String Contacto, String Correo_electronico) {
        super(Nombre, Apellido, Fecha_Nacimiento, Edad, Contacto, Correo_electronico);
        this.Materia = Materia;
        this.Especialidad = Especialidad;
        this.Cedula = Cedula;
    }

    public String getMateria() {
        return Materia;
    }

    public void setMateria(String Materia) {
        this.Materia = Materia;
    }

    public String getEspecialidad() {
        return Especialidad;
    }

    public void setEspecialidad(String Especialidad) {
        this.Especialidad = Especialidad;
    }

    public int getCedula() {
        return Cedula;
    }

    public void setCedula(int Cedula) {
        this.Cedula = Cedula;
    }
    
}
