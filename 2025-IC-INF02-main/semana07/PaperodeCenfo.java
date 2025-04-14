package semana07;

import generico.Utils;

public class PaperodeCenfo {
    public static void main(String[] args) {
        int AulasP1 = 1, AulasP2 = 1, AulasP3 = 1, AulasP4 = 1, precioPapas1 = 1000, precioPapas2 = 1500, presupuesto = 50000, papasproveedor = 500, papasInventario, gastoDepapas, perdida = 0, utilidad = 0;
        boolean Piso1 = true, Piso2 = true, Piso3 = true, Piso4 = true; 
        boolean GuardaMalvado = false;

        Utils.limpiarConsola();

        System.out.println("Juan es un vendedor de papas tostadas. Juancito se escabulle dentro de las instalaciones de Cenfotec para vender las papas! EL vende las papas hasta que ocurra lo siguiente:\n ");
        System.out.println("1. Se le acaben las papas.");
        System.out.println("2. Que venda en todos los pisos y aulas de la universidad.");
        System.out.println("3. Que lo agarren los guardas de seguridad y lo inviten a salir\n");

        papasInventario = Utils.leerEntero("Juan tiene un presupuesto de ₡" +presupuesto+ " ¿Cuantas papas deberia comprar a su proveedor?\n");
        presupuesto = presupuesto - (papasInventario * 500);

        if (papasInventario == 20) {
            papasInventario = papasInventario + 4;            
        }

        while (Piso1 == true) {
            System.out.println("Juancito esta en el aula " +AulasP1+ " piso 1, Vigorosamente ofrece las papas, 1 bolsa a  ₡1000 o 2 por ₡1500." );
            int PapasVendidas;
            PapasVendidas = Utils.leerEntero("Cuantas papas vendera Mr. Juan? ");
            AulasP1 = AulasP1 + 1;

            if (PapasVendidas > 0) {
                presupuesto = (presupuesto +  (PapasVendidas / 2) * precioPapas2 +(PapasVendidas % 2) * precioPapas1);
                papasInventario = papasInventario - PapasVendidas;
                System.out.println("Juan tiene " +papasInventario+ " papas." );
                System.out.println("Su presupuesto es ₡" +presupuesto+ "");
                //System.out.println("su utilidad fue de " +utilidad + " "); // TRABAJAR EN LA UTILIDAD!!
                
            } else {
                System.out.println("Mala suerte en esta aula, Juan no vendio nada ");
                
            }

            if (papasInventario == 0) {
               Piso1 = false; Piso2 = false; Piso3 = false; Piso4 = false;                
            }

            if (AulasP1 == 5) {
                while (Piso2 == true) {
                    
                }
                
            } else {
                
            }



            


            
        }






 
    }
    
}
