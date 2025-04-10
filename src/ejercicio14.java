package ejercicio14;

import java.util.Scanner;

public class ejercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        
        System.out.println("Ingresa tu edad:");
        int edad = scanner.nextInt();
        boolean pagoEntrada = scanner.nextBoolean();
        
        if (edad >= 18) { 
            System.out.println("¿Pagaste la entrada? (true/false)");
            
            if (pagoEntrada) {
                System.out.println("Entrada válida. ¡Bienvenido al Buenos Aires Trap!");
            } else {
                System.out.println("Entrada no abonada. No puede ingresar.");
            }
        } else {
            System.out.println("Entrada no permitida. Eres menor de edad.");
        }
    }
}                         
