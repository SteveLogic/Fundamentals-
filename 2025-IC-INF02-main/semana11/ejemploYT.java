package semana11;

import generico.Utils;

public class ejemploYT {
    public static void main(String[] args) {
        int n, acumulador = 0;
        Utils.limpiarConsola();
        n = Utils.leerEntero("Ingrese el numero de personas: ");

        int [] edades = new int [n];

        

        for (int i = 0; i < edades.length; i++) {
            edades[i] = Utils.leerEntero("Ingrese la edad de la persona " + (i + 1)+ ": ");
            
        }

        for (int i = 0; i < edades.length; i++) {
            acumulador += edades[i];
            
        }

        System.out.println("El promedio de edades es: " + (double) acumulador/ edades.length);

        for (int i = 0; i < edades.length; i++) {
            System.out.println("Persona "+ (i+1)+ ": "+ edades[i]);
            
        }

    }

    
}
