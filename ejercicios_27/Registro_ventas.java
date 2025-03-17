package ejercicios_27;

import java.util.Scanner;

public class Registro_ventas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ventas = "";
        double totalVentas = 0;
        char continuar;

        do {
            System.out.print("Ingrese el nombre del producto: ");
            String producto = scanner.nextLine();
            
            System.out.print("Ingrese el precio del producto: ");
            double precio = scanner.nextDouble();
            
            ventas += "Producto: " + producto + " | Precio: $" + precio + "\n";
            totalVentas += precio;

            System.out.print("¿Desea ingresar otro producto? (s/n): ");
            continuar = scanner.next().toLowerCase().charAt(0);
            scanner.nextLine(); 

        } while (continuar == 's');

        System.out.println("\nResumen de ventas:");
        System.out.println(ventas);
        System.out.printf("Total de ventas: $%.2f%n", totalVentas);

        scanner.close();
    }
}