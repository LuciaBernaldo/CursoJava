package ejercicionivel;

import java.util.Scanner;


public class Calculadora {
	
	public static void main (String [] arg) {
		int n1, n2
		char opcion
		while ( opcion < '1' || opcion > '4' )
		do {
			printf ("opcion 1: Suma")
			printf ("opcion 1: Resta")
			printf ("opcion 1: Multiplicacion")
			printf ("opcion 1: Division")
		
			do {
				printf ("Elige una opcion")
				scanf ("c",&opcion)
			}
		}
		switch (opcion)
		{
				/*Suma*/
		case '1': printf("Dame un numero entero")
				  scanf("%d", &n1);
				  printf("Dame otro numero entero")
				  scanf("%d", &n2);
				  printf (n1+n2);
		break;
				  /*Resta*/
		case '2': printf("Dame un numero entero")
				  scanf("%d", &n1);
		  		  printf("Dame otro numero entero")
		  		  scanf("%d", &n2);
		  		  printf (n1-n2);
		break;
		  		/*Multiplicacion*/
		case '3': printf("Dame un numero entero")
		  		  scanf("%d", &n1);
				  printf("Dame otro numero entero")
				  scanf("%d", &n2);
				  printf (n1*n2);
	    break;
				  /*Division*/
		case '4': printf("Dame un numero entero")
		  		  scanf("%d", &n1);
		  		  printf("Dame otro numero entero")
		  		  scanf("%d", &n2);
		  		  if (n2!=0)
		  			  printf (n1/n2);
		  		  else
		  			  printf("No se puede dividir entre 0")
		  		
		break;
		
		}
		
	}


}
