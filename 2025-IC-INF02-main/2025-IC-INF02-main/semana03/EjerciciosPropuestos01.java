package semana03;

import generico.Utils;

public class EjerciciosPropuestos01 {

    public static void main(String[] args){

      Utils.limpiarConsola();

      int temperatura;
      temperatura = Utils.leerEntero("Porfavor digite su temperatura: ");

        if (temperatura >= 37){
        System.out.println("Tiene" + temperatura + "°C de temperatura, usted tiene fiebre, porfavor reportelo a su TM.");

      }
      else{
        System.out.println("Tiene "+ temperatura + "°C de temperatura, usted no tiene fiebre");

      }
       
        
        
        } 

    } 
    
 
