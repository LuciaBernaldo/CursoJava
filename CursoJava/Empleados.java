
public class Empleados extends Persona {
	//Atributos
	public String posicion;
	public int sueldo;
	
	//Constructor
	public Empleados () {
		nombre = " ";
	 	apellidos = " ";
	 	localidad = " ";
	 	posicion = " ";
	 	sueldo = 0;	
	}
	//Metodos
	
	public void darNombre (String valorposicion) {
		localidad = "localidad: "+ valorposicion;
	}
 
	public String leerposicion () {return posicion;}
	
	public int leersueldo() {return sueldo;}
}
