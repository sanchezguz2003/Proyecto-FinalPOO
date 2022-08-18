package Proyecto_Final;

import javax.swing.JOptionPane;


public class Principal {

  
    public static void main(String[] args) {
        // TODO code application logic here
        Proyecto_Final.Persona datos_persona=new Proyecto_Final.Persona("diana","guzman","12/10/2003",18,"familiar","guzman78@gmail.com");
        JOptionPane.showMessageDialog(null,"Nombre Persona: "+datos_persona.getNombre()+"\n"+"Apellido Persona: "+datos_persona.getApellido()+"\n"+"Fecha Nacimiento Persona: "+datos_persona.getFecha_Nacimiento()+"\n"+"Edad Persona: "+datos_persona.getEdad()+"\n"+"contacto persona: "+datos_persona.getContacto()+"\n"+"correo electronico persona: "+datos_persona.getCorreo_electronico());
         
        
        Proyecto_Final.Estudiante datos_estudiante=new Proyecto_Final.Estudiante("ing.sistemas","POO","segundo semestre",80,"7:30 am -11:30 am","diana","guzman","12/10/2003",18,"familiar","guzman78@gmail.com");
        JOptionPane.showMessageDialog(null,"carrera Estudiante: "+datos_estudiante.getCarrera()+"\n"+"asignatura Estudiante: "+datos_estudiante.getAsignatura()+"\n"+"Semestre Estudiante: "+datos_estudiante.getSemestre()+"\n"+"Promedio Estudiante: "+datos_estudiante.getPromedio()+"\n"+"Horario Estudiante: "+datos_estudiante.getHorario()+"\n"+"Nombre Estudiante: "+datos_estudiante.getNombre()+"\n"+"Apellido Estudiante: "+datos_estudiante.getApellido()+"\n"+"Fecha Nacimiento Estudiante: "+datos_estudiante.getFecha_Nacimiento()+"\n"+"Edad Estudiante: "+datos_estudiante.getEdad()+"\n"+"contacto Estudiante: "+datos_estudiante.getContacto()+"\n"+"correo electronico Estudiante: "+datos_estudiante.getCorreo_electronico());
        
        
        Proyecto_Final.Profesor datos_profesor=new Proyecto_Final.Profesor("POO","base de datos",3345677,"miguel","cruz","03/11/1997",25,"familiar","miguel_cruz453@gmail.com");
        JOptionPane.showMessageDialog(null,"materia del profesor: "+datos_profesor.getMateria()+"\n"+"especialidad del profesor: "+datos_profesor.getEspecialidad()+"\n"+"cedula del profesor: "+ datos_profesor.getCedula()+"\n"+"Nombre del profesor: "+datos_profesor.getNombre()+"\n"+"Apellido del profesor: "+datos_profesor.getApellido()+"\n"+"Fecha Nacimiento del profesor: "+datos_profesor.getFecha_Nacimiento()+"\n"+"Edad del profesor: "+datos_profesor.getEdad()+"\n"+"contacto del profesor: "+datos_profesor.getContacto()+"\n"+"correo electronico del profesor: "+datos_profesor.getCorreo_electronico());
    }
    
}
 
        