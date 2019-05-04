package gui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import features.Stationery;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
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
//    		adminSignup();
    	}
    	else if (donator.isSelected()) {
//    		donatorSignup();
    	}
    	else if (teacher.isSelected()) {
//    		teacherSignup();
    	}
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
//        		adminHome();
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
//    	navigate("teacherHome","Teacher Home");
    }
       
}