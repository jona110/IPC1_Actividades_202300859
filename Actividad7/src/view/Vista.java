
package view;

import controller.Controlador;
import javax.swing.JFrame;

public class Vista extends JFrame{
    
    private Controlador controlador;
    private Menu ventanaMenu;
    private Suma ventanaSuma;
    private Resta ventanaResta;
    private Multiplicacion ventanaMultiplicacion;
    private Division ventanaDivision;
    private Potencia ventanaPotencia;
    private Raiz ventanaRaiz;

    public Vista() {
    }

    public Controlador getControlador() {
        return controlador;
    }

    public void setControlador(Controlador controlador) {
        this.controlador = controlador;
    }

    public Menu getVentanaMenu() {
        return ventanaMenu;
    }

    public void setVentanaMenu(Menu ventanaMenu) {
        this.ventanaMenu = ventanaMenu;
    }

    public Suma getVentanaSuma() {
        return ventanaSuma;
    }

    public void setVentanaSuma(Suma ventanaSuma) {
        this.ventanaSuma = ventanaSuma;
    }

    public Resta getVentanaResta() {
        return ventanaResta;
    }

    public void setVentanaResta(Resta ventanaResta) {
        this.ventanaResta = ventanaResta;
    }

    public Multiplicacion getVentanaMultiplicacion() {
        return ventanaMultiplicacion;
    }

    public void setVentanaMultiplicacion(Multiplicacion ventanaMultiplicacion) {
        this.ventanaMultiplicacion = ventanaMultiplicacion;
    }

    public Division getVentanaDivision() {
        return ventanaDivision;
    }

    public void setVentanaDivision(Division ventanaDivision) {
        this.ventanaDivision = ventanaDivision;
    }

    public Potencia getVentanaPotencia() {
        return ventanaPotencia;
    }

    public void setVentanaPotencia(Potencia ventanaPotencia) {
        this.ventanaPotencia = ventanaPotencia;
    }

    public Raiz getVentanaRaiz() {
        return ventanaRaiz;
    }

    public void setVentanaRaiz(Raiz ventanaRaiz) {
        this.ventanaRaiz = ventanaRaiz;
    }
    
    
}
