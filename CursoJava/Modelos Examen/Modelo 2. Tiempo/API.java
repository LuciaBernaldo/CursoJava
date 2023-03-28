import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.json.JSONObject;

public class API {

	public static void main(String[] args) throws IOException {
			String tiempoMadrid = null;
			String tiempoBerlin = null;
			String salidaMadrid = null;
			String salidaBerlin = null;
			System.out.println("CONTENIDO PAGINA WEATHER Madrid");
			try {
				URL urlMadrid = new URL ("https://api.open-meteo.com/v1/forecast?latitude=40.42&longitude=-3.70&hourly=temperature_2m&current_weather=true");
				HttpURLConnection con = (HttpURLConnection) urlMadrid.openConnection();
				con.connect();
				int timeout = con.getResponseCode();
				if (timeout != 200) {
					throw new RuntimeException ("HttpResponseCode " + timeout);
					}
				else {
					StringBuilder caracters = new StringBuilder();
					Scanner sc = new Scanner (urlMadrid.openStream());
					while (sc.hasNext()) {
						caracters.append(sc.nextLine());
					}
					sc.close();
					tiempoMadrid = caracters.toString();
					System.out.println(tiempoMadrid);
					
					JSONObject data = new JSONObject(tiempoMadrid);
					JSONObject data2 = new JSONObject();
					data2 = (JSONObject) data.get("current_weather");
					System.out.println(data2.getDouble("temperature"));
					double temp = data2.getDouble("temperature");
					System.out.println(temp);
					double tcritica = 15.0;
					if (temp >=  tcritica)
						salidaMadrid = "MADRID: No realizar tareas de sembrado. Solo tareas de produccion";
						//System.out.println("No realizar tareas de sembrado. Solo tareas de produccion");
					else 
						//System.out.println("Realizar tareas de produccion");
						salidaMadrid = "MADRID: Realizar tareas de produccion";
					}
				} catch (MalformedURLException e) {
					e.printStackTrace();
				}
			System.out.println("CONTENIDO PAGINA WEATHER Berlín");
			try {
				URL urlBerlin = new URL ("https://api.open-meteo.com/v1/forecast?latitude=52.52&longitude=13.41&hourly=temperature_2m&current_weather=true");
				HttpURLConnection con = (HttpURLConnection) urlBerlin.openConnection();
				con.connect();
				int timeout = con.getResponseCode();
				if (timeout != 200) {
					throw new RuntimeException ("HttpResponseCode " + timeout);
					}
				else {
					StringBuilder caracters = new StringBuilder();
					Scanner sc = new Scanner (urlBerlin.openStream());
					while (sc.hasNext()) {
						caracters.append(sc.nextLine());
					}
					sc.close();
					tiempoBerlin = caracters.toString();
					System.out.println(tiempoBerlin);
					
					JSONObject data = new JSONObject(tiempoBerlin);
					JSONObject data2 = new JSONObject();
					data2 = (JSONObject) data.get("current_weather");
					System.out.println(data2.getDouble("temperature"));
					double temp = data2.getDouble("temperature");
					System.out.println(temp);
					double tcritica = 20.0;
					if (temp >=  tcritica)
						salidaBerlin = "BERLIN: Realizar tareas de produccion";
					else 
						salidaBerlin = "BERLIN: Realizar tareas de mantenimiento";
					}
				} catch (MalformedURLException e) {
					e.printStackTrace();
				}
			API f1 = new API();
			List<String> listaRecomendacion = new ArrayList<>();
			listaRecomendacion.add(salidaMadrid);
			listaRecomendacion.add(salidaBerlin);
			System.out.println("Lista de APIS " + listaRecomendacion);
			f1.crearFichero(listaRecomendacion);
	}
	public void crearFichero(List<String> listaRecomendacion) {
		try {
			String infoAPIS = new String();
			for (String apitxt : listaRecomendacion) {
				infoAPIS = infoAPIS + ("\n") + apitxt;
				//infoAPIS = infoAPIS + listaRecomendacion;
			}
			String ruta = "C:\\Software\\devenv\\workspaces\\CursoJava\\Modelo Examen 2\\recomendacion_diaria.txt";
			File archivo = new File (ruta);
			String contenido = infoAPIS;
			FileWriter fw = new FileWriter (archivo);
			BufferedWriter bw = new BufferedWriter (fw);
			bw.write(contenido);
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
