/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package plantilla;

import javax.swing.JOptionPane;
import static plantilla.plantilla.getDatos;


/**
 *
 * @author cheli
 */
class Profesor extends plantilla {

    @Override
    public void Persona() {
         JOptionPane.showMessageDialog(null, "Tus daros son: " + getDatos());
    }

    
        
    }


