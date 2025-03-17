package ejercicios_27;

import java.util.Scanner;

public class Agenda_contactos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de contactos a registrar: ");
        int cantidad = scanner.nextInt();
        scanner.nextLine();

        String[] nombres = new String[cantidad];
        String[] telefonos = new String[cantidad];

        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingrese el nombre del contacto " + (i + 1) + ": ");
            nombres[i] = scanner.nextLine();

            System.out.print("Ingrese el número de teléfono: ");
            telefonos[i] = scanner.nextLine();
        }

        System.out.println("\nLista de contactos registrados:");
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Nombre: " + nombres[i] + " | Teléfono: " + telefonos[i]);
        }

        scanner.close();
    }
}