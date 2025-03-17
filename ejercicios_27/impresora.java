package ejercicios_27;

import java.util.Scanner;

public class impresora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Número de hojas en la impresora.
        int papelDisponible = 100; 

        while (papelDisponible > 0) {
            System.out.println("Hojas disponibles: " + papelDisponible);
            System.out.print("Ingrese la cantidad de páginas a imprimir: ");
            int paginas = scanner.nextInt();

            if (paginas > papelDisponible) {
                System.out.println("Error: No hay suficiente papel.");
            } else {
                papelDisponible -= paginas;
                System.out.println("Impresión exitosa. Hojas restantes: " + papelDisponible);
            }

            if (papelDisponible == 0) {
                System.out.println("La impresora se ha quedado sin papel.");
            }
        }

        scanner.close();
    }
}
