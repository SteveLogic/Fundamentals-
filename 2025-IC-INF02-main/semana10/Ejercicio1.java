package semana10;

import generico.Utils;


public class Ejercicio1 {

    public static double calculrahipotenusa(int lad1, int lad2) {
        double  hipotenusa;
        Utils.limpiarConsola();
        hipotenusa =  Math.sqrt(Math.pow(lad1, 2) + Math.pow(lad2, 2));        
        return hipotenusa;     

       

    }

    public static void main(String[] args){
        
        System.out.println(calculrahipotenusa(4, 7));
    }
 
   



 

}
