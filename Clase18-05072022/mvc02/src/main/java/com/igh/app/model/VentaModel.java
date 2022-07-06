package com.igh.app.model;

public class VentaModel {
	
	private double precio;
	private int cantidad;
	private double importe;
	
	public VentaModel() {
	}
	
	

	public VentaModel(double precio, int cantidad) {
		super();
		this.precio = precio;
		this.cantidad = cantidad;
		this.importe = precio*cantidad;
	}



	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getImporte() {
		return importe;
	}

	public void setImporte(double importe) {
		this.importe = importe;
	}

	
}
