import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = -1;

        while (opcion != 0) {
            System.out.println("\n==================================================");
            System.out.println("            TALLER DE RECURSIVIDAD                ");
            System.out.println("==================================================");
            System.out.println("1.  Calcular factorial de un número");
            System.out.println("2.  Invertir un número entero");
            System.out.println("3.  Calcular sumatoria (1 + 1/2 + 1/3 + ... + 1/n)");
            System.out.println("4.  Sumar los dígitos de un número");
            System.out.println("5.  Sumatoria hasta el número leído (1 + 2 + ... + n)");
            System.out.println("6.  Calcular potencia (base ^ exponente)");
            System.out.println("7.  Máximo Común Divisor (M.C.D. - Algoritmo de Euclides)");
            System.out.println("8.  Copiar una cadena en otra");
            System.out.println("9.  Cociente de división entera (restas sucesivas)");
            System.out.println("10. Multiplicación de 2 números (sumas sucesivas)");
            System.out.println("11. Suma de elementos de un arreglo");
            System.out.println("12. Suma de elementos de una matriz (m x n)");
            System.out.println("13. Serie de Fibonacci hasta un valor límite");
            System.out.println("14. Función de Ackermann");
            System.out.println("0.  Salir");
            System.out.println("==================================================");
            System.out.print("Seleccione una opción: ");

            if (!sc.hasNextInt()) {
                System.out.println("Por favor ingrese un número válido.");
                sc.next();
                continue;
            }

            opcion = sc.nextInt();
            System.out.println();

            switch (opcion) {
                case 1:
                    Ejercicio01.ejecutar(sc);
                    break;
                case 2:
                    Ejercicio02.ejecutar(sc);
                    break;
                case 3:
                    Ejercicio03.ejecutar(sc);
                    break;
                case 4:
                    Ejercicio04.ejecutar(sc);
                    break;
                case 5:
                    Ejercicio05.ejecutar(sc);
                    break;
                case 6:
                    Ejercicio06.ejecutar(sc);
                    break;
                case 7:
                    Ejercicio07.ejecutar(sc);
                    break;
                case 8:
                    Ejercicio08.ejecutar(sc);
                    break;
                case 9:
                    Ejercicio09.ejecutar(sc);
                    break;
                case 10:
                    Ejercicio10.ejecutar(sc);
                    break;
                case 11:
                    Ejercicio11.ejecutar(sc);
                    break;
                case 12:
                    Ejercicio12.ejecutar(sc);
                    break;
                case 13:
                    Ejercicio13.ejecutar(sc);
                    break;
                case 14:
                    Ejercicio14.ejecutar(sc);
                    break;
                case 0:
                    System.out.println("¡Saliendo del programa! Hasta luego.");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
        sc.close();
    }
}
