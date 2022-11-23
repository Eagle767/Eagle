package servicepack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import daopack.DataAccessObject;

@Service
public class ServiceTest {
	
	@Autowired
	private DataAccessObject dao;

	public DataAccessObject getDao() {
		return dao;
	}

	public void setDao(DataAccessObject dao) {
		this.dao = dao;
	}
	
	public void service() {
		
		System.out.println("Service is called..........");
		
		dao.dao();
		
	}

}
