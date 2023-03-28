import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Tienda {

	public static void main(String[] args) {
		Tienda t1 = new Tienda();
		t1.txt();
	}

	public void txt() {
		String rutaResultado = "C:\\Software\\devenv\\workspaces\\CursoJava\\Modelo Examen 1\\Tienda.txt";
		File archivoResultado = new File(rutaResultado);
		FileWriter fw;
		try {
			fw = new FileWriter(archivoResultado);
			BufferedWriter bw = new BufferedWriter(fw);

			String[] rutas = { "C:\\Software\\devenv\\workspaces\\CursoJava\\Modelo Examen 1\\Productos.txt"};
			for (String ruta : rutas) {
				try {
					BufferedReader obj = new BufferedReader(new FileReader(ruta));
					obj.readLine();
					// Lee cada línea del archivo utilizando un bucle for
					for (String line = obj.readLine(); line != null; line = obj.readLine()) {
						System.out.println(line);
						// Divide la línea en nombre y edad utilizando una coma como separador
						String[] parts = line.split(",");
						String descripcion = parts[0].trim();
						int precioUnitario = Integer.parseInt(parts[1].trim());
						int cantidadVendidaTotal = Integer.parseInt(parts[2].trim());
						String fechaUltimaCompra = parts[3].trim();

						Producto product = new Producto(descripcion, precioUnitario, cantidadVendidaTotal, fechaUltimaCompra);
						
						bw.write(product.getInformacion());
						
				        Producto datosAntiguos = product;
				        
				        Producto productNew = new Producto(descripcion, precioUnitario, cantidadVendidaTotal, fechaUltimaCompra);
				        
				        Producto datosNuevos = productNew;
				        
				        String nombreArchivo = "Tienda.txt";
				        
			            File archivo = new File(nombreArchivo);
			            FileWriter escritor = new FileWriter(archivo, true);

			            // Leer el archivo línea por línea
			            BufferedReader lector = new BufferedReader(new FileReader(archivo));
			            String lineaActual;
			            String contenidoNuevo = "";
			            while ((lineaActual = lector.readLine()) != null) {
			                // Buscar la línea con los datos antiguos y sobrescribir con los nuevos datos
			                if (lineaActual.equals(datosAntiguos)) {
			                    contenidoNuevo += datosNuevos + "\n";
			                } else {
			                    contenidoNuevo += lineaActual + "\n";
			                }
			            }
			            lector.close();

			            // Sobrescribir el archivo con el contenido actualizado
			            escritor.write(contenidoNuevo);
			            escritor.close();
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

