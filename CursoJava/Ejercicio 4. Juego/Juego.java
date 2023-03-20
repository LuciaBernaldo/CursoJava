import java.util.Scanner;

public class Juego {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int numeroAleatorio = (int) (Math.random() * 100 + 1);
		int intentosMaximos = 3;
		System.out
				.println("Va a comenzar el juego. Debes adivinar el numero que piensa el ordenador, tienes 3 intentos");
		int numero;
		
		int intentos = 0;
		while ( intentos < intentosMaximos) {
			if(intentos == 0) {
				System.out.println("Introduce un numero: ");
				numero = sc.nextInt();
			} else {
				System.out.println("Prueba de nuevo");
				System.out.println("Introduce otro numero: ");
				numero = sc.nextInt();
			}
			
			if (numero == numeroAleatorio) {
				break;
			} 
			intentos ++;
		}
		
		if (intentos < intentosMaximos) {
			System.out.println("Enhorabuena.Has adivinado el numero");
		} else {
			System.out.println("Lo siento has perdido, no has adivinado el numero");

		}
	}
}
