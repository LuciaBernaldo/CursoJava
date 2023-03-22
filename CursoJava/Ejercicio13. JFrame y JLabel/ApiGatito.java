import java.awt.Image;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;
import org.json.JSONArray;
import org.json.JSONObject;
public class ApiGatito {

		public static void main(String[] args) throws IOException 
		{
			try {
			URL url = new URL ("https://api.thecatapi.com/v1/images/search");
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			con.connect();
			int tiempoDeRepuesta = con.getResponseCode();
			if (tiempoDeRepuesta != 200) //200 es el tiempo de respuesta correcto.
			{
				throw new RuntimeException("HttpResponseCode " + tiempoDeRepuesta);
			}
			else
			{
				StringBuilder informacion = new StringBuilder();
				Scanner sc = new Scanner(url.openStream());
				while (sc.hasNext())
				{
					informacion.append(sc.nextLine());
				}
				sc.close();	
				
				JSONArray objeto = new JSONArray(informacion.toString());
				JSONObject jsonGato = objeto.getJSONObject(0);
				
				//URL
				URL urlImg = new URL(jsonGato.getString("url"));
				
				//IMAGE
				Image imagenGato = ImageIO.read(urlImg);
				ImageIcon imagenIcon = new ImageIcon(imagenGato);
		
				//DISEÑO
				JFrame jFrame = new JFrame();
				JLabel jLabel = new JLabel(imagenIcon);
				int ancho = 700;
				int alto = 700;
				jFrame.setSize(ancho, alto);
				jLabel.setSize(ancho,alto);
				jFrame.setContentPane(jLabel);
				jFrame.setVisible(true);
				jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);	
			}
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		}
	}