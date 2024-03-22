
public class Vehiculo {

	private String matricula, modelo, marca, tipoMotor;
	private float kmRecorridos, precioDia;
	private boolean alquilado;
	
	
	public Vehiculo(String matricula, String modelo, String marca, String tipoMotor, float kmRecorridos,
			float precioDia,boolean alquilado) {
		this.matricula = matricula;
		this.modelo = modelo;
		this.marca = marca;
		this.tipoMotor = tipoMotor;
		this.kmRecorridos = kmRecorridos;
		this.precioDia = precioDia;
		this.alquilado = alquilado;
	}


	public String getMatricula() {
		return matricula;
	}


	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getTipoMotor() {
		return tipoMotor;
	}


	public void setTipoMotor(String tipoMotor) {
		this.tipoMotor = tipoMotor;
	}


	public float getKmRecorridos() {
		return kmRecorridos;
	}


	public void setKmRecorridos(float kmRecorridos) {
		this.kmRecorridos = kmRecorridos;
	}


	public float getPrecioDia() {
		return precioDia;
	}


	public void setPrecioDia(float precioDia) {
		this.precioDia = precioDia;
	}


	public boolean isAlquilado() {
		return alquilado;
	}


	public void setAlquilado(boolean alquilado) {
		this.alquilado = alquilado;
	}
	
	
	
}
