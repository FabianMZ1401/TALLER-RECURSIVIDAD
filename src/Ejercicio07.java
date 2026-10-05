import java.util.Scanner;

public class Ejercicio07 {
    public static int mcd(int m, int n) {
        if (n == 0) return m;
        return mcd(n, m % n);
    }

    public static void ejecutar(Scanner sc) {
        System.out.print("Ingrese el primer número (M): ");
        int m = sc.nextInt();
        System.out.print("Ingrese el segundo número (N): ");
        int n = sc.nextInt();
        System.out.println("El M.C.D. entre " + m + " y " + n + " es: " + mcd(m, n));
    }
}