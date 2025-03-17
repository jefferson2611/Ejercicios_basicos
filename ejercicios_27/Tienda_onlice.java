package ejercicios_27;
import java.util.Scanner;

public class Tienda_onlice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalCompra = 0;
        boolean continuar = true;

        while (continuar) {
            System.out.print("Ingrese el precio del producto: ");
            double precio = scanner.nextDouble();
            System.out.print("Ingrese la cantidad que va a comprar: ");
            int cantidad = scanner.nextInt();

            totalCompra += precio * cantidad;

            System.out.print("¿Desea agregar otro producto? (s/n): ");
            char respuesta = scanner.next().toLowerCase().charAt(0);
            if (respuesta != 's') {
                continuar = false;
            }
        }

        System.out.println("Total de la compra: $" + totalCompra);
        scanner.close();
    }
}