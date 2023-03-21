import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Listas {

	public static void main(String[] args) {
		/*Lista*/
		List<String> comida = new ArrayList<>();
		comida.add("Paella");
		comida.add("Lentejas");
		comida.add("Fabada");
		comida.add("Cachopo");
		comida.add("Guisantes");
		comida.add("Palomitas");
		comida.add("Sopa");
		comida.add("Filete");
		comida.add("Jamon");
		comida.add("Pan");
		System.out.println("------------------------ LISTA ------------------------");
		System.out.println("Lista de productos" + comida);
		/*Set*/
		Set<String> bebida = new HashSet<>();
		bebida.add("Agua");
		bebida.add("Cocacola");
		bebida.add("Fanta");
		bebida.add("Nestea");
		bebida.add("Zumo");
		bebida.add("Cafe");
		bebida.add("Cerveza");
		bebida.add("Gintonic");
		bebida.add("Whisky");
		bebida.add("Colacao");
		System.out.println("------------------------ SET ------------------------");
		System.out.println("La lista de productos es: " + bebida);
		/*Map*/
		Map<String, Integer> mapaNombreEdades = new HashMap<>();
		mapaNombreEdades.put("Gustavo", 30);
		mapaNombreEdades.put("Marta", 23);
		mapaNombreEdades.put("Álvaro", 25);
		mapaNombreEdades.put("Leon", 23);
		mapaNombreEdades.put("Lu", 26);
		mapaNombreEdades.put("Daniel", 28);
		mapaNombreEdades.put("Luis", 25);
		mapaNombreEdades.put("Gema", 43);
		mapaNombreEdades.put("Sofia", 53);
		mapaNombreEdades.put("Maria", 27);
		System.out.println("------------------------ MAP ------------------------");
		System.out.println("Imprimimos los nombres y las edades " + mapaNombreEdades);
	}

}
