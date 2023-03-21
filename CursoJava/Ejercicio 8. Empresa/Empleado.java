import java.time.LocalDate;

public class Empleado extends Persona implements IAntiguedad {
	//Atributos
	public String posicion;
	public String sueldo;
	public int a�oDeIngreso;
	public int mesDeIngreso;
	public int diaDeIngreso;
	public String antiguedadLaboral;
	public int antiguedad;
	
	//Constructor
	public Empleado (final String nombre, final String apellidos,final String localidad, final int dia, final int mes, final int a�o,
			final int dia2, final int mes2, final int a�o2, final String posicion, final String sueldo ) {
		this.nombre = nombre; 
		this.apellidos = apellidos;
		this.localidadDeNacimiento = localidad;
		this.diaDeNacimiento = dia;
		this.mesDeNacimiento= mes;
		this.a�oDeNacimineto = a�o;
		this.diaDeIngreso = dia2;
		this.mesDeIngreso = mes2;
		this.a�oDeIngreso = a�o2;
		this.posicion = posicion;
		this.sueldo = sueldo;
	}
	//M�todos

	public int calcularAntiguedad(int a�oDeIngreso,int mesDeIngreso,int diaDeIngreso) {
	LocalDate fechaDeIngreso =  LocalDate.of(a�oDeIngreso, mesDeIngreso, diaDeIngreso);
    LocalDate fecha = LocalDate.now();
    this.antiguedad = fecha.getYear() - fechaDeIngreso.getYear();
    return antiguedad;
	}
	
	public String leerAtributos () {

		return this.nombre + " " + this.apellidos + " " + edad + " " + antiguedad + " " +
				this.diaDeIngreso + this.posicion + " " + this.sueldo;
		}
}