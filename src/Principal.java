import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Empresa miEmpresa = new Empresa("VehiculosCarlitos");
		Scanner sc = new Scanner(System.in);
		int opcion;
		boolean continuar = true;

		//Datos genericos de un vehiculo
		String matricula, modelo, marca, tipoMotor;
		float kmRecorridos, precioDia;
		boolean alquilado;

		//Datos de un furgon
		float cargaMax;
		int plazas;

		//Datos de un coche
		int plazasMax,puertas;
		float volumen;
		String tipo;

		//Datos de un camion
		float longitud;

		//Datos de un cliente
		String nombre, apellidos, email, dni, telefono, numeroTarjeta;

		//Datos de una reserva (Vehiculos y clientes)
		int cantidadDias;

		while (continuar == true){
            System.out.println("1.- Dar de alta un vehiculo\n2.- Añadir Cliente\n3.- Alquilar un vehiculo\n4.- Listar vehiculos\n5.-Devolver vehiculo\n6.-Salir");
            opcion = Integer.valueOf(sc.nextLine());

            switch (opcion) {
                case 1:
                System.out.println("Introduzca el tipo de vehiculo que desea añadir 1-Coche\n2-Furgon\n3-Camion");
                opcion = Integer.valueOf(sc.nextLine());
                switch (opcion) {
                    case 1:
                    System.out.println("Matricula");
                    matricula = sc.nextLine();
                    System.out.println("Modelo");
                    modelo = sc.nextLine();
                    System.out.println("Marca");
                    marca = sc.nextLine();
                    System.out.println("Tipo de motor: Electrico,Hibrido Enchufable,Hibrido,Gasolina,Diesel");
                    tipoMotor = sc.nextLine();
                    System.out.println("Kilometros");
                    kmRecorridos = Float.valueOf(sc.nextLine());
                    System.out.println("Precio por dia");
                    precioDia = Integer.valueOf(sc.nextLine());
                    System.out.println("Alquilado");
                    alquilado = Boolean.valueOf(sc.nextLine());
                    System.out.println("Plazas Maximas");
                    plazasMax = Integer.valueOf(sc.nextLine());
                    System.out.println("Puertas");
                    puertas = Integer.valueOf(sc.nextLine());
                    System.out.println("Volumen maletero");
                    volumen = Float.valueOf(sc.nextLine());
                    System.out.println("Tipo de coche: Utilitario,Berlina,Monovolumen,Suv");
                    tipo = sc.nextLine();


                    Coche miCoche = new Coche(matricula, modelo, marca, tipoMotor
                    ,kmRecorridos, precioDia, alquilado, tipo, volumen, plazasMax, puertas);
                    
                    miEmpresa.addVehiculo(miCoche);

                    System.out.println("Coche añadido");
                    break;

                    case 2:

                    System.out.println("Matricula");
                    matricula = sc.nextLine();
                    System.out.println("Modelo");
                    modelo = sc.nextLine();
                    System.out.println("Marca");
                    marca = sc.nextLine();
                    System.out.println("Tipo de motor: Electrico,Hibrido Enchufable,Hibrido,Gasolina,Diesel");
                    tipoMotor = sc.nextLine();
                    System.out.println("Kilometros");
                    kmRecorridos = Float.valueOf(sc.nextLine());
                    System.out.println("Precio por dia");
                    precioDia = Integer.valueOf(sc.nextLine());
                    System.out.println("Alquilado?");
                    alquilado = Boolean.valueOf(sc.nextLine());
                    System.out.println("Carga Maxima");
                    cargaMax = Float.valueOf(sc.nextLine());
                    System.out.println("Plazas Asientos");
                    plazas = Integer.valueOf(sc.nextLine());



                    Furgon miFurgon = new Furgon(matricula, modelo, marca, tipoMotor
                    ,kmRecorridos, precioDia, alquilado, cargaMax,plazas);
                    
                    miEmpresa.addVehiculo(miFurgon);

                    System.out.println("Furgon añadido");
                    break;

                    case 3:
                    System.out.println("Matricula");
                    matricula = sc.nextLine();
                    System.out.println("Modelo");
                    modelo = sc.nextLine();
                    System.out.println("Marca");
                    marca = sc.nextLine();
                    System.out.println("Tipo de motor: Electrico,Hibrido Enchufable,Hibrido,Gasolina,Diesel");
                    tipoMotor = sc.nextLine();
                    System.out.println("Kilometros");
                    kmRecorridos = Float.valueOf(sc.nextLine());
                    System.out.println("Precio por dia");
                    precioDia = Integer.valueOf(sc.nextLine());
                    System.out.println("Alquilado?");
                    alquilado = Boolean.valueOf(sc.nextLine());
                    System.out.println("Carga Maxima");
                    cargaMax = Float.valueOf(sc.nextLine());
                    System.out.println("Longitud");
                    longitud = Float.valueOf(sc.nextLine());

                    Camion miCamion = new Camion(matricula, modelo, marca, tipoMotor
                    ,kmRecorridos, precioDia, alquilado, cargaMax,longitud);
                    
                    miEmpresa.addVehiculo(miCamion);

                    System.out.println("Furgon añadido");

                        
                        break;
                    default: break;
                        
                }
                break;

                case 2:
  
                System.out.println("Nombre del cliente");
                nombre = sc.nextLine();
                System.out.println("Apellidos");
                apellidos = sc.nextLine();
                System.out.println("Email");
                email = sc.nextLine();
                System.out.println("Telefono");
                telefono = sc.nextLine();
                System.out.println("DNI");
                dni = sc.nextLine();
                System.out.println("Numero de la tarjeta");
                numeroTarjeta = sc.nextLine();

                Cliente nuevoCliente = new Cliente(nombre, apellidos, email, telefono, dni, numeroTarjeta);

                if (miEmpresa.addCliente(nuevoCliente)== true){
                    System.out.println("Cliente añadido");
                }else System.out.println("No se pudo añadir el cliente, ya existe en la base de datos");
                   
                    break;

                case 3:
				System.out.println("Escribe la Matricula");
				matricula= sc.nextLine();

				System.out.println("Escribe los dias para alquilar");
				int diasAlquilar = Integer.valueOf(sc.nextLine());
				
				System.out.println("Escribe el dni del Cliente");
				dni = sc.nextLine();
				
				
				if(miEmpresa.buscarCliente(dni) != null && miEmpresa.buscarVehiculo(matricula) != null) {
					
					miEmpresa.hacerReserva(miEmpresa.buscarVehiculo(matricula), miEmpresa.buscarCliente(dni), diasAlquilar);
					
					miEmpresa.buscarVehiculo(matricula).setAlquilado(true);
					System.out.println("Vehiculo reservado con Exito!");
				}
                    
                break;

                case 4:
                //Como forma chapucera podria poner el array protected y 
                System.out.println("Que lista de vehiculos quiere 1-Coche 2-Furgon 3-Camion");
                opcion = Integer.valueOf(sc.nextLine());
                switch (opcion) {
                    case 1:
                    System.out.println("Por favor introduca las plazas maximoas");
						plazasMax = Integer.valueOf(sc.nextLine());

						System.out.println("por favor introduca el tipo de motor");
						tipo = sc.nextLine();
						
						for(Coche co : miEmpresa.mostrarCoche(plazasMax, tipo)) {
							
							System.out.println(co.toString());
														
						}
                        break;

                    case 2: 
                    System.out.println("Por favor introduca la carga que tiene que soportar el vehiculo");
						int carga = Integer.valueOf(sc.nextLine());

						System.out.println("por favor introduca las plazas del furgon");
						plazas = Integer.valueOf(sc.nextLine());
						
						for(Furgon f : miEmpresa.mostrarFurgon(carga, plazas)) {
							
							System.out.println(f.toString());
														
						}
                    break;

                    case 3:
                    System.out.println("por favor introduca la carga que tiene que soportar el vehiculo");
						int CargaEsco = Integer.valueOf(sc.nextLine());

						System.out.println("por favor introduca l lonqutud maxima");
						int longitudEsco = Integer.valueOf(sc.nextLine());
						
						for(Camion c : miEmpresa.mostrarCamion(CargaEsco, longitudEsco)) {
							
							System.out.println(c.toString());
														
						}
                
                   
                        break;
                }
                

                break;
                case 5:
                System.out.println("Introduce la matricula del vehiculo");
                matricula = sc.nextLine();
                System.out.println("Introduce los kilometros totales conducidos");
                kmRecorridos = Float.valueOf(sc.nextLine());
                System.out.println("Introduce los dias que alquilo el vehiculo");
                cantidadDias = Integer.valueOf(sc.nextLine());

                System.out.println("El precio a cobrar es: "+miEmpresa.cobrarPrecio(matricula, kmRecorridos, cantidadDias)); 


                break;
                case 6:
                    System.out.println("Hasta la proxima!!");
                    continuar = false;
                    break;
            
                default:
                System.out.println("Introduzca una opcion valida");
                    break;
            }

        }
        sc.close();


	}

}
