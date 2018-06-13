package model;

public class ModelFacade {
	public String authenticate(String eid, String username, String password) {
		User obj = new User();
		return obj.authenticate(eid, username, password);
	}
	
	public String authenticate(String username, String password) {
		Employer obj = new Employer();
		
		return obj.authenticate(username, password);
	}
}