package features;
import java.util.Date;

import javafx.scene.control.DatePicker;
public class Stationery extends Donation {

	// final
	private String code = "ST";
	
	// properties
	private String name;
	private int quantity;
	private DatePicker pickup;
	
	// constructors
	public Stationery (String type, String donatorId, int schoolId, String name, int quantity, DatePicker pickup2) {
		super(type, donatorId, schoolId);
		this.name = name;
		this.quantity = quantity;
		this.pickup = pickup2;
		donationId = generateDonationId();
	}
	
	// getters & setters / setters might represent another confirmation GUI page only || removed
	public String getName() {
		return name;
	} 

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public DatePicker getPickup() {
		return pickup;
	}

	public void setPickup(DatePicker pickup) {
		this.pickup = pickup;
	}

	// methods
	@Override
	public String generateDonationId() {
		// for stationery 'ST' + random number
		int num = (int) (Math.random() * 10000 + 1);
		return code + String.valueOf(num);
	}
	
	@Override
	public boolean checkSchoolNeeds() {
		// access school using id
		// check its stationery needs
			// if it needs return true
			// else return false
		return false;
	}

	@Override
	public boolean checkSchoolAcceptance() {
		// access school using id
		// check its acceptance
			// if it accepts return true
			// else return false
		return false;
	}
	
	public boolean checkPickUpAvailability() {
		// compare chosen slot with all donations' slots
			// if a match is found return false
			// else return true
		return false;
	}
	
}
