package Features;
import java.util.Date;
public class Stationery extends Donation {

	// final
	public static String [] stationeries = {"Book", "Pen", "Bag"}; // represent a list of items possible for donation / edited by admin
	private String code = "ST";
	
	// properties
	private String name;
	private int quantity;
	private Date pickup; // pickup will be in slots of 1 hour each / user chooses a slot / check if this slot is not taken / displayed slots: ... / range of hours: ...
	
	// constructors
	public Stationery (String type, String donatorId, int schoolId, String name, int quantity, Date pickup) {
		super(type, donatorId, schoolId);
		this.name = name;
		this.quantity = quantity;
		this.pickup = pickup;
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

	public Date getPickup() {
		return pickup;
	}

	public void setPickup(Date pickup) {
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
