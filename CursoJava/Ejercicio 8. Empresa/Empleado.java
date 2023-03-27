import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Empleado extends Persona implements IAntiguedad {
	//Atributos
	public String posicion;
	public String sueldo;
	public String fechaRegistro;
	public String antiguedadLaboral;
	public int antiguedad;
	
	//Constructor
	public Empleado (final String nombre, final String apellido,final String localidad, final String fechaNacimiento, final String fechaRegistro, final String posicion, final String sueldo ) {
		this.nombre = nombre; 
		this.apellido = apellido;
		this.localidadDeNacimiento = localidad;
		this.fechaNacimiento = fechaNacimiento;
		this.fechaRegistro = fechaRegistro;
		this.posicion = posicion;
		this.sueldo = sueldo;
	}
	//Métodos

	public int getAntiguedad() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate fechaAnt = LocalDate.parse(this.fechaRegistro, formatter);
		LocalDate fecha = LocalDate.now();
		int result = fecha.getYear() - fechaAnt.getYear();
		return result;
	}
	
	public String getInformacion() {
		String infoEmpleado = new String();
		infoEmpleado = infoEmpleado.concat(this.nombre + " ");
		infoEmpleado = infoEmpleado.concat(this.apellido + " ");
		infoEmpleado = infoEmpleado.concat(this.localidadDeNacimiento + " ");
		infoEmpleado = infoEmpleado.concat(this.getEdad() + " ");
		infoEmpleado = infoEmpleado.concat(this.getAntiguedad() + " ");
		infoEmpleado = infoEmpleado.concat(this.posicion + " ");
		infoEmpleado = infoEmpleado.concat(this.sueldo + " ");
		infoEmpleado = infoEmpleado.concat("\n");
		return infoEmpleado;
	}
}