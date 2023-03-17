import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Fichero extends Empleados implements ICreacionFichero {
		
	public static void main(String[] args) {
		Empleados p1 = new Empleados();
		Empleados p2 = new Empleados();
		Empleados p3 = new Empleados();
		Fichero f1 = new Fichero();
		
		p1.nombre = "Lucia";
		p1.apellidos = "Bernaldo De Quiros";
		p1.localidad = "Aller";
		p1.posicion = "Ingeniera";
		p1.sueldo = 50000;
		
		p2.nombre = "Marta";
		p2.apellidos = "Gonzalez";
		p2.localidad = "Madrid";
		p2.posicion = "Fisica";
		p2.sueldo = 80000;
		
		p2.nombre = "Jorge";
		p2.apellidos = "Garcia";
		p2.localidad = "Valencia";
		p2.posicion = "Matematico";
		p2.sueldo = 30000;
		
		String [] Empleados = {p1,p2,p3};
		
		f1.crearFichero();
		f1.leerTxt();

	}

	public void crearFichero() {
		try {
			String ruta = "C:\\Software\\devenv\\workspaces\\CursoJava\\Empleados.txt";
			File archivo = new File (ruta);
			String contenido = Empleados;
			FileWriter fw = new FileWriter (archivo);
			BufferedWriter bw = new BufferedWriter (fw);
			bw.write(Empleados);
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void leerTxt() {
		try {
		File doc = new File ("C:\\Software\\devenv\\workspaces\\CursoJava\\Empleados.txt");
		BufferedReader obj = new BufferedReader(new FileReader(doc));
		String caracteres;
		while ((caracteres = obj.readLine()) != null)
			System.out.println (caracteres);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	
	
	
	
	

}
