package Fourwheller.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Loginuser {
	@Id
	private String userName;
	private String password;
	
	public Loginuser() {
		
	}
	

	


	public String getUserName() {
		return userName;
	}





	public void setUserName(String userName) {
		this.userName = userName;
	}





	public String getPassword() {
		return password;
	}





	public void setPassword(String password) {
		this.password = password;
	}





	


	@Override
	public String toString() {
		return "Loginuser [userName=" + userName + ", password=" + password + "]";
	}





	
	
	
}
