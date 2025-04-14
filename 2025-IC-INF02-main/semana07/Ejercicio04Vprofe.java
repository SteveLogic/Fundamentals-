package semana07;

import generico.Utils;

public class Ejercicio04Vprofe {
    public static void main(String[] args) {
        Utils.limpiarConsola();


        int numero, i = 2;
        boolean esPrimo = true;

        numero = Utils.leerEntero("Digite el numero a evaluar: ");
        
        if (numero < 1) {
            System.out.println("No se puede evaluar.");
            
        } else {
            if (numero >=3) {
                do {
                    if (numero % i == 0) {
                        esPrimo = false;
                        
                    } else {
                        
                    }
                    i = i + 1;
                } while (esPrimo && i < numero);
                if (esPrimo) {
                    System.out.println("Primo");

                    
                } else {
                    System.out.println("No es primo");
                    
                }
                
            } else {
                if (numero == 1 ) {
                    System.out.println("El 1 no es primo");
                    
                } else {
                    System.out.println("Es primo");
                    
                }
                
            }
            
        }


        
    }
    
}
