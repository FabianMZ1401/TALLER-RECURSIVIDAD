import java.util.Scanner;

public class Ejercicio02 {
    public static int invertir(int num, int invertido) {
        if (num == 0) return invertido;
        return invertir(num / 10, invertido * 10 + (num % 10));
    }

    public static void ejecutar(Scanner sc) {
        System.out.print("Ingrese un número entero a invertir: ");
        int num = sc.nextInt();
        int signo = num < 0 ? -1 : 1;
        int resultado = invertir(Math.abs(num), 0) * signo;
        System.out.println("Número invertido: " + resultado);
    }
}
