package semana03;

import generico.Utils;

public class EjercicioPropuesto8 {
    public static void main(String[] args) {

        Utils.limpiarConsola();
       
        int examen1;
        int examen2;
        int examen3;
        int promedio;

        examen1 = Utils.leerEntero("Digite la nota del primer examen: ");
        examen2 = Utils.leerEntero("Digite la nota del segundo examen: ");
        examen3 = Utils.leerEntero("Digite la nota del tercer examen: ");

        promedio = (examen1 + examen2 + examen3) / 3;

        if (promedio >= 70) {
            System.out.println("El promedio del estudiante es de " + promedio + " por lo tanto está aprobado.");
           
        } else {
            System.out.println("El promedio del estudiante es de " + promedio + " por lo tanto está reprobado.");          
        }

    }
}