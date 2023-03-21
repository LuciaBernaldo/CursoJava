import java.time.LocalDate;

public class Empleado extends Persona implements IAntiguedad {
	//Atributos
	public String posicion;
	public String sueldo;
	public int añoDeIngreso;
	public int mesDeIngreso;
	public int diaDeIngreso;
	public String antiguedadLaboral;
	public int antiguedad;
	
	//Constructor
	public Empleado (final String nombre, final String apellidos,final String localidad, final int dia, final int mes, final int año,
			final int dia2, final int mes2, final int año2, final String posicion, final String sueldo ) {
		this.nombre = nombre; 
		this.apellidos = apellidos;
		this.localidadDeNacimiento = localidad;
		this.diaDeNacimiento = dia;
		this.mesDeNacimiento= mes;
		this.añoDeNacimineto = año;
		this.diaDeIngreso = dia2;
		this.mesDeIngreso = mes2;
		this.añoDeIngreso = año2;
		this.posicion = posicion;
		this.sueldo = sueldo;
	}
	//Métodos

	public int calcularAntiguedad(int añoDeIngreso,int mesDeIngreso,int diaDeIngreso) {
	LocalDate fechaDeIngreso =  LocalDate.of(añoDeIngreso, mesDeIngreso, diaDeIngreso);
    LocalDate fecha = LocalDate.now();
    this.antiguedad = fecha.getYear() - fechaDeIngreso.getYear();
    return antiguedad;
	}
	
	public String leerAtributos () {

		return this.nombre + " " + this.apellidos + " " + edad + " " + antiguedad + " " +
				this.diaDeIngreso + this.posicion + " " + this.sueldo;
		}
}