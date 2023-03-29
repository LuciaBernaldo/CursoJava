
public class Info {
	public int id;
	public String nombre;
	public Double dineroRecaudado;
	public int year;
	
	public Info(final int id, final String nombre, final double dineroRecaudado,
			final int year) {
		this.id = id;
		this.nombre = nombre;
		this.dineroRecaudado = dineroRecaudado;
		this.year = year;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getDineroRecaudado() {
		return dineroRecaudado;
	}

	public void setDineroRecaudado(double dineroRecaudado) {
		this.dineroRecaudado = dineroRecaudado;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
}
