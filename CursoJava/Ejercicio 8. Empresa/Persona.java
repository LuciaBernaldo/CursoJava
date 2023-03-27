import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Persona implements IEdad{

		//Atributos
		public String nombre;
		public String apellido;
		public String localidadDeNacimiento;
		public String fechaNacimiento;
		
		//Constructor
		public Persona() {
			nombre = "";
		 	apellido = "";
		 	localidadDeNacimiento = "";
		}
		
		//Metodo
		
		public int getEdad() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate fechaNac = LocalDate.parse(this.fechaNacimiento,formatter);
	    LocalDate fecha = LocalDate.now();
	    int result = fecha.getYear() - fechaNac.getYear();
	    return result;
		}
}

