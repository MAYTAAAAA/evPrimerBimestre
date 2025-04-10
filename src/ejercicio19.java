package ejercicio19;

import java.util.Scanner;

public class ejercicio19 {
public static void main(String[] args) {
	Scanner hola = new Scanner(System.in);
	
	int ingreso=0;
	int intentos=0;
	
	while(intentos<3) {
		System.out.println("Ingrese la contraseña: ");
		ingreso=hola.nextInt();
		int contra=2008;
		if(ingreso==contra) {
		System.out.println("contraseña correcta");
		break;
		}
		intentos++;
		System.out.println("numero de intentos: "+intentos);
		System.out.println("contraseña incorrecta");
		}
	
}	
}


