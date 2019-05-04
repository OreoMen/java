package users;

import java.util.ArrayList;

import features.Donation;

public class Donator extends User{
	private String firstName;
	private String user;
	private String lastName;
	private int age;
	private String gender;
	private String address;
	private int telNo;
	protected ArrayList<Donation> donations = new ArrayList<Donation>();
	
	public Donator(String userName,String password,String email){
		super(userName,password,email);
	}
	public Donator(String f,String l,int a,String G,String A,int T){
		firstName = f;
		lastName = l;
		age = a;
		gender = G;
		address = A;
		telNo = T;
		
	}
	
	public ArrayList<Donation> getDonations() {
		return donations;
	}
	public void setFirstName(String firstName){
		this.firstName = firstName;
	}
	public String getFirstName(){
		return firstName;
	}
	public void setLastName(String lastName){
		this.lastName = lastName;
	}
	public String getLastName(){
		return lastName;
	}
	public void setAge(int age){
		this.age = age;
	}
	public int getAge(){
		return age;
	}
	public void setGender(String gender){
		this.gender = gender;
	}
	public String getGender(){
		return gender;
	}
	public void setTelNo(int telNo){
		this.telNo = telNo;
	}
	public int getTelNo(){
		return telNo;
	}
	@Override
	public void setUserId() {
	  int num = (int)(Math.random()*10000)+1;
	  userId = "DN "+ String.valueOf(num);
		
	}
	
	

}
