
package ejercicios_27;

import java.util.Scanner;

public class tienda_descuentos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Definir precios base de los productos
        double Precio_A = 5000; // Precio de alimentos
        double Precio_V = 20000; // Precio de vestimenta
        double Precio_E = 150000; // Precio de electrónicos

        // Solicitar tipo de producto
        System.out.print("Ingrese el tipo de producto (A, V, E): ");
        char tipoProducto = scanner.next().toUpperCase().charAt(0);

        // Solicitar cantidad de unidades
        System.out.print("Ingrese la cantidad de unidades: ");
        int cantidad = scanner.nextInt();

        if (cantidad <= 0) {
            System.out.println("La cantidad debe ser un número positivo.");
        } else {
            double precioUnitario;
            double descuento = 0;

            // Determinar el precio base y el descuento según el tipo de producto
            switch (tipoProducto) {
                case 'A':
                    precioUnitario = Precio_A;
                    descuento = 0.10;
                    break;
                case 'V':
                    precioUnitario = Precio_V;
                    descuento = 0.05;
                    break;
                case 'E':
                    precioUnitario = Precio_E;
                    descuento = 0.0;
                    break;
                default:
                    System.out.println("Tipo de producto no válido.");
                    return;
            }

            // Calcular costos
            double costoSinDescuento = precioUnitario * cantidad;
            double costoConDescuento = costoSinDescuento * (1 - descuento);

            // Mostrar resultados
            System.out.println("Costo sin descuento: $" + costoSinDescuento);
            System.out.println("Costo con descuento aplicado: $" + costoConDescuento);
        }

        scanner.close();
    }
}