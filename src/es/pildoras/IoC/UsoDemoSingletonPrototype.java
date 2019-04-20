package es.pildoras.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoDemoSingletonPrototype {

	public static void main(String[] args) {
		// Carga de XML de configuracion		
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext2.xml");
		
		// Peticion de beans al contenedos Spring
		SecretarioEmpleado maria = contexto.getBean("miSecretarioEmpleado",SecretarioEmpleado.class);
		SecretarioEmpleado pedro = contexto.getBean("miSecretarioEmpleado",SecretarioEmpleado.class);
		
		SecretarioEmpleado manolo = contexto.getBean("miSecretarioEmpleado",SecretarioEmpleado.class);
		SecretarioEmpleado juan = contexto.getBean("miSecretarioEmpleado",SecretarioEmpleado.class);
		SecretarioEmpleado ana = contexto.getBean("miSecretarioEmpleado",SecretarioEmpleado.class);
		
		
		System.out.println(maria);
		System.out.println(pedro);
		System.out.println(manolo);
		System.out.println(juan);
		System.out.println(ana);
		
		
		if(maria==pedro) {
			System.out.println("Apunta al mismo objeto");
		}else {
			System.out.println("No se trata del mismo objeto");
		}

	}

}
