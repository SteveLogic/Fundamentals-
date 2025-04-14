package semana10;

import generico.Utils;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        int i;
        double temperatura = 0, sumaTotal = 0, promedio = 0;

        for (i = 0; i < 7; i++) {
            System.out.println("Digite la temperatura del dia " + (i+1)+ ": ");
            //temperatura =  in.nextDouble();
            sumaTotal += temperatura;
            
            
        }
        promedio = sumaTotal / 7;
        System.out.println("La temperatura promedio de esta semana fue de: " + promedio);

    }





    
}
