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

public class TypeController implements Initializable {

	 @FXML
	 ComboBox<String> donationcombo;
	 ObservableList<String> types = FXCollections.observableArrayList("Stationery","Money");
 	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		donationcombo.setItems(types);
	}
	
	public void navigate (String page, String title) throws Exception {
    	Main.root = FXMLLoader.load(getClass().getResource(page + ".fxml"));
        Main.scene = new Scene(Main.root);
    	Main.window.setTitle(title);
        Main.window.setScene(Main.scene);
        Main.window.show();
    }
	
	// DONATETYPE - check type of donation and navigate to relevant donation page
    public void donation() throws Exception {
    	if(donationcombo.getValue()  == "Stationery") {
    		navigate("donateStationery", "Stationery Donation");
    	}
    	else if (donationcombo.getValue() == "Money") {
    		navigate("donateMoney","Money Donation");
    	}
    }
    

}
