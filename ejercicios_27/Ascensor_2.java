import java.util.Scanner;

public class Ascensor_2 {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                
        //Cantidad de pisos
        int pisoMinimo = 1, pisoMaximo = 10;
        // Límite de peso en kg
        int pesoMaximo = 200;
        
        System.out.print("Ingrese el piso al que desea ir: ");
        int piso = scanner.nextInt();
        System.out.print("Ingrese su peso en kg: ");
        int peso = scanner.nextInt();


        if (peso > pesoMaximo) {
            System.out.println("Error: Ascensor fuera del rango de peso.");
        } else if (piso >= pisoMinimo && piso <= pisoMaximo) {
            System.out.println("Moviendo ascensor al piso deseado " + piso);
        } else {
            System.out.println("Error: Piso fuera de rango.");
        }
        scanner.close();
    }
}