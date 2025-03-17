package ejercicios_27;

import java.util.Scanner;

public class Comidas_rapidas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        double total = 0;
        char continuar;

        do {
            System.out.println("Menú de Comidas Rápidas:");
            System.out.println("1. Hamburguesa  $10000");
            System.out.println("2. Perro caliente $8000");
            System.out.println("3. Papas fritas $5000");
            System.out.println("4. Gaseosa $3000");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1 -> total += 10000;
                case 2 -> total += 8000;
                case 3 -> total += 5000;
                case 4 -> total += 3000;
                default -> System.out.println("Opción no válida.");
            }

            System.out.print("¿Desea pedir algo más? (s/n): ");
            continuar = scanner.next().toLowerCase().charAt(0);

        } while (continuar == 's');

        System.out.printf("Total a pagar: $%.2f%n", total);
        System.out.println("¡Gracias por su compra!");

        scanner.close();
    }
}