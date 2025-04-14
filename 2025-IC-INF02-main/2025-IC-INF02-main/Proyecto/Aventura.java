package Proyecto;

import generico.Utils;

import java.util.ArrayList;
import java.util.List;
// import java.util.Random;

public class Aventura {

    private List<String> mochila = new ArrayList<>(); 

    public void menuPrincipal() {

        int seleccion = 0;
        seleccion = Utils.leerEntero(
            " ¿Dónde quieres explorar? \n\n 1. Ir a la playa \n 2. Ir a la cueva \n 3. Ir a las ruinas \n 4. Ir a la jungla \n 5. Ir a la montaña \n : ");

        System.out.println("\n");
        casos(seleccion);
    }

    public void menuPlaya(){

        int accion = 0;
        System.out.println("Has llegado a la playa. La brisa sopla suavemente. A lo lejos, ves los restos de lo que parece ser un naufragio.");
                
            accion = Utils.leerEntero("¿Qué quieres hacer?\n\n 1. Explorar los restos del naufragio. \n 2. Llamar a tu mamá. \n 3. Regresar al mapa. \n :");
            System.out.println("\n");

            switch (accion) {
                case 1:
                    System.out.println("Entre los restos del barco, has encontrado una vieja y oxidada espada. No vas a rebanar a nadie con esto, pero con suerte tu adversario morirá de tétano.");
                    guardarObjeto("Espada vieja");
                    menuPlaya();
                    break;
                case 2:
                    System.out.println("No tienes un celular en tu inventario, si lo tuvieras, de todas formas no hay señal, y si la hubiera, tu mamá nunca contesta.");
                    System.out.println("\n");
                    menuPlaya();
                    break;
                case 3:
                    menuPrincipal();
                    break;
                default:
                    System.out.println("Parece que has ingresado una opción no válida. No te hagas el listo.");
                    System.out.println("\n");
                    menuPlaya();
                    break;
            }
    }

    public void menuCueva(){

        int accion = 0;
        System.out.println("Has llegado a la cueva. Está todo escuro y has tropezado con algo. Parece una...");
        guardarObjeto("Linterna");
                
            accion = Utils.leerEntero("¿Qué quieres hacer?\n\n 1. Ir al sur.  \n 2. Explorar la cueva. \n 3. Regresar al mapa. \n : ");
            System.out.println("\n");

            switch (accion) {
                case 1:
                    casos(4);
                    break;
                case 2:
                    System.out.println("Ves una sombra pasar ante tu linterna. No estás solo en esta cueva. ¡UN ESQUELETO ESTA FRENTE A TI Y DEBES DEFENDERTE!");                     
                    revisarInventario("Espada vieja"); 
                    break;
                case 3:
                    System.out.println("");
                    menuPrincipal();
                    break;
                default:
                    System.out.println("");
                    System.out.println("\n");
                    menuCueva();
                    break;
            }
    }

    public void casos(int seleccion) {

        switch (seleccion) {
            case 1:
                menuPlaya();
                break;

            case 2:
                menuCueva();
                break;

            case 3:
                // menuRuinas();
                break;
            case 4:
                // menuJungla();
                break;
            case 5:
                // menuMontana();
                break;
                
            default:
                break;
        }
    }

    public void guardarObjeto(String item){

        mochila.add(item);

        System.out.println("¡Enhorabuena!, has añadido: " + item + " a tu inventario.");
        System.out.println("\n");

    }

    public void revisarInventario(String item){

        if (mochila.contains(item) == true && item == "Espada vieja") {

            System.out.println("Le has propinado un caitazo al esqueleto. Su cabeza ha caido al suelo y sus huesos se han desplomado");
            System.out.println("\n");
            
        } else {

            System.out.println("¡No tienes con qué defenderte! Vuelve a intentarlo.");
            System.out.println("\n");

            Aventura obj = new Aventura();
            obj.menuPrincipal();

        }

    }

    public static void main(String[] args) {

        System.out.println("\n");
        System.out.println("===================================");
        System.out.println(" BIENVENIDO A LA ISLA DEL TESORO ");
        System.out.println("===================================");
        System.out.println("¡Prepárate para una gran aventura!");
        System.out.println("               .-.                ");
        System.out.println("              (0.0)               ");
        System.out.println("            '=.|m|.='             ");
        System.out.println("           '.='`'``=.'            ");
        System.out.println("\n");

        Aventura nuevAventura = new Aventura();
        nuevAventura.menuPrincipal();
        

    }

}
