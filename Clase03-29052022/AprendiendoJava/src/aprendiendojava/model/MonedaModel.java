package aprendiendojava.model;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware
 * @cursos gcoronelc.github.io
 */
public class MonedaModel {
	
	private String nombre;
	private int valor;
	private int cantidad;

	public MonedaModel() {
	}

	public MonedaModel(String nombre, int valor, int cantidad) {
		this.nombre = nombre;
		this.valor = valor;
		this.cantidad = cantidad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		String reporte;
		reporte = nombre + "\t" + cantidad;
		return reporte;
	}
	
	

}
