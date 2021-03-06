package ycp.cs320.spring15.persist;

import java.util.ArrayList;

import ycp.cs320.spring15.model.User;

/*Created by Shawn O'Brien 3/10/15
 * 
 */

/*Contains array list of all users
 * Methods for managing the users
 */

public class UserList {

	private ArrayList<User> userList;
	


	public UserList(){
		userList =  new ArrayList<User>();
	}


	//Contains boolean   
	public boolean containsUser(String username){
		for (int i = 0; i < userList.size(); i++){
			if (userList.get(i).getUsername().equals(username)){
				return true;
			}
		}
		
		return false;
		
	}
	
	//Check to see if Email address is already used
	public boolean containsEmail(String email){
		for (int i = 0; i < userList.size(); i++){
			if (userList.get(i).getEmail().equals(email)){
				return true;
			}
		}
		
		return false;
		
	}
	
	
	//returns a user object with the given username
	public User getUser(String username){
		//int index = userList.indexOf(username);
		//return userList.get(index);
		for (int i = 0; i < userList.size(); i++){
			if (userList.get(i).getUsername().equals(username)){
				return userList.get(i);
			}
		}	
			return null;
		
	}
	
	//Retunrs user by searching by email
	public User getUserByEmail(String email){
		//int index = userList.indexOf(username);
		//return userList.get(index);
		for (int i = 0; i < userList.size(); i++){
			if (userList.get(i).getEmail().equals(email)){
				return userList.get(i);
			}
		}	
			return null;
		
	}
	
	/*creates a new User object in the list with given username and password. 
	 *here cannot be any repeat usernames.  Returns true if user creation successful, 
	 * false if user creation failed
	 */
	boolean CreateUser(String username, String password, String firstname, String lastname, String email){
		//Use containseUser to check to see if user already exists. 
		if (containsUser(username) == false){
			userList.add(new User(username, password, firstname, lastname, email));
			return true;
		}else{
			return false;
		}
		
		
	}
	
	public void addUser(User newUser){
		userList.add(newUser);
	}
	
	//removes the given user from users
	public void deleteUser(User user){
		userList.remove(user);
	}
	
	//returns Users
	//added Usere to arraylist return
	public ArrayList<User> getUserList(){
		return userList;
	}
	
	
		
}
