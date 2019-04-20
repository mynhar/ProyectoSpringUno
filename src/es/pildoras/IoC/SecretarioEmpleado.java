package es.pildoras.IoC;

public class SecretarioEmpleado implements Empleados {
	
	/*
	Creacion de campo tipo CreacionInforme (interfaz)
	Inyeccion de dependias con un setter
	*/
	private CreacionInformes informeNuevo;
	private String email;
	private String nombreEmpresa;

	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}

	/*
	 *	Inyeccion de dependias con un setter
	 */
	public void setInformeNuevo(CreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Gestionas la agenda de los jefes";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Informe generado por el Secretario "+informeNuevo.getInforme();
	}

}
