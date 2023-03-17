
public class Persona {

	//Atributos
	public String nombre;
	public String apellidos;
	public String localidad;
	
	//Constructor
	public Persona() {
		nombre = "";
	 	apellidos = "";
	 	localidad = "";
	}
	//Metodos
	public void darNombre (String valornombre) {
		nombre = "nombre: "+ valornombre;
	}
 
	public void darapellidos (String valorapellidos) {
		apellidos = "apellidos: "+ valorapellidos;
	}
 
	public void darlocalidad (String valorlocalidad) {
		localidad = "localidad: "+valorlocalidad;	
	}
	
	public String leernombre () {return nombre;}
	
	public String leerapellidos() {return apellidos;}
	
	public String leerlocalidad() {return localidad;}
}
