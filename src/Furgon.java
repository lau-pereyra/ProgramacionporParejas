
public class Furgon extends Vehiculo{

    private float cargaMax;
    private int plazas;
    

    public Furgon(String matricula, String modelo, String marca, String tipoMotor, float kmRecorridos,
            float precioDia,float cargaMax,int plazas) {
        super(matricula, modelo, marca, tipoMotor, kmRecorridos, precioDia);

        this.cargaMax = cargaMax;
        this.plazas = plazas;

    }


    public float getCargaMax() {
        return cargaMax;
    }


    public void setCargaMax(float cargaMax) {
        this.cargaMax = cargaMax;
    }


    public int getPlazas() {
        return plazas;
    }


    public void setPlazas(int plazas) {
        this.plazas = plazas;
    }

	@Override
	public String toString() {
		return "Furgon [cargaMax=" + cargaMax + ", plazas=" + plazas + "]";
	}

    
   


}
