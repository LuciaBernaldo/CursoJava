import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Fichero implements ICreacionFichero {
		
	public static void main(String[] args) {
		Empleado p1 = new Empleado("Lucia","Bernaldo de Quiros","Aller","Ingeniera","50000");
		Empleado p2 = new Empleado("Marta","Gonzalez","Madrid","Fisica","80000");
		Empleado p3 = new Empleado("Jorge","Garcia","Valencia","Matematico","30000");
		Fichero f1 = new Fichero();
		List<Empleado> listaEmpleados = new ArrayList<>();
		listaEmpleados.add(p1);
		listaEmpleados.add(p2);
		listaEmpleados.add(p3);
		f1.crearFichero(listaEmpleados);
		f1.leerTxt();

	}

	public void crearFichero(List<Empleado> listaEmpleados) {
		try {
			String infoEmpleados = new String();
			for (Empleado empleado : listaEmpleados) {
				infoEmpleados = infoEmpleados + ("\n") + empleado.leerAtributos();
			}
			String ruta = "C:\\Software\\devenv\\workspaces\\CursoJava\\Empleados.txt";
			File archivo = new File (ruta);
			String contenido = infoEmpleados;
			FileWriter fw = new FileWriter (archivo);
			BufferedWriter bw = new BufferedWriter (fw);
			bw.write(contenido);
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
