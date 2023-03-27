import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Principal implements IGenerarTxt {

	public void cierrePrograma() {
		
	}
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(Configuracion.class);
		EmpleadoDAO emp1 = contexto.getBean("EmpleadoDAO", EmpleadoDAO.class);
		EmpleadoDAO emp2 = contexto.getBean("EmpleadoDAO", EmpleadoDAO.class);
		
		EmpleadoDAO e1 = new EmpleadoDAO ("Lucia", "Gonzalez", 26);
		EmpleadoDAO e2 = new EmpleadoDAO ("Jorge", "Perez", 28);

		List<EmpleadoDAO> listaEmpleados = new ArrayList<>();
		listaEmpleados.add(e1);
		listaEmpleados.add(e2);
		Principal p1 = new Principal();
		p1.generarTxt(listaEmpleados);
		p1.cierrePrograma();
	}

	@Override
	public void generarTxt(List<EmpleadoDAO> listaEmpleados) {
		
			try {
				String infoEmpleados = new String();
				for (EmpleadoDAO empleado : listaEmpleados) {
					infoEmpleados = infoEmpleados + ("\n") + empleado.leerAtributos();
				}
				String ruta = "C:\\Software\\devenv\\workspaces\\CursoJava\\Ejercicio18.txt";
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
