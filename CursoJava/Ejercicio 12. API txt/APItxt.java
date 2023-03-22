import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class APItxt {
		public static void main(String[] args) throws IOException {
			String c = null;
			String l = null;
			String ep = null;
			System.out.println("CONTENIDO PAGINA CARACTERS");
			try {
				URL url = new URL ("https://rickandmortyapi.com/api/character");
				HttpURLConnection con = (HttpURLConnection) url.openConnection();
				con.connect();
				int timeout = con.getResponseCode();
				if (timeout != 200) {
					throw new RuntimeException ("HttpResponseCode " + timeout);
					}
				else {
					StringBuilder caracters = new StringBuilder();
					Scanner sc = new Scanner (url.openStream());
					while (sc.hasNext()) {
						caracters.append(sc.nextLine());
					}
					sc.close();
					c = caracters.toString();
					System.out.println(c);
					}
				} catch (MalformedURLException e) {
					e.printStackTrace();
				}
			System.out.println("CONTENIDO PAGINA LOCATION");
			try {
				URL url = new URL ("https://rickandmortyapi.com/api/location");
				HttpURLConnection con = (HttpURLConnection) url.openConnection();
				con.connect();
				int timeout = con.getResponseCode();
				if (timeout != 200) {
					throw new RuntimeException ("HttpResponseCode " + timeout);
					}
				else {
					StringBuilder location = new StringBuilder();
					Scanner sc = new Scanner (url.openStream());
					while (sc.hasNext()) {
						location.append(sc.nextLine());
					}
					sc.close();
					l = location.toString();
					System.out.println(l);
					}
				} catch (MalformedURLException e) {
					e.printStackTrace();
				}
			System.out.println("CONTENIDO PAGINA EPISODE");
			try {
				URL url = new URL ("https://rickandmortyapi.com/api/episode");
				HttpURLConnection con = (HttpURLConnection) url.openConnection();
				con.connect();
				int timeout = con.getResponseCode();
				if (timeout != 200) {
					throw new RuntimeException ("HttpResponseCode " + timeout);
					}
				else {
					StringBuilder episode = new StringBuilder();
					Scanner sc = new Scanner (url.openStream());
					while (sc.hasNext()) {
						episode.append(sc.nextLine());
					}
					sc.close();
					ep = episode.toString();
					System.out.println(ep);
					}
				} catch (MalformedURLException e) {
					e.printStackTrace();
				}
			APItxt f1 = new APItxt();
			List<String> listaAPIS = new ArrayList<>();
			listaAPIS.add(c);
			listaAPIS.add(l);
			listaAPIS.add(ep);
			System.out.println("Lista de APIS " + listaAPIS);
			f1.crearFichero(listaAPIS);
			}
		
		public void crearFichero(List<String> listaAPIS) {
			try {
				String infoAPIS = new String();
				for (String apitxt : listaAPIS) {
					infoAPIS = infoAPIS + ("\n") + listaAPIS;
				}
				String ruta = "C:\\Software\\devenv\\workspaces\\CursoJava\\APIS.txt";
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




