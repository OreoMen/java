package features;

import java.util.Date;

public class Application {
	private String teacherId;
	private String schoolId;
	private String status;
	private Date dateOfApplication = new Date();
	
	Application(){
		
	}
	Application(String t, String s,String S){
		teacherId = t;
		schoolId = s;
		status = S;
		
	}
	public String getSchoolId(){
		return schoolId;
	}
	public String getTeacherId(){
		return teacherId;
	}
	public void setStatus(String status){
		this.status = status;
	}
	public String getStatus(){
		return status;
	}
	public Date getDateOfApplication(){
		return dateOfApplication;
	}
	

}
