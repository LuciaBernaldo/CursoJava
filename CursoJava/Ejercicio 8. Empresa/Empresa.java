import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;

public class Empresa {

	public static void main(String[] args) {
		Empleado p1 = new Empleado("Lucia","Bernaldo de Quiros","Aller","07/07/1996","09/05/2018","Ingeniera","50000");
		Empleado p2 = new Empleado("Marta","Garcia","Madrid","10/04/1974","06/07/2011","Fisica","90000");
		Empleado p3 = new Empleado("Jorge","Perez","Girona","24/01/1993","13/06/2015","Matematico","50000");
		Empleado p4 = new Empleado("Jorge","Perez","Girona","24/01/1993","13/06/2015","Matematico","50000");
		
		Empresa e1 = new Empresa();
		List<Empleado> listaEmpleados = new ArrayList<Empleado>();
		listaEmpleados.add(p1);
		listaEmpleados.add(p2);
		listaEmpleados.add(p3);
		listaEmpleados.add(p4);
		e1.crearFichero(listaEmpleados);
		System.out.println("Se ha creado el fichero");
	}
	
	public void crearFichero(List<Empleado> listaEmpleados) {
		try {
			String infoEmpleados = new String();
			for (Empleado empleado : listaEmpleados) {
				infoEmpleados = infoEmpleados + ("\n") + empleado.getInformacion();
			}
			String ruta = "C:\\Software\\devenv\\workspaces\\CursoJava\\Ejercicio8.txt";
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
}
