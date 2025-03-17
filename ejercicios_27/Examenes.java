package ejercicios_27;

import java.util.Scanner;

public class Examenes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sumaNotas = 0;
        int cantidadNotas = 0;
        char continuar;

        do {
            System.out.print("Ingrese la nota del examen: ");
            double nota = scanner.nextDouble();
            sumaNotas += nota;
            cantidadNotas++;

            System.out.print("¿Desea ingresar otra nota? (s/n): ");
            continuar = scanner.next().toLowerCase().charAt(0);
        } while (continuar == 's');

        double promedio = sumaNotas / cantidadNotas;
        System.out.printf("Promedio de notas: %.2f%n", promedio);
        System.out.println(promedio >= 3.0 ? "Aprobado " : "Reprobado ");

        scanner.close();
    }
}