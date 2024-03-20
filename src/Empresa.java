import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Empresa {

	
	private String nombre;
	private Map<String, Cliente> coleccionClientes;
	private List<Vehiculo> coleccionVehiculos;
	private List<Reserva> coleccionReserva;
	
	
	public Empresa(String nombre) {
		this.nombre = nombre;
		this.coleccionClientes = new HashMap<>();
		this.coleccionVehiculos = new LinkedList<>();
		this.coleccionReserva = new LinkedList<>();
	}
	
	
	public boolean addVehiculo(Vehiculo v) {
		
		if(v != null && existeVehiculo(v.getMatricula()) == false) {
			
			coleccionVehiculos.add(v);
			return true;
		}
		return false;
	}
	
	public boolean existeVehiculo(String matricula) {
		
		for(int i = 0; i< coleccionVehiculos.size(); i++) {
			
			if(matricula != null && coleccionVehiculos.get(i).getMatricula().equalsIgnoreCase(matricula)) {
				return true;
			}
		}
		return false;
	}
	
	public boolean addCliente(Cliente c) {
		
		if(c != null && existeCliente(c.getDni()) == false) {
			coleccionClientes.put(c.getDni(), c);
			return true;
		}
		return false;
	}
	
	public boolean existeCliente(String dni) {
		
		if(coleccionClientes.get(dni) != null) {
			return true;
		}
		return false;
	}
	
	public boolean hacerReserva(Vehiculo v, Cliente c, String fechaInicio, int cantidadDias, String fechaFin) {
		
		if(existeVehiculo(v.getMatricula()) == true && existeCliente(c.getDni()) == true) {
			
			Reserva nuevaReserva = new Reserva(v,c,fechaInicio,cantidadDias,fechaFin);
			coleccionReserva.add(nuevaReserva);
			return true;	
		}
		
		return false;
	}
	
	
	public float cobrarPrecio(String matricula, float kmRecorridos, int cantidadDias) {
		
		if(existeVehiculo(matricula)) {
			
			for(Reserva unaReserva:coleccionReserva) {
				if(unaReserva.getV().getMatricula().equalsIgnoreCase(matricula)) {
					
					if(kmRecorridos > 500) {
						return (float) unaReserva.getV().getPrecioDia() * cantidadDias + unaReserva.getV().getPrecioDia() * 20/100;	
					}else {
						return (float) unaReserva.getV().getPrecioDia() * cantidadDias;
					}					
					
				}else {
					return 0.f;
				}
			}
			
		}else {
			return 0.f;
		}
		return 0.f;
	}
	
	
	public Coche mostrarCoche(int plazas, String tipoMotor) {
		
		for(Vehiculo unCoche:coleccionVehiculos) {
			
			String mostrar = "";
			if(unCoche instanceof Coche) {
				Coche c;
				c = (Coche) unCoche;
				if(c.getPlazasMax() == plazas && c.getTipoMotor().equalsIgnoreCase(tipoMotor)) {
					
					return "Plazas Maximas: " + c.getPlazasMax() + " Tipo de Motor: "+ c.getTipoMotor();
				}
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
