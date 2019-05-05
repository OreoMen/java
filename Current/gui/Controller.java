package gui;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.*;
import users.Admin;
import users.Donator;
import users.Teacher;

public class Controller implements Initializable {


	
    public void initialize (URL location, ResourceBundle resources) {
    	    	
    }
    
    public void navigate (String page, String title) throws Exception {
    	Main.root = FXMLLoader.load(getClass().getResource(page + ".fxml"));
        Main.scene = new Scene(Main.root);
    	Main.window.setTitle(title);
        Main.window.setScene(Main.scene);
        Main.window.show();
    }
    
    //
    public void login() throws Exception {
    	navigate("login", "Log In");
    	Main.currentUser = null;
    }
    
    // LOGIN - check type of user and navigate to relevant sign up page
    public void signUp() throws Exception {
    	RadioButton admin = (RadioButton) Main.scene.lookup("#admin");
    	RadioButton donator = (RadioButton) Main.scene.lookup("#donator");
    	RadioButton teacher = (RadioButton) Main.scene.lookup("#teacher");
    	if (admin.isSelected()) {
    		adminSignup();
    	}
    	else if (donator.isSelected()) {
    		donatorSignup();
    	}
    	else if (teacher.isSelected()) {
    		teacherSignup();
    	}
    }
    
    public void adminSignup() throws Exception{
    	navigate("adminSignup","Admin Sign Up");		
	}
    
    public void donatorSignup() throws Exception{
    	TextField fName = (TextField) Main.scene.lookup("#fname");
    	TextField lName = (TextField) Main.scene.lookup("#lname");
    	TextField user = (TextField) Main.scene.lookup("#uname");
    	TextField email = (TextField) Main.scene.lookup("#email");
    	TextField address = (TextField) Main.scene.lookup("#address");
    	TextField telNo = (TextField) Main.scene.lookup("#tel");
    	TextField ps = (TextField) Main.scene.lookup("#pas");
    	RadioButton ml = (RadioButton) Main.scene.lookup("#ml");
    	RadioButton fm = (RadioButton) Main.scene.lookup("#fm");
    	DatePicker dt = (DatePicker) Main.scene.lookup("#dt");
    	
    	//store info in  donator ArrayList
    	for(Donator d: Main.donators){
    	((Donator) Main.currentUser).setAddress(address.getText());
    	}

        

    	navigate("donatorSignup","Donator Sign Up");		
	}
    
    public void teacherSignup() throws Exception{
    	navigate("teacherSignup","Teacher Sign Up");		
	}

	// LOGIN - check type of user and navigate to relevant home page
    public void home() throws Exception {
    	RadioButton admin = (RadioButton) Main.scene.lookup("#admin");
    	RadioButton donator = (RadioButton) Main.scene.lookup("#donator");
    	RadioButton teacher = (RadioButton) Main.scene.lookup("#teacher");
    	TextField username = (TextField) Main.scene.lookup("#username");
    	TextField password = (TextField) Main.scene.lookup("#password");
    	if (admin.isSelected() && validAdmin(username.getText(),password.getText())) {
    		System.out.println("logged in");
        		adminHome();
    	}
    	else if (donator.isSelected() && validDonator(username.getText(),password.getText())) {
//    		System.out.println(7);
    		donatorHome();
    	}
    	else if (teacher.isSelected() && validTeacher(username.getText(),password.getText())) {
//    		System.out.println(1);	
    		teacherHome();
    	}
    	else {
    		System.out.println("Invalid username/password");
    	}
    }

   

	public boolean validAdmin(String username, String password) {
    	if (Main.admin != null)
	    	if (username.equals(Main.admin.getUserName()) && password.equals(Main.admin.getPassword())) {
	    		Main.currentUser = Main.admin;
	    		return true;
	    	}
    	return false;
    }
    
    public boolean validDonator (String username, String password) {
    	for (int i = 0; i < Main.donators.size(); ++i) 
			if (username.equals(Main.donators.get(i).getUserName()) && password.equals(Main.donators.get(i).getPassword())) {
	    		Main.currentUser = Main.donators.get(i);
				return true;
			}
    	return false;
    }
    
    public boolean validTeacher (String username, String password) {
    	for (int i = 0; i < Main.donators.size(); ++i) 
    		if (Main.donators.get(i) instanceof Teacher)
	    		if (username.equals(Main.donators.get(i).getUserName()) && password.equals(Main.donators.get(i).getPassword())) {
		    		Main.currentUser = Main.donators.get(i);
	    			return true;
	    		}
    	return false;
    }
    
    //ADMINHOME -choose Existing schools or Add school (Save info in Admin Object)
    public void adminHome() throws Exception {
    	TextField us = (TextField) Main.scene.lookup("#user");
    	PasswordField pas = (PasswordField) Main.scene.lookup("#password");
    	TextField em = (TextField) Main.scene.lookup("#email");
    	TextField ngo = (TextField) Main.scene.lookup("#ngo");
    	
    	//String user = (String)us.getText();
    	//String password = (String)pas.getText();
    	//String email = em.getText();
    	//String NGO = ngo.getText();
    	//`
    	if (!us.getText().trim().isEmpty() && !em.getText().trim().isEmpty() && !pas.getText().trim().isEmpty() && !ngo.getText().trim().isEmpty())
    	    {
    	        	Main.admin2 = new Admin (us.getText(),pas.getText(),em.getText(),ngo.getText());    	
    		}
    	us.setText("");
    	pas.setText("");
    	em.setText("");
    	ngo.setText("");
    	
    	navigate("adminHome","Configure School");
    }
    
    //Existing schools - navigate to view schools page
    public void existingSchoool() throws Exception{
    	navigate("existingSchool","Exisitng Schools");
    }
    
    public void newShool() throws Exception{
    	navigate("addschool","New Schools");
    }
    
    
    // DONATORHOME - navigate to select school page
    public void selectSchool() throws Exception {
    	navigate("selectSchool","Select School");
    }

    // SELECTSCHOOL, DONATESTATIONERY, DONATEMONEY, EXISTINGDONATION - navigate to donator home page
    public void donatorHome() throws Exception {
    	navigate("donatorHome","Donator Home");
    }
    
   
    
    // SELECTSCHOOL - navigate to donate type page
    public void donateType() throws Exception {
    	navigate("donateType","Donation Type");
    }
    
    
    // DONATORHOME - navigate to existing donations page
    public void existingDonation() throws Exception {
    	navigate("existingDonation","My Donations");
    }
    
    // TEACHERHOME - navigate to existing application page
    public void existingApplication() throws Exception {
    	navigate("existingApplication","Existing Application");
    }
    
    // EXISTINGAPPLICATION - navigate to teacher home page
    public void teacherHome() throws Exception {
    	navigate("teacherHome","Teacher Home");
    }
       
}