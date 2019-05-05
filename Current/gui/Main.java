package gui;

import java.util.ArrayList;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import users.*;

public class Main extends Application {

	public static Admin admin = new Admin("NGO","ngo123", "ngo@gmail.com", "NGO-Malaysia");
	public static Admin admin2;
	public static ArrayList<Donator> donators = new ArrayList<Donator>();
	public static User currentUser;
	
	public static void main(String [] args) {
		donators.add(new Donator("don1","1111",""));
		donators.add(new Teacher("tea2","2222",""));
		launch(args);
	}
	
	public static Stage window = new Stage();
	public static Scene scene;
	public static Parent root;
	
	@Override
	public void start(Stage arg0) throws Exception {
		root = FXMLLoader.load(getClass().getResource("login.fxml"));
        scene = new Scene(root);
    	window.setTitle("Log In");
        window.setScene(scene);
        window.show();
	}
}
