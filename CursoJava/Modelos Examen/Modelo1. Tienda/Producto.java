import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Producto implements IPrecioFinal, IPromedioVenta, IDiasUltimaCompra,ICantidadDeVentas {
	
	public String talla;
	public String material;
	public String color;
	public String descripcion;
	public int precioUnitario;
	public int cantidadVendidaTotal;
	public String fechaUltimaCompra;
	
	
	public Producto() {
		talla = "";
		material = "";
		color = "";
	}
	public Producto(final String descripcion, final int precioUnitario, final int cantidadVendidaTotal,
			final String fechaUltimaCompra) {
		this.descripcion = descripcion;
		this.precioUnitario = precioUnitario;
		this.cantidadVendidaTotal = cantidadVendidaTotal;
		this.fechaUltimaCompra = fechaUltimaCompra;
	}
	@Override
	public int cantidadDiasUltComp() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate fechaAnt = LocalDate.parse(this.fechaUltimaCompra, formatter);
		LocalDate fecha = LocalDate.now();
		int fechaUltComp = fecha.getDayOfMonth() - fechaAnt.getDayOfMonth();
		return fechaUltComp;
	}
	@Override
	public double promedioVentaProducto() {
		double promedio = this.cantidadVendidaTotal/2.0;
		return promedio;
	}
	@Override
	public int cantidadVentas() {
		int result = this.cantidadVendidaTotal;
		return result;
	}
	@Override
	public double precioFinal() {
		double iva = 0.21;
		double precio = (this.precioUnitario*this.cantidadVendidaTotal)*iva;
		return precio;
	}
	@Override
	public double precioFinalUnidad() {
		double iva = 0.21;
		double precioUnidad = this.precioUnitario*iva;
		return precioUnidad;
	}
	
	public String getInformacion() {
		String info = new String();
		info = info.concat("Descripcion: " + this.descripcion + "     ");
		info = info.concat("Precio final: " + this.precioFinal() + "     ");
		info = info.concat("Precio final/unidad: " + this.precioFinalUnidad() + "     ");
		info = info.concat("Promedio Venta/Producto: " + this.promedioVentaProducto() + "     ");
		info = info.concat("Cantidad Ventas/producto: " + this.cantidadVentas() + "     ");
		info = info.concat("Ultima compra hace: " + this.cantidadDiasUltComp()+ " dias" + "     ");
		info = info.concat("\n");
		return info;
	}
	
}
