package evPrimerBimestre;

import java.util.Scanner;

public class ejercicio15 {
public static void main(String[] args) {
	Scanner hola= new Scanner(System.in);
    char numero;
    
    System.out.println("ingrese una letra para la talla S,L y M");
    numero=hola.next().charAt(0);
    
   switch (numero) {
   case 's' :
	   System.out.println("te quedan 5 remeras cutrutul");
	   break
   case 'm':
	  System.out.println("te quedan 2 remeras cuturul");
	  break;
   case 'l':
    System.out.println("no te quedan remeras");
    break;
    
   }
    
}
}
