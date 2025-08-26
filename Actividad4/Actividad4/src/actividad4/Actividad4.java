
package actividad4;

import java.util.Scanner;

public class Actividad4 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String menu;
        int a,b,total = 0;
        
        do {   
        
        System.out.println(" ");
        System.out.println("Escoja la operación que desea realizar:");
        System.out.println("1. Sumar.");
        System.out.println("2. Restar.");
        System.out.println("3. Multiplicación.");
        System.out.println("4. División.");
        System.out.println("5. Potencia.");
        System.out.println("6. Raiz.");
        System.out.println("7. Salir.");
        System.out.print("Escriba el número de la opción: ");
        menu = sc.nextLine().toLowerCase();

        switch (menu) {
            case "uno":
                   System.out.println("   ");
                   System.out.println("-----Ingreso a Suma-----");
                   System.out.print("Ingrese el primer número: ");
                   a = sc.nextInt();
                   System.out.print("Ingrese el segundo número: ");
                   b = sc.nextInt();
                   
                   total = a + b;
                   
                   System.out.println("El resultado de la suma es de: " + total);     
                break;
                
            case "dos":
                System.out.println("  ");
                System.out.println("-----Ingreso a Resta-----");
                System.out.print("Ingrese el primer número: ");
                   a = sc.nextInt();
                   System.out.print("Ingrese el segundo número: ");
                   b = sc.nextInt();
                   
                   total = a - b;
                   
                   System.out.println("El resultado de la resta es de: " + total);
                break;
                
            case "tres":
                System.out.println("  ");
                System.out.println("-----Ingreso a Multiplicación-----");
                System.out.print("Ingrese el primer número: ");
                   a = sc.nextInt();
                   System.out.print("Ingrese el segundo número: ");
                   b = sc.nextInt();
                   
                   total = a * b;
                   
                   System.out.println("El resultado de la multiplicación es de: " + total); 
                break;
                
            case "cuatro":
                System.out.println("  ");
                System.out.println("-----Ingreso a División-----");
                System.out.print("Ingrese el primer número: ");
                   a = sc.nextInt();
                   System.out.print("Ingrese el segundo número: ");
                   b = sc.nextInt();
                   
                   total = a / b;
                   
                   System.out.println("El resultado de la división es de: " + total);
                break;
                
            case "cinco":
                System.out.println("  ");
                System.out.println("-----Ingreso a Potencia-----");
                System.out.print("Ingrese el número de la base: ");
                   a = sc.nextInt();
                   System.out.print("Ingrese el número del exponente: ");
                   b = sc.nextInt();
                   
                   total = (int) Math.pow(a, b);
                   
                   System.out.println("El resultado de la potencia es: " + total);
                break;
                
            case "seis":
                System.out.println("  ");
                System.out.println("-----Ingreso a Raiz-----");
                System.out.print("Ingrese un número: ");
                   a = sc.nextInt();
                   System.out.print("Ingrese el indice de la raiz: ");
                   b = sc.nextInt();
                   
                   double total1 = Math.pow(a, 1.0/b);
                   
                   System.out.println("El resultado de la raiz es de: " + total1);
                break;
      
            case "siete":
                System.exit(0);
                break;
                 
            default: 
                System.out.println("Opción invalida, intentelo de nuevo.");  

        }
           
        } while (!menu.equals("salir"));
                
        sc.close();
       
    }
    
}
