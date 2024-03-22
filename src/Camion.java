
public class Camion extends Vehiculo {

    private float cargaMax,longitud;
    

    public Camion(String matricula, String modelo, String marca, String tipoMotor, float kmRecorridos,
            float precioDia,float cargaMax,float longitud) {
        super(matricula, modelo, marca, tipoMotor, kmRecorridos, precioDia);
        this.cargaMax = cargaMax;
        this.longitud = longitud;


    }


    public float getCargaMax() {
        return cargaMax;
    }


    public void setCargaMax(float cargaMax) {
        this.cargaMax = cargaMax;
    }


    public float getLongitud() {
        return longitud;
    }


    public void setLongitud(float longitud) {
        this.longitud = longitud;
    }


	@Override
	public String toString() {
		return "Camion [cargaMax=" + cargaMax + ", longitud=" + longitud + "]";
	}

    



}
