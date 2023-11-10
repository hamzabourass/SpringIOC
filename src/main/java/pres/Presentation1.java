package pres;

import metier.*;
import dao.*;

public class Presentation1 {

	public static void main(String[] args) {
	

		DaoImpl dao = new DaoImpl();
		Metier metier = new Metier(dao);



		//injection des dependence par instanciation statique (new) en utilisant setter
		metier.setDao(dao);
		System.out.println(metier.calculer());
		
		
		

	}

}
