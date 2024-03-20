
public class Reserva {

	private Vehiculo v;
	private Cliente c;
	private int cantidadDias;
	
	public Reserva(Vehiculo v, Cliente c, int cantidadDias) {
		this.v = v;
		this.c = c;
		this.cantidadDias = cantidadDias;
	}

	public Vehiculo getV() {
		return v;
	}

	public void setV(Vehiculo v) {
		this.v = v;
	}

	public Cliente getC() {
		return c;
	}

	public void setC(Cliente c) {
		this.c = c;
	}


	public int getCantidadDias() {
		return cantidadDias;
	}

	public void setCantidadDias(int cantidadDias) {
		this.cantidadDias = cantidadDias;
	}
	
	
	
}
