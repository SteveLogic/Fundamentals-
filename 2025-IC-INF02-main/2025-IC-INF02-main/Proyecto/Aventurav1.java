package Proyecto;

import generico.Utils;

import java.util.ArrayList;
import java.util.List;

public class Aventurav1 {

    private static List<String> mochila = new ArrayList<>();

    public static void menuPrincipal() {

        int seleccion = 0;
        seleccion = Utils.leerEntero(
                "¿Dónde quieres explorar? \n\n 1. Ir a la playa \n 2. Ir a la cueva \n 3. Ir a las ruinas \n 4. Ir a la jungla \n 5. Ir a la montaña \n : ");

        System.out.println("\n");
        casos(seleccion);
    }

    public static void menuPlaya() {

        int accion = 0;
        System.out.println(
                "Has llegado a la playa. La brisa sopla suavemente. A lo lejos, ves los restos de lo que parece ser un naufragio.");

        accion = Utils.leerEntero(
                "¿Qué quieres hacer? \n\n 1. Explorar los restos del naufragio. \n 2. Llamar a tu mamá. \n 3. Ir al este. \n 4. Regresar al mapa. \n :");
        System.out.println("\n");

        switch (accion) {
            case 1:
                System.out.println(
                        "Entre los restos del barco, has encontrado una vieja y oxidada espada. No vas a rebanar a nadie con esto, pero servirá.");
                guardarObjeto("Espada vieja");
                menuPlaya();
                break;
            case 2:
                System.out.println(
                        "No tienes un celular en tu inventario, si lo tuvieras, de todas formas no hay señal, y si la hubiera, tu mamá nunca contesta.");
                System.out.println("\n");
                menuPlaya();
            case 3:
                casos(2);
                break;
            case 4:
                menuPrincipal();
                break;
            default:
                System.out.println("Parece que has ingresado una opción no válida. No te hagas el listo.");
                System.out.println("\n");
                menuPlaya();
                break;
        }
    }

    public static void menuCueva() {

        int accion = 0;
        System.out.println(
                "Has llegado a la cueva. Está todo escuro y has tropezado con algo. Parece una linterna menos mal.");

        accion = Utils.leerEntero(
                "¿Qué quieres hacer? \n\n 1. Ir al sur.  \n 2. Explorar la cueva. \n 3. Regresar al mapa. \n : ");
        System.out.println("\n");

        switch (accion) {
            case 1:
                casos(3);
                break;
            case 2:
                System.out.println(
                        "Ves una sombra pasar ante tu linterna. No estás solo en esta cueva. ¡UN ESQUELETO ESTA FRENTE A TI Y DEBES DEFENDERTE!");
                break;
            case 3:
                menuPrincipal();
                break;
            default:
                System.out.println("Parece que has ingresado una opción no válida. No te hagas el listo.");
                System.out.println("\n");
                menuCueva();
                break;
        }
    }

    public static void menuRuinas() {

        int accion = 0;
        System.out.println(
                "Parecen ser las ruinas de una antigua civilización. Hay muchas pirámides, pero una en especial parece poder abrirse usando una especie de llave...");

        accion = Utils.leerEntero(
                "¿Qué quieres hacer? \n\n 1. Intentar abrir la puerta.  \n 2. Ir al norte \n 3. Regresar al mapa. \n : ");
        System.out.println("\n");

        switch (accion) {
            case 1:
                System.out.println("Aún no puedes abrir esta puerta.");
                break;
            case 2:
                menuJungla();
                break;
            case 3:
                menuPrincipal();
                break;
            default:
                System.out.println("Parece que has ingresado una opción no válida. No te hagas el listo.");
                menuRuinas();
                break;
        }
    }

    public static void menuJungla() {

        int accion = 0;
        System.out.println(
                "Te adentras en la densa jungla, donde la niebla oculta senderos, antiguos espíritus susurran secretos y algo te observa entre las sombras.");

        accion = Utils.leerEntero(
                "¿Qué quieres hacer? \n\n 1. Explorar la jungla.  \n 2. Salir huyendo. \n 3. Regresar al mapa. \n : ");
        System.out.println("\n");

        switch (accion) {
            case 1:
                System.out.println(
                        "Caminas entre la densa vegetación y esquivando raíces. Tras un rato de búsqueda, no encuentras nada útil... pero la sensación de ser observado no desaparece y te pones más nervioso.");
                System.out.println("\n");
                menuJungla();
                break;
            case 2:
                System.out.println(
                        "Huyes creyendo que algo te persigue, pero no hay nada. De pronto, tropiezas un extraño tótem. Al tocarlo, los ojos comienzan a brillar y una voz susurra: 'Solo el número correcto revela el secreto…'");
                System.out.println("\n");
                break;
            case 3:
                menuPrincipal();
                break;
            default:
                System.out.println("Parece que has ingresado una opción no válida. No te hagas el listo.");
                menuRuinas();
                break;
        }
    }

    public static void menuMontana() {

        System.out.println(
                "Un susurro en el viento advierte: ‘Aún no es tu momento’. De pronto, una fuerza invisible te arrastra de vuelta.");
        System.out.println("Necesitas seguir explorando.");
        System.out.println("(La montaña va a ser una ubicación a la que se accede más delante en el juego)");

    }

    public static void casos(int seleccion) {

        switch (seleccion) {
            case 1:
                menuPlaya();
                break;

            case 2:
                menuCueva();
                break;

            case 3:
                menuRuinas();
                break;
            case 4:
                menuJungla();
                break;
            case 5:
                menuMontana();
                break;

            default:
                break;
        }
    }

    public static void guardarObjeto(String item) {

        mochila.add(item);

        System.out.println("¡Enhorabuena!, has añadido: " + item + " a tu inventario.");
        System.out.println("\n");

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

        menuPrincipal();

    }

}
