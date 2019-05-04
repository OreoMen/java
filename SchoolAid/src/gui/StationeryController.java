package gui;

import java.net.URL;
import java.util.ResourceBundle;

import features.Stationery;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import users.Donator;

public class StationeryController implements Initializable {

	@FXML
	 ComboBox<String> itemcombo;
	 ObservableList<String> items = FXCollections.observableArrayList("Book","Paper","Bag","Pen/Pencil","Chair","Table","Board");	
	
	@FXML
	ComboBox<String> qntcombo;
	ObservableList<String> qnt = FXCollections.observableArrayList("1","2","3","4","5","6","7");	
	
	 
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		itemcombo.setItems(items);
		qntcombo.setItems(qnt);
	}
	
	private Controller controller = new Controller();
	
	public void homePage() throws Exception {
		String item = itemcombo.getValue();
		int qnt = Integer.parseInt(qntcombo.getValue());
//		System.out.println(item + qnt);
		DatePicker pickup = (DatePicker) Main.scene.lookup("#pickup");
		((Donator) Main.currentUser).getDonations().add(new Stationery("Stationery","don2",12,item,qnt,pickup));
//		System.out.println((Donator) Main.currentUser);
		controller.donatorHome();
	}

}
