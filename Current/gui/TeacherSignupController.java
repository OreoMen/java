package gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;

public class TeacherSignupController implements Initializable{

	 @FXML
	 ComboBox<String> donationcombo;
	 ObservableList<String> Subjects = FXCollections.observableArrayList("Math","Science","Biology","Physics","English","IRE");
 	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		donationcombo.setItems(Subjects);
	}
	
	
	public void navigate (String page, String title) throws Exception {
    	Main.root = FXMLLoader.load(getClass().getResource(page + ".fxml"));
        Main.scene = new Scene(Main.root);
    	Main.window.setTitle(title);
        Main.window.setScene(Main.scene);
        Main.window.show();
    }
	
	public void registerButtonClicked() throws Exception{
		System.out.println(donationcombo.getValue());
		navigate("teacherHome","Teacher Home");
	}

}
