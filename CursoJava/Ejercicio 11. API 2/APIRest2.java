import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class APIRest2 {

	public static void main(String[] args) throws IOException {
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
				System.out.println(caracters);
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
				System.out.println(location);
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
				System.out.println(episode);
				}
			} catch (MalformedURLException e) {
				e.printStackTrace();
			}
		}
	}
