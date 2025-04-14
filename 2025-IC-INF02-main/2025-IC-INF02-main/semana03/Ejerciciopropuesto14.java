package semana03;

import generico.Utils;

public class Ejerciciopropuesto14 {

    public static void main(String[] args) {
        
        Utils.limpiarConsola();

        double TarifaXhora;
        double HoraEntrada;
        double HoraSalida;
        double HoraExtra;
        double DineroApagar;

        TarifaXhora = Utils.leerEntero("Cual es la Tarifa por hora del empleado: ");
        HoraEntrada = Utils.leerEntero("Hora de entrada (Formato 24 horas): ");
        HoraSalida = Utils.leerEntero("Hora de salida (Formato 24 horas): ");

        DineroApagar = ((HoraSalida-HoraEntrada) * TarifaXhora);
        HoraExtra =  ((HoraSalida-HoraEntrada-8)*TarifaXhora*1.5);

        if (HoraSalida - HoraEntrada >8){
            DineroApagar = TarifaXhora * 8 + HoraExtra;
            System.out.println("El salario del empleado es "+ DineroApagar +"");

        }
        else{
            System.out.println("El Salario del empleado es "+DineroApagar+"");;

        }



    }

    
}
