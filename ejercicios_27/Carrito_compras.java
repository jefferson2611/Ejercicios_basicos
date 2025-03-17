package ejercicios_27;

import java.util.Scanner;

public class Carrito_compras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de productos a comprar: ");
        int cantidad = scanner.nextInt();
        scanner.nextLine(); 

        String[] productos = new String[cantidad];
        double[] precios = new double[cantidad];
        double total = 0;

        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingrese el nombre del producto " + (i + 1) + ": ");
            productos[i] = scanner.nextLine();

            System.out.print("Ingrese el precio del producto: ");
            precios[i] = scanner.nextDouble();
            scanner.nextLine();

            total += precios[i];
        }

        System.out.println("\nResumen de la compra:");
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Producto: " + productos[i] + " | Precio: $" + precios[i]);
        }
        System.out.printf("Total a pagar: $%.2f%n", total);

        scanner.close();
    }
}