package pres;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import metier.IMetier;

public class PresSpringXML {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		IMetier metier = (IMetier) context.getBean("metier");
		System.out.println("Resultat = " + metier.calculer());

	}

}
