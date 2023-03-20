package ejercicio2;
import java.util.Scanner;

public class Calculadora implements ICalculo{
	
	static Scanner sc = new Scanner (System.in);
	
	public static void main(String[] args) {
		Calculadora c = new Calculadora();
		int opcion = leerOperaciones();
		int n1 = leerNumeros();
		int n2 = leerNumeros();
		int calculo = c.calcular(opcion,n1,n2);
		System.out.println("Resultado: " + calculo);
	}
	
	public static int leerOperaciones() {
		System.out.println("Elige una operacion: ");
		char opcion=0;
		do {
			System.out.println("Opcion 1: Suma");
			System.out.println("Opcion 2: Resta");
			System.out.println("Opcion 3: Multiplicacion");
			System.out.println("Opcion 4: Dividision");
			} while (opcion>=1 && opcion<=5);
		opcion = sc.next().charAt(0);
		return opcion;
	}
	
	public static int leerNumeros() {
		
		Scanner sc = new Scanner(System.in);
		int numero;
		System.out.println("Introduce un numero: ");
		numero = sc.nextInt();
		return numero;
	}
	
	public int sumar(int n1,int n2) {
		int suma = n1+n2;
		System.out.println("Suma = "+ suma);
	return suma;
	}
	
	public int restar(int n1,int n2) {
		int resta = n1-n2;
		System.out.println("Resta = "+ resta);
	return resta;
	}
	
	public int multiplicar(int n1,int n2) {
		int multiplicacion = n1*n2;
		System.out.println("Multiplicacion = "+ multiplicacion);
		return multiplicacion;
	}
	
	public int dividir (int n1,int n2) {
		int division= 0;
		if (n2!=0) {
			division = n1/n2;
			System.out.println("Division = "+ division);
		}
  		else
  			System.out.println("ERROR: No se puede dividir entre 0");
	return division;
	}
	
	public int calcular (int opcion, int n1, int n2) {
		int resultado = 0;
		switch (opcion) {
			case '1': /*Suma*/
				resultado = sumar(n1,n2);
			break;
			case '2': /*Resta*/
				resultado = restar(n1,n2);
			break;
			case '3': /*Multiplicacion*/
				resultado = multiplicar(n1,n2);
			break;
			case '4': /*Division*/
				resultado = dividir(n1,n2);
			break;
		}
		return resultado;
	}
}


