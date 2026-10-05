import java.util.Scanner;

public class Ejercicio05 {
    public static int sumatoriaConsol(int n) {
        if (n <= 1) return n;
        return n + sumatoriaConsol(n - 1);
    }

    public static void ejecutar(Scanner sc) {
        System.out.print("Ingrese un número entero n: ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Ingrese un número positivo.");
            return;
        }
        System.out.println("La sumatoria de 1 a " + n + " es: " + sumatoriaConsol(n));
    }
}