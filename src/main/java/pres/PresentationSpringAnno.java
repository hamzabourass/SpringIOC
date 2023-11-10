package pres;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import metier.IMetier;

public class PresentationSpringAnno {
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext("dao","metier","extention");
		IMetier metier = context.getBean(IMetier.class);
		
		
		System.out.println("Resultat 2 = " + metier.calculer());
		
		
		
		
		
	}

}
