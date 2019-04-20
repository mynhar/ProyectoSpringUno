package es.pildoras.IoC;

public class JefeEmpleado implements Empleados{

	//Creacion de campo tipo CreacionInforme (interfaz)
	private CreacionInformes informeNuevo;
	
	public JefeEmpleado(CreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}
	
	public String getTareas() {
		return "Gestiono las cuestiones relativas a mis empleados de seccion";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Informe presentado por el Jefe con arreglos: "+informeNuevo.getInforme();
	}

}
