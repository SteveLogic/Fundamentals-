package semana07;

import generico.Utils;

public class Ejercicio04 {
    public static void main(String[] args) {
        int numero, i = 2;
        boolean esPrimo = true;
        Utils.limpiarConsola();

        

        numero = Utils.leerEntero("Digite su numero: ");

        while (i*i <= numero && esPrimo == true) {
            if (numero % i == 0) {
                esPrimo = false;
                
            }
            i = i+1;
            if (esPrimo) {
                System.out.println("Tu numero es primo");
                
            } else {
                System.out.println("Tu numero no es primo");
                
            }


            
        }

         

        
    }
    
}
