package ejercicios_27;

import java.util.Scanner;

public class Registro_biblioteca {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String libros = "";
        String titulo, autor;
        int paginas;
        char continuar;

        do {
            System.out.print("Ingrese el título del libro: ");
            titulo = scanner.nextLine();
            System.out.print("Ingrese el autor del libro: ");
            autor = scanner.nextLine();
            System.out.print("Ingrese el número de páginas: ");
            paginas = scanner.nextInt();
            
             // Consumir el salto de línea
            scanner.nextLine();

            libros += "Título: " + titulo + ", Autor: " + autor + ", Páginas: " + paginas + "\n";

            System.out.print("¿Desea ingresar otro libro? (s/n): ");
            continuar = scanner.next().toLowerCase().charAt(0);
            scanner.nextLine();
            
        } while (continuar == 's');

        System.out.println("\nLibros registrados:");
        System.out.println(libros);
        
        scanner.close();
    }
}