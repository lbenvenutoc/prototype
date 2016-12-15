package lbenvenutoc.com.prototype;

public class LCD extends Televisor {

	private double costoFabricacion;

	public LCD(String marca, int pulgadas, String color, double precio,
			double costoFabricacion) {
		super(marca, pulgadas, color, precio);
		this.costoFabricacion = costoFabricacion;
	}

	public double getCostoFabricacion() {
		return costoFabricacion;
	}

	public void setCostoFabricacion(double costoFabricacion) {
		this.costoFabricacion = costoFabricacion;
	}

}
