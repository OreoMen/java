package users;

import java.util.ArrayList;

import others.School;

public class Admin extends User{
	private String NGO_name;
	public static ArrayList<School> schools = new ArrayList<School>();
	
	public Admin(){
		
	}
	public Admin(String userName,String password,String email, String NGO_name){
		super(userName, password,email);
		setUserId();
		setNgoName(NGO_name);
	}
	public void setNgoName(String NGO_name){
		this.NGO_name = NGO_name;
	}
	public String getNgoName(){
		return NGO_name;
	}
	
	@Override
	public void setUserId() {
		 int num = (int)(Math.random()*10000)+1;
		 userId = "AD "+ String.valueOf(num);
	}
	public static ArrayList<School> school= new ArrayList<School>();

}
