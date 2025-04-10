package evPrimerBimestre;

import java.util.Scanner;

public class scanner {
public static void main(String[] args) {
	Scanner hola= new Scanner(System.in);	
	char numero;
	numero=hola.next().charAt(0);
	
	System.out.println("ingrese un numero");
	
	switch (numero) {
	case  1: System.out.println("cafe cortado");
	break;
	case  2: System.out.println("café Latte,");
	break;
	case  3: System.out.println("café solo,");
	break;
	case  4: System.out.println("café solo,");
	break;
	case  5:;
	break;
	}		
}
}
