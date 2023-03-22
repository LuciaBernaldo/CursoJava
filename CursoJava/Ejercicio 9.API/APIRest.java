import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class APIRest {

	public static void main(String[] args) throws IOException {
		try {
			URL url = new URL ("https://v2.jokeapi.dev/joke/Any");
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			con.connect();
			int timeout = con.getResponseCode();
			if (timeout != 200) {
				throw new RuntimeException ("HttpResponseCode " + timeout);
			}
			else {
				StringBuilder info = new StringBuilder();
				Scanner sc = new Scanner (url.openStream());
				while (sc.hasNext()) {
					info.append(sc.nextLine());
				}
				sc.close();
				System.out.println(info);
			}
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

