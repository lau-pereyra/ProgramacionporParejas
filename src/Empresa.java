import java.util.ArrayList;
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
	
	public boolean hacerReserva(Vehiculo v, Cliente c, int cantidadDias) {
		
		if(existeVehiculo(v.getMatricula()) == true && existeCliente(c.getDni()) == true) {
			
			Reserva nuevaReserva = new Reserva(v,c,cantidadDias);
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
	
	
	public ArrayList<Coche> mostrarCoche(int plazas, String tipoMotor) {

		ArrayList<Coche> misCoches = new ArrayList<>();

		for (Vehiculo c : coleccionVehiculos) {

			if (c instanceof Coche && ((Coche) c).getPlazasMax() >= plazas && c.getTipoMotor().equalsIgnoreCase(tipoMotor)) {
				misCoches.add((Coche) c);

			}

		}
		return misCoches;
	}
	
	public ArrayList<Furgon> mostrarFurgon(int plaza, int carga) {

		ArrayList<Furgon> misFurgon = new ArrayList<>();

		for (Vehiculo c : coleccionVehiculos) {

			if (c instanceof Furgon && ((Furgon) c).getPlazas() >= plaza && ((Furgon) c).getCargaMax()>=carga ) {

				misFurgon.add((Furgon) c);
			}

		}
		return misFurgon;

	}
	
	public ArrayList<Camion> mostrarCamion(int longitud, int carga) {

		ArrayList<Camion> misFurgon = new ArrayList<>();

		for (Vehiculo c : coleccionVehiculos) {

			if (c instanceof Camion && ((Camion) c).getLongitud() >= longitud && ((Camion) c).getCargaMax() >= carga ) {

				misFurgon.add((Camion) c);
			}
		}
		return misFurgon;

	}

	public Cliente buscarCliente(String id) {
		return coleccionClientes.get(id);
		//TE DA LA INFORMACION DE LA CLAVE PRINCIPAL
	}
	
	
	public Vehiculo buscarVehiculo(String matricula) {
		
		for(int i = 0; i < coleccionVehiculos.size();i++) {
			
			if(coleccionVehiculos.get(i).getMatricula().equals(matricula)) {
				
				return coleccionVehiculos.get(i);
			}
			
		}
		
		return null;
	}
	
	
	
	
	
	
	
}
