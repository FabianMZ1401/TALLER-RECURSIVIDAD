import java.util.Scanner;

public class Ejercicio08 {
    public static String copiarCadena(String origen, int indice) {
        if (indice == origen.length()) return "";
        return origen.charAt(indice) + copiarCadena(origen, indice + 1);
    }

    public static void ejecutar(Scanner sc) {
        sc.nextLine();
        System.out.print("Ingrese la cadena a copiar: ");
        String texto = sc.nextLine();
        String copia = copiarCadena(texto, 0);
        System.out.println("Cadena original: " + texto);
        System.out.println("Cadena copiada : " + copia);
    }
}