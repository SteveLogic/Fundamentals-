package semana07;

import generico.Utils;

public class Ejercicio05 {
    public static void main(String[] args) {
        boolean continua = true;

        Utils.limpiarConsola();

        while (continua == true) {
            int año;
            año = Utils.leerEntero("Escriba el año que desea comprobar: ");
            if ((año % 4 == 0 && año % 100 != 0) || (año % 400 == 0)) {
                System.out.println("" +año+ " es bisiesto.");
                
            } else {
                System.out.println("" +año+ " no es bisiesto.");
                
            }

            String respuesta = Utils.leerString("Desea continuar (Si/No)?  ");
            
            if (respuesta.equals("Si")||respuesta.equals("SI")||respuesta.equals("si")||respuesta.equals("sI")) {
                continua = true;
                
            } else {
                continua = false;
                
            }
            

        
            
        }




        
    }
    
}
