package ejercicios_27;

import java.util.Scanner;

public class Menu_restaurante {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double total = 0;
        boolean continuar = true;

        while (continuar) {
            
            // Mostrar opciones del menu.
            System.out.println("Menú del restaurante:");
            System.out.println("1. Plato principal - $20,000");
            System.out.println("2. Bebida - $5,000");
            System.out.println("3. Postre - $8,000");
            System.out.println("4. Salir");

            // Seleccionar opcion.
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();

            // Sumar el costo del producto seleccionado.
            switch (opcion) {
                case 1:
                    total += 20000;
                    break;
                case 2:
                    total += 5000;
                    break;
                case 3:
                    total += 8000;
                    break;
                case 4:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }

        // Aplicar descuento según metodo  de pago.
        System.out.println("Método de pago:");
        System.out.println("1. Efectivo (10% de descuento)");
        System.out.println("2. Tarjeta de crédito (5% de descuento)");
        System.out.println("3. Cheque (sin descuento)");
        System.out.print("Seleccione su método de pago: ");
        int metodoPago = scanner.nextInt();

        double descuento = 0;
        switch (metodoPago) {
            case 1:
                descuento = total * 0.10;
                break;
            case 2:
                descuento = total * 0.05;
                break;
            case 3:
                descuento = 0;
                break;
            default:
                System.out.println("Método de pago no válido.");
                return;
        }

        // Calcular total a pagar
        double totalFinal = total - descuento;
        System.out.println("Total sin descuento: $" + total);
        System.out.println("Descuento aplicado: $" + descuento);
        System.out.println("Total a pagar: $" + totalFinal);

        scanner.close();
    }
}