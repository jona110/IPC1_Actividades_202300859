

package controller;

import model.Modelo;
import model.Usuario;
import view.Division;
import view.Menu;
import view.Multiplicacion;
import view.Potencia;
import view.Raiz;
import view.Resta;
import view.Suma;
import view.TipoVentana;
import view.Vista;

public class Controlador {
    
    private Modelo modelo;
    private Vista vista;

    public Controlador(Modelo modelo, Vista vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public Vista getVista() {
        return vista;
    }

    public void setVista(Vista vista) {
        this.vista = vista;
    }
    
    
    //-------------Metodos Generales
    
    public void crearVentanas() { //Metodo que crea las ventanas y les setea el controlador
        this.vista.setVentanaMenu(new Menu());
        this.vista.getVentanaMenu().setControlador(this); //Este objeto Controlador
        this.vista.setVentanaSuma(new Suma());
        this.vista.getVentanaSuma().setControlador(this);
        this.vista.setVentanaResta(new Resta());
        this.vista.getVentanaResta().setControlador(this);
        this.vista.setVentanaMultiplicacion(new Multiplicacion());
        this.vista.getVentanaMultiplicacion().setControlador(this);
        this.vista.setVentanaDivision(new Division());
        this.vista.getVentanaDivision().setControlador(this);
        this.vista.setVentanaPotencia(new Potencia());
        this.vista.getVentanaPotencia().setControlador(this);
        this.vista.setVentanaRaiz(new Raiz());
        this.vista.getVentanaRaiz().setControlador(this);
    }
    
    public void mostrarVentana(TipoVentana.Ventana tipoVentana) {
        javax.swing.JFrame[] ventanas = {
            this.vista.getVentanaMenu(), //0
            this.vista.getVentanaSuma(),
            this.vista.getVentanaResta(),
            this.vista.getVentanaMultiplicacion(),
            this.vista.getVentanaDivision(),
            this.vista.getVentanaPotencia(),
            this.vista.getVentanaRaiz()       
        };

        //Se ocultan todas las ventanas
        for (javax.swing.JFrame ventana : ventanas) {
            ventana.setVisible(false);
        }
        
        switch (tipoVentana.getIndex()) {
            case 1 -> this.vista.getVentanaMenu().setVisible(true);
            case 2 -> this.vista.getVentanaSuma().setVisible(true);
            case 3 -> this.vista.getVentanaResta().setVisible(true);
            case 4 -> this.vista.getVentanaMultiplicacion().setVisible(true);
            case 5 -> this.vista.getVentanaDivision().setVisible(true);
            case 6 -> this.vista.getVentanaPotencia().setVisible(true);
            case 7 -> this.vista.getVentanaRaiz().setVisible(true);
        }
    }
    
    //----------------Netodos--------------------
    
    public void crearUsuario(String cui, String nombre, String apellido, int edad){
        
        Usuario user = new Usuario(cui, nombre, apellido, edad);
        getModelo().agregarUsuario(user);
    }
    
    public int sumar(String numero1, String numero2){
        return getModelo().suma(numero1, numero2);
    }
    
    public int restar(String numero1, String numero2){
        return getModelo().resta(numero1, numero2);
    }
    
    public int multiplicar(String numero1, String numero2){
        return getModelo().multiplicacion(numero1, numero2);
    }
    
    public int dividir(String numero1, String numero2){
        return getModelo().division(numero1, numero2);
    }
    
    public int potencia(String base, String exponente){
        return getModelo().potencia(base, exponente);
    }
    
    public double raiz(String numero, String indice){
        return getModelo().raiz(numero, indice);
    }
}
