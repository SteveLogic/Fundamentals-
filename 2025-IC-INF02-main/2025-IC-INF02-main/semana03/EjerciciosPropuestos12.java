package semana03;

import generico.Utils;

public class EjerciciosPropuestos12 {

    public static void main(String[] args){
        Utils.limpiarConsola();

        int Hugo;
        int Paco;
        int Luis;
        

        Hugo = Utils.leerEntero("Cuantos goles anoto Hugo?: ");
        Paco = Utils.leerEntero("Cuantos goles anoto Paco?: ");
        Luis = Utils.leerEntero("Cuantos goles anoto Luis?: ");
        int EquipoPacoLuis = Paco + Luis;
         


        if (Hugo > Paco + Luis){
            System.out.println("Hugo anoto " + Hugo + " goles, Hugo es el ganador!.");
        }
        else{
            System.out.println("El equipo de Paco y Luis anoto  "    + EquipoPacoLuis + " goles, son los ganadores!.");
            
        }




    }
    
}
