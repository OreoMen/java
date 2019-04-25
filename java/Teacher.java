package ayub;

public class Teacher extends Donator{
	private int teachingExperience;
	private String[] schoolsTaught;
	private String[] subjectTaught;
	private String educationDegree;
	
	Teacher(){
		
	}
	Teacher(int E, String[] s,String[] S, String ed){
		teachingExperience = E;
		schoolsTaught = s;
		subjectTaught = S;
		educationDegree = ed;
		
	}
	public void setTeachingEperience(int teachingExperience){
		this.teachingExperience = teachingExperience;
	}
	public int getTeachingExperience(){
		return teachingExperience;
	}
	public void setSchoolsTaught(String[] schoolsTaught){
		for(int i=0;i<schoolsTaught.length;i++){
			this.schoolsTaught[i] = schoolsTaught[i];
		}
	}
	public String[] getSchoolsTaught(){
		return schoolsTaught;	
	}
	public void setSubjectTaught(String[] subjectTaught){
		for(int i=0;i<subjectTaught.length;i++){
			this.subjectTaught[i] = subjectTaught[i];
		}
	}
	public String[] getSubjectTaught(){
		return subjectTaught;	
	}
	public void setEducationDegree(String educationDegree){
		this.educationDegree = educationDegree;
	}
	public String getEducationDegree(){
		return educationDegree;
	}
	public void setUserId() {
		  int num = (int)(Math.random()*10000)+1;
		  userId = "TC "+ String.valueOf(num);
			
	}
	
	


}
