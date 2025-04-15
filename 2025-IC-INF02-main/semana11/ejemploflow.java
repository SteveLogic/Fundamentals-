package semana11;
 

import generico.Utils;
 

public class ejemploflow {

    public static double calcularDesviacionEstandar(int[]arreglo){
        double desvest, promedio;
        //double promedio;


        double []diferencias = new double[arreglo.length];
        promedio = calcularPromedio(arreglo);
        calcularDiferenciaArregloValor(arreglo, promedio, diferencias);
        elevarAlCuadrado(diferencias);
        desvest = sumarArregloReal(diferencias)/diferencias.length;
        
        
        return desvest;
        
        
    }

    public static void calcularDiferenciaArregloValor(int[]arreglo, double diferencia, double[] salida ){
        for (int i = 0; i < arreglo.length; i++) {
            salida[i] = diferencia- arreglo[i];
            
        }

    }

    public static double calcularPromedio (int[]arreglo){
        double promedio;
        promedio = sumarArreglo (arreglo)/ arreglo.length;

        return promedio;

    }

    public static void elevarAlCuadrado (double[]arreglo){
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = arreglo[i]*arreglo[i];
            
        }


    }

    public static void llenarArreglo(int[]arreglo, String etiqueta){
        int valor;

        for (int i = 0; i < arreglo.length; i++) {
            valor = Utils.leerEntero(""+etiqueta);
            arreglo[i] = valor;
            
            
            
        }


    }

    public static int sumarArreglo (int[]arreglo){
        int total, valor;
    
        total = 0;

        for (int i = 0; i < arreglo.length; i++) {
            total = total +arreglo[i];
            
        }

        return total;

    }

    public static double sumarArregloReal(double[]arreglo){
        double total;
        total = 0;
        for (int i = 0; i < arreglo.length; i++) {
            total = total + arreglo[i];


            
        }

        return total;



    }










    public static void main(String[] args) {
        int cantidad, edad, suma;
        double promedio, de;


        Utils.limpiarConsola();



        cantidad = Utils.leerEntero("Digite la cantidad de personas: ");
        int [] edades = new int [cantidad];
        llenarArreglo(edades, "Digite la edad: ");
        
        suma = sumarArreglo(edades);
        System.out.println(suma);

        promedio = calcularPromedio(edades);
        System.out.println(promedio);

        de = calcularDesviacionEstandar(edades);
        System.out.println(de);


 
     

      
 


 }


}
