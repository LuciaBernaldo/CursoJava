import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*En base al siguiente archivo plano armar un archivo de salida que informe lo siguiente:
Agrupar por año y mostrar la plata recaudada
TOP 3 de peliculas con mayor recaudación
Identificar el año que mas plata recaudo
Lista ordenada de peliculas alfabeticamente*/

public class Pelicula {

	public static void main(String[] args) {
		Pelicula peli = new Pelicula();
		peli.txt();

	}
	
	public void txt() {
		String rutaResultado = "C:\\Software\\devenv\\workspaces\\CursoJava\\Modelo Examen 3\\Salida.txt";
		File archivoResultado = new File(rutaResultado);
		FileWriter fw;
		try {
			fw = new FileWriter(archivoResultado);
			BufferedWriter bw = new BufferedWriter(fw);
			List<AgrupacionYear> lista1 = new ArrayList<AgrupacionYear>();
			List<Info> lista2 = new ArrayList<Info>();
			String[] rutas = { "C:\\Software\\devenv\\workspaces\\CursoJava\\Modelo Examen 3\\Peliculas.txt"};
			for (String ruta : rutas) {
				try {
					BufferedReader obj = new BufferedReader(new FileReader(ruta));
					obj.readLine();
					// Lee cada línea del archivo utilizando un bucle for
					for (String line = obj.readLine(); line != null; line = obj.readLine()) {
						System.out.println(line);
						// Divide la línea en nombre y edad utilizando una coma como separador
						String[] parts = line.split(",");
						int id = Integer.parseInt(parts[0].trim());
						String nombre = parts[1].trim();
						double dineroRecaudado = Double.parseDouble(parts[2].trim());
						int year = Integer.parseInt(parts[7].trim());

						Info film = new Info(id, nombre, dineroRecaudado, year);
						
						//Parte 1
						
						boolean existeAgrupacion = false;
						
						for (AgrupacionYear var : lista1) {
							if (var.getYear() == film.getYear()) {
								double result = var.getDineroRecaudado() + film.getDineroRecaudado();
								var.setDineroRecaudado(result);
								existeAgrupacion = true;
								break;
							}
						}
						if (!existeAgrupacion) {
							AgrupacionYear y = new AgrupacionYear(film.getYear(),film.getDineroRecaudado());
							lista1.add(y);
						}
						lista2.add(film);
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			for (AgrupacionYear var : lista1) {
				bw.write("Año: " + var.getYear() + " Dinero Recaudado: " + var.getDineroRecaudado() + "\n");
				}
			bw.write("////////////////////////////////PARTE 2\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\" + "\n");
			Collections.sort(lista2,new DineroRecaudadoComparator());
			Collections.reverse(lista2);
			bw.write("Top 3: " + "\n" + " 1. " + lista2.get(0).getNombre() + "\n" + " 2. " + lista2.get(1).getNombre()
			 + "\n" + " 3. " + lista2.get(2).getNombre() + "\n");
			bw.write("////////////////////////////////PARTE 3\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\" + "\n");
			Collections.sort(lista1,new DineroRecaudadoAgrupacionComparator());
			bw.write("El año que mas dinero se recaudó fue: " + lista1.get(lista1.size()-1).getYear() + "\n");
			bw.write("////////////////////////////////PARTE 4\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\" + "\n");
			Collections.sort(lista2, new NombreComparator());
			for (Info info:lista2) {
				bw.write(info.getNombre() + "\n");
			}
			bw.close();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}	
	static class DineroRecaudadoComparator implements Comparator<Info> {
		@Override
		public int compare(Info o1, Info o2) {
			return o1.getDineroRecaudado().compareTo(o2.getDineroRecaudado());
		}
	}
	static class DineroRecaudadoAgrupacionComparator implements Comparator<AgrupacionYear> {
		@Override
		public int compare(AgrupacionYear o1, AgrupacionYear o2) {
			return o1.getDineroRecaudado().compareTo(o2.getDineroRecaudado());
		}
	}
	static class NombreComparator implements Comparator<Info> {
		@Override
		public int compare(Info o1, Info o2) {
			return o1.getNombre().compareTo(o2.getNombre());
		}
	}
}
