import java.math.BigDecimal;

public class Empleado extends Persona {
	//Atributos
	public String posicion;
	public String sueldo;
	
	//Constructor
	public Empleado (final String nombre, final String apellidos,
			final String localidad, final String posicion, final String sueldo ) {
		this.nombre = nombre; 
		this.apellidos = apellidos;
		this.localidad = localidad;
		this.posicion = posicion;
		this.sueldo = sueldo;
	}
	//Métodos

	public String leerAtributos () {

		return this.nombre + " " + this.apellidos + " " + this.localidad + " " +
				this.posicion + " " + this.sueldo;
		}
	
	
}
	
