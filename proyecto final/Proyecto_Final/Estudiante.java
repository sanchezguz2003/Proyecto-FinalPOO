package Proyecto_Final;

/**
 *Protecto_final 
 * 
 * @author Dolor
 */

public class Estudiante extends Persona {
     /**
     * Lista metodos 
     * 
     */
    private String Carrera;
    private String Asignatura;
    private String Semestre ;
    private double Promedio;
    private String horario;

    public Estudiante(String Carrera, String Asignatura, String Semestre, double Promedio, String horario, String Nombre, String Apellido, String Fecha_Nacimiento, int Edad, String Contacto, String Correo_electronico) {
        super(Nombre, Apellido, Fecha_Nacimiento, Edad, Contacto, Correo_electronico);
        this.Carrera = Carrera;
        this.Asignatura = Asignatura;
        this.Semestre = Semestre;
        this.Promedio = Promedio;
        this.horario = horario;
    }

    public String getCarrera() {
        return Carrera;
    }

    public void setCarrera(String Carrera) {
        this.Carrera = Carrera;
    }

    public String getAsignatura() {
        return Asignatura;
    }

    public void setAsignatura(String Asignatura) {
        this.Asignatura = Asignatura;
    }

    public String getSemestre() {
        return Semestre;
    }

    public void setSemestre(String Semestre) {
        this.Semestre = Semestre;
    }

    public double getPromedio() {
        return Promedio;
    }

    public void setPromedio(double Promedio) {
        this.Promedio = Promedio;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
        
}