import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.List;

public class Empresa {

	public static void main(String[] args) throws IOException {
		Empresa e1 = new Empresa();
		e1.leerTxt();

	}

	public void leerTxt() {
		String rutaResultado = "C:\\Software\\devenv\\workspaces\\CursoJava\\Empresa.txt";
		File archivoResultado = new File(rutaResultado);
		FileWriter fw;
		try {
			fw = new FileWriter(archivoResultado);
			BufferedWriter bw = new BufferedWriter(fw);

			String[] rutas = { "C:\\Software\\devenv\\workspaces\\CursoJava\\EjercicioTipoExamen\\USUARIOS_1.txt",
					"C:\\Software\\devenv\\workspaces\\CursoJava\\EjercicioTipoExamen\\USUARIOS_2.txt",
					"C:\\Software\\devenv\\workspaces\\CursoJava\\EjercicioTipoExamen\\Usuarios_3.txt" };
			for (String ruta : rutas) {
				try {
					BufferedReader obj = new BufferedReader(new FileReader(ruta));
					obj.readLine();
					// Lee cada línea del archivo utilizando un bucle for
					for (String line = obj.readLine(); line != null; line = obj.readLine()) {
						System.out.println(line);
						// Divide la línea en nombre y edad utilizando una coma como separador
						String[] parts = line.split(",");
						String nombre = parts[0].trim();
						String pais = parts[1].trim();
						String fechaNacimiento = parts[2].trim();
						String fechaRegistro = parts[3].trim();
						String fechaLogin = parts[4].trim();
						String compras = parts[5].trim();

						Usuario user = new Usuario(nombre, pais, fechaNacimiento, fechaRegistro, fechaLogin, compras);
						
						bw.write(user.getInformacion());


					}
				} catch (IOException e) {
					e.printStackTrace();
				}

			}
			bw.close();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}
