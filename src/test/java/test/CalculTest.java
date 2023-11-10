package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import extention.DaoImplV2;
import junit.framework.Assert;
import metier.Metier;

public class CalculTest {

	@Before
	public void setUp() throws Exception {
		

		
	}

	@Test
	public void test() {
		DaoImplV2 dao = new DaoImplV2();
		Metier metier = new Metier(dao); 
		double res = metier.calculer();
		double expected = 75.0;
		Assert.assertTrue(res==expected);
		
	}

}
