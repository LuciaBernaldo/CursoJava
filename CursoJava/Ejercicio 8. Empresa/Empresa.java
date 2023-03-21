import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;

public class Empresa {

	public static void main(String[] args) {
		Empleado p1 = new Empleado("Lucia","Bernaldo de Quiros","Aller",1996,7,7,7,8,2015,"Ingeniera","50000");
		Empleado p2 = new Empleado("Marta","Garcia","Madrid",1992,6,9,14,6,2013,"Fisica","90000");
		Empleado p3 = new Empleado("Jorge","Perez","Girona",1977,3,21,24,9,2013,"Matematico","50000");
		Empleado p4 = new Empleado("Jorge","Perez","Girona",1977,3,21,24,9,2013,"Matematico","50000");
		
		Empresa e1 = new Empresa();
		List<Empleado> listaEmpleados = new ArrayList<>();
		listaEmpleados.add(p1);
		listaEmpleados.add(p2);
		listaEmpleados.add(p3);
		listaEmpleados.add(p4);
		e1.crearFichero(listaEmpleados);
	}
	
	public void crearFichero(List<Empleado> listaEmpleados) {
		try {
			String infoEmpleados = new String();
			for (Empleado empleado : listaEmpleados) {
				infoEmpleados = infoEmpleados + ("\n") + empleado.leerAtributos();
			}
			String ruta = "C:\\Software\\devenv\\workspaces\\CursoJava\\Empleados2.txt";
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


