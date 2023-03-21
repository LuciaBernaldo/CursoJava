import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Coleccion {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Dime 3 productos que necesitas comprar en el supermercado: ");
		String p1 = sc.next();
		String p2 = sc.next();
		String p3 = sc.next();
		
		List<String> supermercado = new ArrayList<>();
		supermercado.add(p1);
		supermercado.add(p2);
		supermercado.add(p3);
		System.out.println("------------------------ Supermercado ------------------------");
		System.out.println("Lista de productos" + supermercado);
		
		Set<String> dni = new HashSet<>();
		System.out.println("Dime los dni de 3 personas: ");
		String dni1 = sc.next();
		String dni2 = sc.next();
		String dni3 = sc.next();
		dni.add(dni1);
		dni.add(dni2);
		dni.add(dni3);

		System.out.println("------------------------ DNI ------------------------");
		System.out.println("La lista de productos es: " + dni);
		
		Map<String, Integer> mapaUsuarioId = new HashMap<>();
		System.out.println("Dime el usuario de 3 personas: ");
		String usuario1 = sc.next();
		String usuario2 = sc.next();
		String usuario3 = sc.next();
		System.out.println("Dime el Id de los 3 usuarios anteriores: ");
		System.out.println("Dime el Id del usuario 1: ");
		int id1 = sc.nextInt();
		System.out.println("Dime el Id del usuario 2: ");
		int id2 = sc.nextInt();
		System.out.println("Dime el Id del usuario 3: ");
		int id3 = sc.nextInt();
		
		mapaUsuarioId.put(usuario1, id1);
		mapaUsuarioId.put(usuario2, id2);
		mapaUsuarioId.put(usuario3, id3);
		
		System.out.println("------------------------ MAP ------------------------");
		System.out.println("Imprimimos los nombres y las edades " + mapaUsuarioId);
	}

}
