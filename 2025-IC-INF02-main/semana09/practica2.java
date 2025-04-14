package semana09;

import generico.Utils;
import java.lang.Math; //importe math para generar el numero aleatorio 

public class practica2 {
    public static void main(String[] args) {
        int guessednumber, attempts = 0;
        int randomNumber =  (int)(Math.random() * 101);

        Utils.limpiarConsola();

        System.out.println("Bienvenido al Juego de Adivinanza, Tienes 5 intentos para adivinar");

        //System.out.printf("Su numero aleatorio es es: %d\n", randomNumber ); //|| Este print unicamente estaba para probar que los condiciones if-else fucionaran bien y que el numero aleatorio se generara sin problemas.

        while (attempts !=5) { // while con operador logico NOT donde le doy 5 oportunidades al usario de jugar
            guessednumber = Utils.leerEntero("Adivina un numero del 1 al 100:\n ");
            attempts += 1; // attempts se suma +1 cada vez que se entra al loop 
            
            if (guessednumber == randomNumber) {
                System.out.println("Correcto! " +guessednumber+ " es el numero, felicidades!");
                attempts = 5; // Si el numero es correcto attempts se iguala a 5 y el loop se termina de inmediato.

                
            } else if (randomNumber > guessednumber) { // Anidacion a la izquierda 
                System.out.println("Incorrecto :(, el numero es mayor");
                
            } else {
                System.out.println("Incorrecto :(, el numero es menor");

            }
            System.out.println("Has adivinado " +attempts+ " veces\n");


                
            
            }

            
                System.out.println("Gracias por jugar, inicia el juego de nuevo si quieres intentar otra vez, el numero era " +randomNumber+ "\n" );    
              
            

        }
        


        
    }
    
 