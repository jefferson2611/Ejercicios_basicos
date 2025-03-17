package ejercicios_27;

import java.util.Scanner;

public class Gestion_tareas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String tareas = "";
        char continuar;

        do {
            System.out.print("Ingrese la descripción de la tarea: ");
            String descripcion = scanner.nextLine();
            System.out.print("Ingrese la fecha de vencimiento (dd/mm/aaaa): ");
            String fecha = scanner.nextLine();

            tareas += "Tarea: " + descripcion + " | Vence el: " + fecha + "\n";

            System.out.print("¿Desea agregar otra tarea? (s/n): ");
            continuar = scanner.next().toLowerCase().charAt(0);
            scanner.nextLine(); 

        } while (continuar == 's');

        System.out.println("\nLista de tareas:");
        System.out.println(tareas);

        scanner.close();
    }
}