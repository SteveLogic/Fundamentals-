package semana09;

import generico.Utils;

import java.util.ArrayList;
import java.util.List;


public class Aventura {


    // Colores para impresión en consola.
    public static final String ROJO = "\u001B[31m";
    public static final String VERDE = "\u001B[32m";
    public static final String AZUL = "\u001B[34m";
    public static final String RESET = "\u001B[0m"; 
    public static final String AMARILLO = "\u001B[33m";
    public static final String VERDE_CLARO = "\u001B[92m";
    public static final String CYAN = "\u001B[36m";
    public static final String MORADO = "\u001B[35m";
    public static final String AZUL_CLARO = "\u001B[94m";
    public static final String FUCSIA_RGB = "\u001B[38;5;198m";


    // Variables de inventario y puntos
    private static List<String> mochila = new ArrayList<>();
    private static int puntos = 0;

    // Mostrar menú principal
    public static void menuPrincipal() {

        int seleccion = 0;
        seleccion = Utils.leerEntero(
                CYAN + "¿Dónde quieres explorar? \n\n 1. Ir a la playa \n 2. Ir a la cueva \n 3. Ir a las ruinas \n 4. Ir a la jungla \n 5. Ir a la montaña \n : "
                        + RESET);

        System.out.println("\n");
        casos(seleccion);
    }

    // Despliega un menú para cada ubicación de acuero al número ingresado.
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

                if (puntos != 3) {

                    System.out.println(AMARILLO + "Necesitas 3 puntos para avanzar a la montaña." + RESET);
                    System.out.println(ROJO + "Tienes " + puntos + " punto(s)." + RESET);
                    System.out.println("\n");
                    menuPrincipal();

                } else {

                    menuMontana();
                }

                break;

            default:
                System.out.println("Parece que has ingresado una opción no válida. No te hagas el listo.");
                menuPrincipal();
                break;
        }
    }

    // Menús para las ubicaciones del juego: Playa, Cueva, Ruinas, Jungla y Montaña

    public static void menuPlaya() {

        int accion = 0;
        System.out.println(
                AMARILLO + "Has llegado a la playa. La brisa sopla suavemente. A lo lejos, ves los restos de lo que parece ser un naufragio."
                        + RESET);

        accion = Utils.leerEntero(
                AMARILLO + "¿Qué quieres hacer?" + RESET + CYAN
                        + "\n\n 1. Explorar los restos del naufragio. \n 2. Llamar a tu mamá. \n 3. Ir al este. \n 4. Regresar al mapa. \n :"
                        + RESET);
        System.out.println("\n");

        switch (accion) {
            case 1:
                System.out.println(
                        AZUL + "Entre los restos del barco, has encontrado una vieja y oxidada espada. No vas a rebanar a nadie con esto, pero servirá."
                                + RESET);
                guardarObjeto("Espada vieja");
                menuPlaya();
                break;
            case 2:
                System.out.println(
                        AZUL + "No tienes un celular en tu inventario, si lo tuvieras, de todas formas no hay señal, y si la hubiera, tu mamá nunca contesta."
                                + RESET);
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
        System.out.println(AMARILLO + "Has llegado a la cueva. Está todo escuro y has tropezado con algo." + RESET);

        accion = Utils.leerEntero(
                AMARILLO + "¿Qué quieres hacer?" + RESET + CYAN
                        + "\n\n 1. Ir al sur.  \n 2. Explorar la cueva. \n 3. Regresar al mapa. \n : " + RESET);
        System.out.println("\n");

        switch (accion) {
            case 1:
                casos(3);
                break;
            case 2:
                System.out.println(
                        AZUL + "Ves una sombra pasar ante tu linterna. No estás solo en esta cueva. ¡UN ESQUELETO ESTA FRENTE A TI Y DEBES DEFENDERTE!"
                                + RESET);
                revisarInventario("Espada vieja");
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
                AMARILLO + "Parecen ser las ruinas de una antigua civilización. Hay muchas pirámides, pero una en especial parece poder abrirse usando una especie de llave..."
                        + RESET);

        accion = Utils.leerEntero(
                AMARILLO + "¿Qué quieres hacer?" + RESET + CYAN
                        + "\n\n 1. Intentar abrir la puerta.  \n 2. Ir al norte \n 3. Regresar al mapa. \n : " + RESET);
        System.out.println("\n");

        switch (accion) {
            case 1:
                revisarInventario("Llave de piedra");
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
        System.out.println(AMARILLO
                + "Te adentras en la densa jungla, donde la niebla oculta senderos, antiguos espíritus susurran secretos y algo te observa entre las sombras."
                + RESET);

        accion = Utils.leerEntero(
                AMARILLO + "¿Qué quieres hacer?" + RESET + CYAN
                        + "\n\n 1. Explorar la jungla.  \n 2. Salir huyendo. \n 3. Regresar al mapa. \n : " + RESET);
        System.out.println("\n");

        switch (accion) {
            case 1:
                System.out.println(AZUL
                        + "Caminas entre la densa vegetación y esquivando raíces. Tras un rato de búsqueda, no encuentras nada útil... pero la sensación de ser observado no desaparece y te pones más nervioso."
                        + RESET);
                System.out.println("\n");
                menuJungla();
                break;
            case 2:
                System.out.println(AZUL
                        + "Huyes creyendo que algo te persigue, pero no hay nada. De pronto, tropiezas un extraño tótem. Al tocarlo, los ojos comienzan a brillar y una voz susurra: 'Solo el número correcto revela el secreto…'"
                        + RESET);
                System.out.println("\n");
                int codigo = Utils.leerEntero(FUCSIA_RGB + "Ingresa el número clave: " + RESET);
                System.out.println("\n");
                secreto(codigo);
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

        System.out.println(AMARILLO
                + "Después de caminar unas horas, te sientes agotado debido al dolor y el cansancio. A lo lejos vez el helicóptero de Cenfotec esperándote para llevarte a casa."
                + RESET);
        System.out.println(VERDE + "¡FELICIDADES, HAS CONSEGUIDO COMPLETAR EL JUEGO!" + RESET);
        System.out.println("\n");

    }

    //----------------------------------------------------------------------------------------------------------------------------------

    // Función que agrega un objeto al inventario 
    public static void guardarObjeto(String item) {

        // Valida si el objeto ya existe, y sino, lo agrega.
        if (!mochila.contains(item) == true) {

            mochila.add(item);

            puntos = puntos + 1;
            System.out.println(FUCSIA_RGB + "¡Enhorabuena!, has añadido: " + item + " a tu inventario." + RESET);
            System.out.println("\n");

            System.out.println(ROJO + "Obtienes 1 punto." + RESET);

        } else {
            System.out.println(FUCSIA_RGB + "Ya posees: " + item + " en tu inventario." + RESET);
        }

    }

    // Para diversas partes del juego, se requieren usar los objetos y cada objeto dispara un evento.
    // Esta función revisa que el jugador ya posea el objeto necesario para avanzar.
    public static void revisarInventario(String item) {


        if (mochila.contains(item) == true && item == "Espada vieja") {

            System.out.println(
                    VERDE + "Le has propinado un buen golpe al esqueleto con la espada vieja. Su cabeza ha rodado por el suelo."
                            + RESET);
            System.out.println(ROJO + "Obtienes 1 punto." + RESET);
            System.out.println("\n");
            System.out.println(
                    MORADO + "En el suelo encuentras una nota que cita:\n\n'El primero crece por voluntad de 3,\n el segundo avanza por un paso menor.\n El ciclo se alarga otra vez, \n Y al final ? es el vencedor.'"
                            + RESET);
            System.out.println("\n");
            System.out.println(MORADO + "2,6,8,?,26,78" + RESET);
            System.out.println("\n");
            menuCueva();

        } else if (mochila.contains(item) == true && item == "Llave de piedra") {

            puntos = puntos + 1;
            System.out.println(FUCSIA_RGB + "¡Has abierto la puerta y has encontrado el tesoro!" + RESET);
            System.out.println(FUCSIA_RGB
                    + "Si tienes los puntos dirígete a la montaña donde un helicópetero te rescatará" + RESET);
            System.out.println("\n");
            System.out.println(ROJO + "Obtienes 1 punto." + RESET);
            System.out.println("\n");

            menuPrincipal();

        } else {

            System.out.println(
                    ROJO + "No posees el item necesario para avanzar en esta parte. Sigue explorando." + RESET);
            System.out.println("\n");
            menuPrincipal();

        }

    }

    // Esta función está dedicada a disparar el evento del certijo solamente.
    public static void secreto(int codigo) {

        if (codigo == 24) {

            System.out.println(
                    VERDE + "El tótem se ha iluminado y se ha convertido en una extraña llave de piedra." + RESET);
            System.out.println("\n");
            guardarObjeto("Llave de piedra");
            menuJungla();

        } else {
            System.out.println(
                    ROJO + "Un eco de voces antiguas susurra \"Error... Necesitas encontrar el acertijo de la cueva."
                            + RESET);
            System.out.println("\n");
            menuJungla();
        }
    }

    public static void main(String[] args) {

        System.out.println(AMARILLO + "\n");
        System.out.println("===================================");
        System.out.println(" BIENVENIDO A LA ISLA DEL TESORO ");
        System.out.println("===================================");
        System.out.println("¡Prepárate para una gran aventura!");
        System.out.println("               .-.                ");
        System.out.println("              (0.0)               ");
        System.out.println("            '=.|m|.='             ");
        System.out.println("           '.='`'``=.'            ");
        System.out.println("\n" + RESET);

        // El juego se inicia desde el menú principal.
        menuPrincipal();

    }

}

