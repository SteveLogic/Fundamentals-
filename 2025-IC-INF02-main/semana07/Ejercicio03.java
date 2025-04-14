package semana07;

import generico.Utils;

public class Ejercicio03 {
    public static void main(String[] args) {
        int capitulosPorDia = 0, totalCapitulos = 0, numeroDias = 0;
        boolean libroTerminado = false;

        Utils.limpiarConsola();

        do {
            capitulosPorDia = Utils.leerEntero("Cuantos capitulos leyó hoy?");
            totalCapitulos += capitulosPorDia;
            numeroDias++;
            libroTerminado = Utils.leerBoolean("Terminó el libro?");
        } while (!libroTerminado);
        System.out.println("Felicidades! Usted leyó un libro de " + totalCapitulos + " capitulos en " + numeroDias + " dias!");
    }




    
}
