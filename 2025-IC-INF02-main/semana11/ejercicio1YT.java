package semana11;

import generico.Utils;



public class ejercicio1YT {

    public static int contarValoresmMayoresA(double[] arreglo, double valor){
        int n = 0;
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] > valor) {
                n++;
            }
           
            
        }    
        return n;

    }

    public static double calcularPromedio(double[] arreglo){
        double promedio = 0;
        for (int i = 0; i < arreglo.length; i++) {
            promedio += arreglo[i];
             
            
        }    
        return promedio / arreglo.length;

    }


    public static void imprimirArreglo(double[] arreglo){
        for (int i = 0; i < arreglo.length; i++) {
             System.out.printf( "Valor %2d: %.2f\n", i+1, arreglo[i]);
            
        }    

    }

    public static void leerArreglo(double[] arreglo){
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = Utils.leerDoble("Ingrese el valor " + (i + 1) + ": " );
            
        }    

    }
    public static void main(String[] args) {
        double[] ventasMensuales;
        int meses, cantidad;
        double promedio;
        
        Utils.limpiarConsola();

        meses = Utils.leerEntero("Ingrese el numero de meses: ");
        
        ventasMensuales = new double[meses];

        leerArreglo(ventasMensuales);
        imprimirArreglo(ventasMensuales);
        promedio = calcularPromedio(ventasMensuales);
        

        System.out.printf("Promedio de ventas: %.2f\n", promedio);

        cantidad = contarValoresmMayoresA(ventasMensuales, promedio);

        System.out.println("Cantidad de meses con ventas mayores al promedio " + cantidad);


        
    }
    
}
