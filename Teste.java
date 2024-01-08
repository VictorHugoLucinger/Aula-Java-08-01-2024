/**
 * Teste
 */
public class Teste {
    public static void main(String[] args) {
        System.out.println(ImprimirTextoMaiusculo("Hello world." + (0 + 6 * 7)));
    }

    public static String ImprimirTextoMaiusculo(String Texto) {
        return Texto.toUpperCase() ;
    }
}