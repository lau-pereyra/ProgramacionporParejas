
public class Coche extends Vehiculo {


    private int plazasMax,puertas;
    private float volumen;
    private String tipo;
    public Coche(String matricula, String modelo, String marca, String tipoMotor, float kmRecorridos,
         float precioDia,String tipo,float volumen,int plazasMax,int puertas) {
        super(matricula, modelo, marca, tipoMotor, kmRecorridos, precioDia);
        this.plazasMax = plazasMax;
        this.puertas = puertas;
        this.volumen = volumen;
        this.tipo = tipo;

    }
    
    public int getPlazasMax() {
        return plazasMax;
    }
    public void setPlazasMax(int plazasMax) {
        this.plazasMax = plazasMax;
    }
    public int getPuertas() {
        return puertas;
    }
    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }
    public float getVolumen() {
        return volumen;
    }
    public void setVolumen(float volumen) {
        this.volumen = volumen;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    

}
