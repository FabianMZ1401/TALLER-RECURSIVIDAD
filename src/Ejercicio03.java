import java.util.Scanner;

public class Ejercicio03 {
    public static double sumatoria(int n) {
        if (n == 1) return 1.0;
        return (1.0 / n) + sumatoria(n - 1);
    }

    public static void ejecutar(Scanner sc) {
        System.out.print("Ingrese el valor de n (entero > 0): ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("n debe ser mayor que 0.");
            return;
        }
        System.out.println("La sumatoria hasta 1/" + n + " es: " + sumatoria(n));
    }
}