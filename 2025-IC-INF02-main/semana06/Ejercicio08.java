package semana06;

import generico.Utils;

public class Ejercicio08 {
    public static void main(String[] args) {

        double hormigas, meses;

        Utils.limpiarConsola();

        hormigas = Utils.leerEntero("Con cuantas hormigas deseas empezar?:  ");
        meses =    Utils.leerEntero("Digite la cantidad de meses?: ");

        for (int i = 1; i <= meses; i++) {
            if (hormigas >= 28000) {
                hormigas = (hormigas*1.31);
                
            } else {
                hormigas = (hormigas*1.4);
            }
            if (hormigas > 7000) {
                hormigas = hormigas -7000;
                
            } else {
                hormigas = 0;
                
            }
            System.out.printf("Las cantidad de hormigas son: %.0f\n", hormigas);
        }
        //System.out.println("Las cantidad de hormigas son "+hormigas + "");
        

       
    }
    




}
