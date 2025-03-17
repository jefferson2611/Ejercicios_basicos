/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios_27;
import java.util.Scanner;

public class Clasificacion_deporte {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int puntos = 0;

        // Solicitar el resultado del partido
        System.out.print("Ingrese el resultado del partido (ganado, perdido, empatado): ");
        String resultado = scanner.next().toLowerCase();

        // Otorgar puntos según el resultado
        switch (resultado) {
            case "ganado":
                puntos = 3;
                break;
            case "empatado":
                puntos = 1;
                break;
            case "perdido":
                puntos = 0;
                break;
            default:
                System.out.println("Resultado no válido.");
                return;
        }

        // Mostrar los puntos obtenidos
        System.out.println("Puntos obtenidos: " + puntos);

        scanner.close();
    }
}