import java.util.Scanner;

public class Ejercicio06 {
    public static long potencia(int base, int exp) {
        if (exp == 0) return 1;
        return base * potencia(base, exp - 1);
    }

    public static void ejecutar(Scanner sc) {
        System.out.print("Ingrese la base: ");
        int base = sc.nextInt();
        System.out.print("Ingrese el exponente (>= 0): ");
        int exp = sc.nextInt();
        if (exp < 0) {
            System.out.println("El exponente debe ser mayor o igual a 0.");
            return;
        }
        System.out.println(base + "^" + exp + " = " + potencia(base, exp));
    }
}