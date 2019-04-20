package es.pildoras.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		// Creacion de objetos de tipo empleado
		Empleados empleado1 = new DirectorEmpleado();
		
		//Uso de objetos creados
		System.out.println(empleado1.getTareas());
		*/
		
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		/*
		Empleados juan = contexto.getBean("miEmpleado",Empleados.class);		
		//Uso de objetos creados
		System.out.println(juan.getTareas());
		System.out.println(juan.getInforme());
		*/
		
		/*
		SecretarioEmpleado maria = contexto.getBean("miSecretarioEmpleado",SecretarioEmpleado.class);
		//Uso de objetos creados
		System.out.println(maria.getTareas());
		System.out.println(maria.getInforme());		
		System.out.println("Email: "+maria.getEmail());
		System.out.println(maria.getNombreEmpresa());
		*/
		
		DirectorEmpleado juan = contexto.getBean("miEmpleado",DirectorEmpleado.class);		
		//Uso de objetos creados
		System.out.println(juan.getTareas());
		System.out.println(juan.getInforme());
		System.out.println("Email: "+juan.getEmail());
		System.out.println(juan.getNombreEmpresa());
		
		
		contexto.close();
		
	}

}
