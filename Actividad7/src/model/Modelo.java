
package model;

import controller.Controlador;
import javax.swing.JOptionPane;

public class Modelo {
    
    private Controlador controlador;
    private Usuario usuario;

    public Modelo() {
    }

    public Controlador getControlador() {
        return controlador;
    }

    public void setControlador(Controlador controlador) {
        this.controlador = controlador;
    }
    
    public void agregarUsuario(Usuario usuario){
        
        this.usuario = usuario;
        System.out.println(usuario.getCui() + usuario.getNombre() + usuario.getApellido() + usuario.getEdad());
        
    }
    
    public int suma(String numero1, String numero2){
        
        if (numero1.isEmpty() && numero2.isEmpty()){
            JOptionPane.showMessageDialog(null,
                    "Por favor ingrese ambos numeros",
                    "Campos Vacios",
                    JOptionPane.WARNING_MESSAGE , null);
            return 0;
        }
        
        if(numero1.isEmpty()){
            JOptionPane.showMessageDialog(null,
                    "Por favor ingrese el primer número",
                    "Campos Vacios",
                    JOptionPane.WARNING_MESSAGE , null);
            return 0;
        }
        
        if(numero2.isEmpty()){
            JOptionPane.showMessageDialog(null,
                    "Por favor ingrese el segundo número",
                    "Campos Vacios",
                    JOptionPane.WARNING_MESSAGE , null);
            return 0;
        }
        
        try {
            int num1 = Integer.parseInt(numero1);
            int num2 = Integer.parseInt(numero2);
            return num1 + num2;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,
                    "Error al sumar los números",
                    "Error",
                    JOptionPane.WARNING_MESSAGE , null);
            return 0;
        }
    }
    
    public int resta(String numero1, String numero2){
        
        if (numero1.isEmpty() && numero2.isEmpty()){
            JOptionPane.showMessageDialog(null,
                    "Por favor ingrese ambos numeros",
                    "Campos Vacios",
                    JOptionPane.WARNING_MESSAGE , null);
            return 0;
        }
        
        if(numero1.isEmpty()){
            JOptionPane.showMessageDialog(null,
                    "Por favor ingrese el primer número",
                    "Campos Vacios",
                    JOptionPane.WARNING_MESSAGE , null);
            return 0;
        }
        
        if(numero2.isEmpty()){
            JOptionPane.showMessageDialog(null,
                    "Por favor ingrese el segundo número",
                    "Campos Vacios",
                    JOptionPane.WARNING_MESSAGE , null);
            return 0;
        }
        
        try {
            int num1 = Integer.parseInt(numero1);
            int num2 = Integer.parseInt(numero2);
            return num1 - num2;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,
                    "Error al restar los números",
                    "Error",
                    JOptionPane.WARNING_MESSAGE , null);
            return 0;
        }
    }
    
    public int multiplicacion(String numero1, String numero2){
        
        if (numero1.isEmpty() && numero2.isEmpty()){
            JOptionPane.showMessageDialog(null,
                    "Por favor ingrese ambos numeros",
                    "Campos Vacios",
                    JOptionPane.WARNING_MESSAGE , null);
            return 0;
        }
        
        if(numero1.isEmpty()){
            JOptionPane.showMessageDialog(null,
                    "Por favor ingrese el primer número",
                    "Campos Vacios",
                    JOptionPane.WARNING_MESSAGE , null);
            return 0;
        }
        
        if(numero2.isEmpty()){
            JOptionPane.showMessageDialog(null,
                    "Por favor ingrese el segundo número",
                    "Campos Vacios",
                    JOptionPane.WARNING_MESSAGE , null);
            return 0;
        }
        
        try {
            int num1 = Integer.parseInt(numero1);
            int num2 = Integer.parseInt(numero2);
            return num1 * num2;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,
                    "Error al multiplicar los números",
                    "Error",
                    JOptionPane.WARNING_MESSAGE , null);
            return 0;
        }
    }
    
    public int division(String numero1, String numero2){
        
        if (numero1.isEmpty() && numero2.isEmpty()){
            JOptionPane.showMessageDialog(null,
                    "Por favor ingrese ambos numeros",
                    "Campos Vacios",
                    JOptionPane.WARNING_MESSAGE , null);
            return 0;
        }
        
        if(numero1.isEmpty()){
            JOptionPane.showMessageDialog(null,
                    "Por favor ingrese el primer número",
                    "Campos Vacios",
                    JOptionPane.WARNING_MESSAGE , null);
            return 0;
        }
        
        if(numero2.isEmpty()){
            JOptionPane.showMessageDialog(null,
                    "Por favor ingrese el segundo número",
                    "Campos Vacios",
                    JOptionPane.WARNING_MESSAGE , null);
            return 0;
        }
        
        try {
            int num1 = Integer.parseInt(numero1);
            int num2 = Integer.parseInt(numero2);
            return num1 / num2;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,
                    "Error al dividir los números",
                    "Error",
                    JOptionPane.WARNING_MESSAGE , null);
            return 0;
        }
    }
    
    public int potencia(String base, String exponente){
        
        if (base.isEmpty() && exponente.isEmpty()){
            JOptionPane.showMessageDialog(null,
                    "Por favor ingrese ambos numeros",
                    "Campos Vacios",
                    JOptionPane.WARNING_MESSAGE , null);
            return 0;
        }
        
        if(base.isEmpty()){
            JOptionPane.showMessageDialog(null,
                    "Por favor ingrese el primer número",
                    "Campos Vacios",
                    JOptionPane.WARNING_MESSAGE , null);
            return 0;
        }
        
        if(exponente.isEmpty()){
            JOptionPane.showMessageDialog(null,
                    "Por favor ingrese el segundo número",
                    "Campos Vacios",
                    JOptionPane.WARNING_MESSAGE , null);
            return 0;
        }
        
        try {
            int num1 = Integer.parseInt(base);
            int num2 = Integer.parseInt(exponente);
            return (int) Math.pow(num1, num2);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,
                    "Error al calcular la potencia",
                    "Error",
                    JOptionPane.WARNING_MESSAGE , null);
            return 0;
        }
    }
    
    public double raiz(String numero, String indice){
        
        if (numero.isEmpty() && indice.isEmpty()){
            JOptionPane.showMessageDialog(null,
                    "Por favor ingrese ambos numeros",
                    "Campos Vacios",
                    JOptionPane.WARNING_MESSAGE , null);
            return 0;
        }
        
        if(numero.isEmpty()){
            JOptionPane.showMessageDialog(null,
                    "Por favor ingrese el primer número",
                    "Campos Vacios",
                    JOptionPane.WARNING_MESSAGE , null);
            return 0;
        }
        
        if(indice.isEmpty()){
            JOptionPane.showMessageDialog(null,
                    "Por favor ingrese el indice",
                    "Campos Vacios",
                    JOptionPane.WARNING_MESSAGE , null);
            return 0;
        }
        
        try {
            double num1 = Double.parseDouble(numero);
            double num2 = Double.parseDouble(indice);
            return Math.pow(num1, 1.0/num2);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,
                    "Error al calcular la raiz",
                    "Error",
                    JOptionPane.WARNING_MESSAGE , null);
            return 0;
        }
    }
}
