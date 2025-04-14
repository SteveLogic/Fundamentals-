package semana07;

import java.util.Scanner; 
import generico.Utils;

public class whiletest {
    public static void main(String[] args) {
        Utils.limpiarConsola();
        Scanner in = new Scanner(System.in); // Crea un objeto Scanner
        int numero = -5;

        while (numero >= 0) {             
            System.out.println("Digite el numero: ");
            numero = in.nextInt();  // Lee un número entero de la entrada
        }
        
        in.close(); // Cierra el Scanner para evitar fugas de memoria


        
    }
    
}
