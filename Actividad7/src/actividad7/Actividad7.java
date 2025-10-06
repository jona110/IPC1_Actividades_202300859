
package actividad7;

import controller.Controlador;
import model.Modelo;
import view.TipoVentana;
import view.Vista;

public class Actividad7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Modelo modelo = new Modelo();
        Vista vista = new Vista();
        Controlador controlador= new Controlador(modelo, vista);
        
        modelo.setControlador(controlador);
        vista.setControlador(controlador);
        
        controlador.crearUsuario("3812512680101", "Jonadab", "Melendrez", 23);
        controlador.crearVentanas();
        controlador.mostrarVentana(TipoVentana.Ventana.VENTANA_MENU);
    }
    
}
