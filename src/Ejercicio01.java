import java.util.Scanner;

public class Ejercicio01 {
    public static long factorial(int n) {
        if (n <= 1) return 1;
        return n * factorial(n - 1);
    }

    public static void ejecutar(Scanner sc) {
        System.out.print("Ingrese un número entero n: ");
        int n = sc.nextInt();
        if (n < 0) {
            System.out.println("El número debe ser no negativo.");
            return;
        }
        System.out.println("El factorial de " + n + " es: " + factorial(n));
    }
}
