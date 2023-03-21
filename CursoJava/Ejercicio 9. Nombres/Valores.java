import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class Valores {

	public static void main(String[] args) {
		Valores f1 = new Valores();
		f1.leerTxt();
		Set<String> nombres = new HashSet<>();
		nombres.add("Gustavo");
		nombres.add("Gustavo");
		nombres.add("Marta");
		nombres.add("Alvaro");
		nombres.add("Alvaro");
		nombres.add("Leon");
		nombres.add("Lucia");
		nombres.add("Luis");
		nombres.add("Daniel");
		System.out.println("La lista de nombres es: " + nombres);
	}
	
	public void leerTxt() {
		try {
		File doc = new File ("C:\\Software\\devenv\\workspaces\\CursoJava\\Ejercicio 9\\Nombres.txt");
		BufferedReader obj = new BufferedReader(new FileReader(doc));
		String caracteres;
		while ((caracteres = obj.readLine()) != null)
			System.out.println (caracteres);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}