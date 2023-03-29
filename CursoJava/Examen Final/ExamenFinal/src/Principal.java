import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Principal {
	
	public static void main(String[] args) throws IOException {
		Principal p1 = new Principal();
		p1.leerTxt();
	}
	
	public void leerTxt() {
		String rutaResultado = "C:\\Software\\devenv\\workspaces\\CursoJava\\ExamenFinal\\Aerolinia.txt";
		File archivoResultado = new File(rutaResultado);
		FileWriter fw;
		try {
			fw = new FileWriter(archivoResultado);
			BufferedWriter bw = new BufferedWriter(fw);
			
			String ruta = "C:\\Software\\devenv\\workspaces\\CursoJava\\ExamenFinal\\TXT_VUELOS.txt";
				try {
					BufferedReader obj = new BufferedReader(new FileReader(ruta));
					obj.readLine();
					int cantidadTotal = 0;
					// Lee cada línea del archivo utilizando un bucle for
					for (String line = obj.readLine(); line != null; line = obj.readLine()) {
						System.out.println(line);
						// Divide la línea en nombre y edad utilizando una coma como separador
						String[] parts = line.split(",");
						String nombre = parts[0].trim();
						int cantidadPasajeros = Integer.parseInt(parts[1].trim());
						String tipoPasaje = parts[2].trim();
						int valorUnitario = Integer.parseInt(parts[3].trim());
						String fechaVuelo = parts[4].trim();

						Vuelo vuelo = new Vuelo(nombre, cantidadPasajeros, tipoPasaje, valorUnitario, fechaVuelo);
						
						cantidadTotal = cantidadTotal + vuelo.valorFinalVuelo();
						
						bw.write(vuelo.getInformacion());

					}
					bw.write("\nEl monto total es: " + cantidadTotal);
				} catch (IOException e) {
					e.printStackTrace();
				}
			bw.close();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}

