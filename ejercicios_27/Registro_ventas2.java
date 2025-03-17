package ejercicios_27;

import java.util.Scanner;

public class Registro_ventas2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de productos vendidos: ");
        int cantidad = scanner.nextInt();
        scanner.nextLine();

        String[] productos = new String[cantidad];
        double[] precios = new double[cantidad];
        int[] cantidades = new int[cantidad];
        double totalVentas = 0;

        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingrese el nombre del producto " + (i + 1) + ": ");
            productos[i] = scanner.nextLine();

            System.out.print("Ingrese el precio del producto: ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Entrada no válida. Ingrese un precio válido:");
                scanner.next();
            }
            precios[i] = scanner.nextDouble();

            System.out.print("Ingrese la cantidad vendida: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Entrada no válida. Ingrese una cantidad válida:");
                scanner.next();
            }
            cantidades[i] = scanner.nextInt();
            scanner.nextLine();

            totalVentas += precios[i] * cantidades[i];
        }

        System.out.println("\nResumen de ventas:");
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Producto: " + productos[i] + " | Precio: $" + precios[i] + " | Cantidad: " + cantidades[i]);
        }
        System.out.printf("Total de ventas: $%.2f%n", totalVentas);

        scanner.close();
    }
}