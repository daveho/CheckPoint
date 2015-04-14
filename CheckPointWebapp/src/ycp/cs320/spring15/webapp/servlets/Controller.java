package ycp.cs320.spring15.webapp.servlets;

import ycp.cs320.spring15.model.User;
import ycp.cs320.spring15.persist.DatabaseProvider;
import ycp.cs320.spring15.persist.IDatabase;

public class Controller {

	//Controller for the WebApp. 
	//Calls IDatabase whic is linked to the FakeDatabase
	
	public User signIn(String username, String password) {
		IDatabase db = DatabaseProvider.getInstance();
		return db.findUser(username, password);
	}
	
	public User createAccount(String username, String password, String firstname, String lastname, String email) {
		IDatabase db = DatabaseProvider.getInstance();
		return db.createAccount(username, password, firstname, lastname, email);
	}
	
	public User searchUserByEmail(String email){
		IDatabase db = DatabaseProvider.getInstance();
		return db.searchUserByEmail(email);
	}

}