package aprendiendojava.model;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware
 * @cursos gcoronelc.github.io
 */
public class ProductoModel {

	private int id;
	private String nombre;
	private double precio;
	private boolean activo;

	public ProductoModel() {
		this.id = 7000;
		this.nombre = "producto Chevere";
		this.precio = 380.12;
		this.activo = true;
	}

	public ProductoModel(int id, String nombre, double precio, boolean activo) {
		this.id = id;
		this.nombre = nombre;
		this.precio = precio;
		this.activo = activo;
		System.out.println("Objeto " + id + " creado.");
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("Chau objeto.");
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

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}
	
	
}
