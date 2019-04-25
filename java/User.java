package ayub;

import java.util.Date;

public abstract class  User {
	protected String userId;
	private String userName;
	private String password;
	private String email;
	private Date dateEnrolled = new Date();
	
	User(){
		
	}
	User(String userId,String userName,String password,String email){
		this.userId = userId;
		this.userName =userName;
		this.password = password;
		this.email = email;
	
	}
	public abstract void setUserId();
	public String getUserId(){
		return userId;
	}
	public void setUserName(String userName){
		this.userName =userName;
	}
	public String getUserName(){
		return userName;
	}
	public void setPassword(String password){
		this.password = password;
	}
	public String getPassword(){
		return password;
	}
	public void setEmail(String email){
		this.email = email;
	}
	public String getEmail(){
		return email;
	}
	public Date getDateEnrolled(){
		return dateEnrolled;
	}

}
