
public class EmpleadoDAO {

		// Atributos

		public String nombre;
		public String apellido;
		public int edad;

		// Constructor
		public EmpleadoDAO (final String nombre, final String apellido, final int edad) {
			this.nombre = nombre;
			this.apellido = apellido;
			this.edad = edad;
		}
		
		//Metodo
		public String leerAtributos () {
			return this.nombre + " " + this.apellido + " " + this.edad;
			}
}