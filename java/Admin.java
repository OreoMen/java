package ayub;

public class Admin extends User{
	private String NGO_name;

	Admin(){
		
	}
	Admin(String NGO_name){
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

}
