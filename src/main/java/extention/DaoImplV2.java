package extention;

import org.springframework.stereotype.Component;

import dao.IDao;
@Component("dao2")
public class DaoImplV2 implements IDao {

	public double getData() {
		System.out.println("Version Data par Capteur......");
		double temp = 15;
		return temp;
	}

	

}
