package es.pildoras.IoC;

public class DirectorEmpleado implements Empleados {

	//Creacion de campo tipo CreacionInforme (interfaz)
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
	
	// Creacion de constructor que inyecta la dependencia
	public DirectorEmpleado(CreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo; 
	}
	
	
	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Gestionas la planilla de la empresa";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Informe creado por el director: "+ informeNuevo.getInforme();
	}
	
	//metodo init. Ejecutar tareas antes de que el bean este disponible.
	public void metodoInicial() {
		System.out.println("Dentro del metodo Init. Aqui irian las tareas ejecutar antes de que el bean este listo");
	}
	
	
	//metodo destroy. Ejecutar tareas despues de que el bean haya sido utilizado.
	public void metodoFinal() {
		System.out.println("Dentro del metodo destroy. Aqui irian las tareas ejecutar despues de utilizar el bean");
	}
	

}
