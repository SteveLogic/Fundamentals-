package semana04;
 
import generico.Utils;

public class CalculadoraBasica {

    public static void main(String[] args) {

        Utils.limpiarConsola();

      //Variables

        double dec1, dec2, decalculo;
        int num1, num2, calculo;
        
        
  
        String operacion = Utils.leerString("Que operacion desea realizar?: +, -, *, /:    ");    
        String siOno = Utils.leerString("Utilizara decimales en su calculo? "); 
  
  //Condicional IF  para validar si se utilizaran decimales
        if (siOno.equals("si") || siOno.equals("Si")) {
          //Operacion utilzando decimales o datos doubles
          dec1 = Utils.leerDoble("Ingrese el primer número que desea usar en la operación:  ");
          dec2 = Utils.leerDoble("Ingrese el segundo número que desea usar en la operación:  ");
          if (operacion.equals("+")) {
            decalculo = dec1 + dec2;
            System.out.println("" +dec1+ "+" +dec2+"=" +decalculo+ "" );
            
          } else {
            if (operacion.equals("-")) {
              decalculo = dec1 - dec2;
              System.out.println("" +dec1+ "-" +dec2+"=" +decalculo+ "" );
              
            } else {
              if (operacion.equals("*")|| operacion.equals("x")) {
                decalculo = dec1 * dec2;
                System.out.println("" +dec1+ "*" +dec2+"=" +decalculo+ "" );
                
              } else {
                if (operacion.equals("/")|| operacion.equals("÷")) {
                  decalculo = dec1 / dec2;
                  System.out.println("" +dec1+ "/" +dec2+"=" +decalculo+ "");
                  
                }
                
              }
              
            }
            
          }
  
  
  
         //Condicional ELSE  que define la utilizacion de datos int
        } else {
              num1 = Utils.leerEntero("Ingrese el primer número que desea usar en la operación:  ");
              num2 = Utils.leerEntero("Ingrese el segundo número que desea usar en la operación:  ");

              // Operacion sin decimales o datos  int
              if (operacion.equals("+")) {
                calculo = num1 + num2;
                System.out.println("" +num1+ "+" +num2+"=" +calculo+ ""  );
                
              } else {
                if (operacion.equals("-")) {
                  calculo = num1 - num2;
                  System.out.println("" +num1+ "-" +num2+"=" +calculo+ ""  );
  
                  
                } else {
                  if (operacion.equals("*")|| operacion.equals("x")) {
                    calculo = num1 * num2;
                    System.out.println("" +num1+ "*" +num2+"=" +calculo+ "" );
                    
                  } else {
                      if (operacion.equals("/")|| operacion.equals("÷")) {
                      calculo = num1 / num2;
                      System.out.println("" +num1+ "/" +num2+"=" +calculo+ "");
                      
                    }
                    
                  }
                  
                }
                
              }
  
              
          
        }
         
   
  
        
       



    }

    
}

 