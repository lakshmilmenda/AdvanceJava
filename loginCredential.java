package model;

public class loginCredential {

	String uname;
	String password;
	
	
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public boolean checkLogin()
	{
		if(uname.equals("NIIT") && password.equals("12345"))
		return true;
		else 
			return false;
			
	}
	
}
