import java.util.Scanner;

public class Ejercicio09 {
    public static int cociente(int a, int b) {
        if (a < b) return 0;
        return 1 + cociente(a - b, b);
    }

    public static void ejecutar(Scanner sc) {
        System.out.print("Ingrese el dividendo (primer número): ");
        int a = sc.nextInt();
        System.out.print("Ingrese el divisor (segundo número): ");
        int b = sc.nextInt();

        if (b == 0) {
            System.out.println("No se puede dividir entre cero.");
            return;
        }

        int signo = ((a < 0) ^ (b < 0)) ? -1 : 1;
        int resultado = cociente(Math.abs(a), Math.abs(b)) * signo;
        System.out.println("El cociente entero de " + a + " / " + b + " es: " + resultado);
    }
}
