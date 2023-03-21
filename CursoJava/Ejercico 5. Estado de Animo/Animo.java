import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Animo implements IAnimo {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		LocalDate fecha = LocalDate.now();
		System.out.println("Bienvenido al programa Salud Mental\n" + "Hoy es: " + fecha );
		
		System.out.println("Dime como te llamas: ");
		String n = sc.next();
		Persona p = new Persona();
		p.nombre = n;
		System.out.println("Tu nombre es: " + p.nombre);
		
		Animo a = new Animo();
		int opcion = leerOperaciones();
		if (opcion == 1) a.enojado();
		if (opcion == 2) a.triste();
		if (opcion == 3) a.feliz();
		if (opcion == 4) a.preocupado();
		if (opcion == 5) a.aburrido();
		if (opcion == 6) a.somnoliento();
	}
	
	public static int leerOperaciones() {
		Scanner sc = new Scanner (System.in);
		System.out.println("Elige tu estado de animo del día de hoy : ");
		int opcion=0;
		do {
			System.out.println("1. Enojado");
			System.out.println("2. Triste");
			System.out.println("3. Feliz");
			System.out.println("4. Preocupado");
			System.out.println("5. Aburrido");
			System.out.println("6. Somnoliento");
			} while (opcion>=1 && opcion<=7);
		opcion = sc.nextInt();
		return opcion;
	}

	public void enojado() {
		System.out.println("Te recomiendo que hagas yoga");
	}

	public void triste() {
		System.out.println("Te recomiendo que te tomes unas sidras");
	}

	public void feliz() {
		System.out.println("Te recomiendo que sigas asi");
		
	}

	public void preocupado() {
		System.out.println("Te recomiendo que quedes con los amigos");
	}

	public void aburrido() {
		double resultado = Math.random()*3+1;
		if (resultado == 1) 
			System.out.println("¿Por qué está feliz la escoba? - Porque ba-rriendo.");
		if (resultado == 2) 
			System.out.println("¿Qué le dice una gallina deprimida a otra gallina deprimida? — Necesitamos apoyo.");
		if (resultado == 3) 
			System.out.println("¿Qué le dice una impresora a otra? ¿Esta hoja es tuya o es impresión mía?");	
	}

	public void somnoliento() {
		System.out.println("Te recomiendo que te tomes un cafe");
	}

}
