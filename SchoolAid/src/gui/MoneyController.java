package gui;

import java.net.URL;
import java.util.ResourceBundle;

import features.Money;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import users.Donator;

public class MoneyController implements Initializable {

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
	}	
	
	private Controller controller = new Controller();
	
	public void homePage() throws Exception {
		TextField amountfield = (TextField) Main.scene.lookup("#amount");
		int amount = Integer.parseInt(amountfield.getText());
//		System.out.println(amount);
		((Donator) Main.currentUser).getDonations().add(new Money("don1",12,amount));
		controller.donatorHome();
	}
}
