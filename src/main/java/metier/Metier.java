package metier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import dao.IDao;


@Component
public class Metier implements IMetier {
	
	private IDao dao;

	public Metier(IDao dao) {
		super();
		this.dao = dao;
	}

	/* 
	 * la classe presentation n'est pas fermer a la modificatipn car on doit changer dans le code 
	 * 
	 * */

		// TODO Auto-generated constructor stub
	

	
	//Couplage faible
	
	

	public void setDao(IDao dao) {
		this.dao = dao;
	}

	public double calculer() {
		double temp = dao.getData();
		double rs = temp * 5;
		return rs;
	}
	
	//Pour Injecter dans la variable dao un objet d'une classe qui implemente cette classe IDao


}
