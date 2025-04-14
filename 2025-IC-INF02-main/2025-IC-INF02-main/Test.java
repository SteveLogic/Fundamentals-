import generico.Utils;

public class Test {
    public static boolean esUnNumeroValido(int numero) {
        boolean esValido = true;

        int u, d, c, m;

        u = numero % 10;
        System.out.println(u);

        numero = numero / 10;

        d = numero % 10;

        numero = numero / 10;

        c = numero % 10;

        m = numero / 10;
        
        System.out.printf("m %d c %d d %d u %d ", m, c, d, u);
        

        esValido = u != d && u != c && u != m && d != c && d != m && c != m;

        return esValido;
    }

        public static int generarNumeroValidoAleatorio() {
        int numero;

        do {
            numero = Utils.generarNumerosEntre(1000, 9999);
        } while (!esUnNumeroValido(numero));

        return numero;
    }

}