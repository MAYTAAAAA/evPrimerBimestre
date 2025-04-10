package evPrimerBimestre;

import java.util.Scanner;

public class trece {
	public static void main(String[] args) {
		Scanner hola = new Scanner (System.in);
		
		int hora,minuto,segundo;
		
		System.out.println("ingrese la hora en la que esta");
		hora=hola.nextInt();
		
		System.out.println("ingrese los minutos de la hora");
		minuto=hola.nextInt();
		
		System.out.println("ingrese los segundos de los minutos");
		segundo=hola.nextInt();
		
		if (hora<24){
			System.out.println("en valor el correcto");	
		}
		else {
			System.out.println("el valor es incorrecto");
		}
		if(minuto < 60) {
			System.out.println("el valor es correcto");
		}
		else {
			System.out.println("el valor es incorrecto");
		}
		if (segundo < 60) {
			System.out.println("el valor es correcto");
		}
		else {
			System.out.println("el valor es incorrecto");
		}
	}
}
