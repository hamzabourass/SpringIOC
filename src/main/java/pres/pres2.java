package pres;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Method;
import java.util.Scanner;

import dao.IDao;
import metier.IMetier;

public class pres2 {

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(new File("config.txt"));
		//Lire la premmier line du ficher qui est le nom du clase DaoImpl dans se cas
		String daoClassName = scanner.nextLine();
		
		
		//forname cherche  la classe si il existe puis il la charge en memoire de type class
		 Class<?> cDao =  Class.forName(daoClassName);
		 IDao dao =(IDao) cDao.getDeclaredConstructor().newInstance();
		 //System.out.println(dao.getData());
		 
		 String metierClassName = scanner.nextLine();
		 Class<?> cMetier = Class.forName(metierClassName);
		 IMetier metier = (IMetier) cMetier.getDeclaredConstructor().newInstance();
		 
		 //chercher une methode qui sapple setdao dans cMetier (réflexion Java)
		 Method method = cMetier.getMethod("setDao", IDao.class);
		 //executer la mthode == metier.setDao(dao)
		 method.invoke(metier, dao);
		 System.out.println(metier.calculer());
		

		 
		 
		 
		
		
		
		
		
		
	}

}
