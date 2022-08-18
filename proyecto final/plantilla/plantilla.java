/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package plantilla;

import javax.swing.JOptionPane;

/**
 *
 * @author cheli
 */
public abstract class plantilla {
    protected  String persona,estudiante,profesor;
	private static String Datos ;
    private int Estudiante;
    private int Profesor;

	public void Operaciones() {
		int opcion = 0;
		int bandera = 0;
		do {
			do {
				opcion = Integer.parseInt(JOptionPane
						.showInputDialog("Porfavor seleccione una opcion:" + "\n" + "[1].-Persona" + "\n"
								+ "[2].-Estudiante" + "\n" + "[3].-Profesor" + "\n" + "[4].-Salir"

						));
				if (opcion >= 1 && opcion <= 4) {
					bandera = 1;
				} else {
					JOptionPane.showMessageDialog(null, "Opcion no encontrada");
				}
			} while (bandera == 0);
			
			switch (opcion) {
			case 1: //persona
				plantilla  creando_persona= new Persona();
				creando_persona.Persona();

				break;
				
			case 2: //Estudiante
				plantilla creando_estudiante= new Estudiante();
				creando_estudiante.Persona();
				
				break;
				
			case 3://Profesor
				plantilla creando_profesor= new  Profesor();
				creando_profesor.Persona();
				break;
				
			case 4://salir
				JOptionPane.showMessageDialog(null, "Vuelva pronto");
				bandera=2;
				break;

			}

		} while (bandera != 2);
	}
        public void Profesor() {
		Profesor = Integer.parseInt(JOptionPane.showInputDialog(null,"�desea ver datos del profeso?: "));
	}
	
	public void Estudiante() {
		Estudiante = Integer.parseInt(JOptionPane.showInputDialog(null,"datos del estudiante"));
	}
	
	public abstract void Persona();

	public static String getDatos() {
		return Datos;
	}

	public static void setDatos(String Datos) {
		plantilla.Datos = Datos;
}
}