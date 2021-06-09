package MODULE.USERS.CLASSES;



public class user {
	
	private String username;
	private String email;
	private String password;
	private String type;
	
	//....CONSTRUCTOR USER...//
	public user(String username, String password, String email, String type) {
		super();
		this.username = username;
		this.email = email;
		this.password = password;
		this.type = type;
	}
	
	public user() {
		
		
	}
	
	public user(String username) {
		this.username = username;
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	
	public boolean equals(Object param) {

		return getUsername().equals(((user) param).getUsername());
	}
	
	
	@Override
	public String toString() {
		String cad = "";
		
		cad = "Username : " + getUsername() + "\n" + "Email :" + getEmail() +   "\n" + "Password : " + getPassword() +  "\n" + "Type : " + getType();
		
		return cad;
	}
	
	
	

}
