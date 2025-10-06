
package view;

public class TipoVentana {
    
    public enum Ventana{
        VENTANA_MENU(1),
        VENTANA_SUMA(2),
        VENTANA_RESTA(3),
        VENTANA_MULTIPLICACION(4),
        VENTANA_DIVISION(5),
        VENTANA_POTENCIA(6),
        VENTANA_RAIZ(7);
        
        private final int index;
        
        Ventana(int index){
            this.index = index;
        }
        
        public int getIndex(){
            return index;
        }
    }
    
}
