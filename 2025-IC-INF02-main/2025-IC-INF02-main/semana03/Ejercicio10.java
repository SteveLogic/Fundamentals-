package semana03;

import generico.Utils;

public class Ejercicio10 {

    public static void main(String[] args) {
        Double E1, E2, E3, Final;
        
        Utils.limpiarConsola();

        E1 = Utils.leerDoble("Digite la nota del primer examen:");
        E2 = Utils.leerDoble("Digite la nota del segundo examen:");
        E3 = Utils.leerDoble("Digite la nota del tercer examen:");
        Final = (E1 * 0.3) + (E2 * 0.2) + (E3 * 0.5);

        if (Final >= 70 ) {
            System.out.println("Su nota final es de, " +Final+ " felicidades! usted aprobó! :D");
            System.out.printf("Su nota final es de, %.0f\n", Final); 
            System.out.printf("Su nota final es de, %.0f", Final);
            System.out.printf(" felicidades! usted aprobó! :D");


             
            
        } else {
            System.out.println("Su nota final es de, " +Final + " usted reprobo :(");
        }

        
    }
    
}
