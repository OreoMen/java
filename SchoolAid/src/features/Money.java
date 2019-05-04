package features;
import java.util.Date;
public class Money extends Donation {

	// final
	private String code = "MN";
	
	// properties
	private double amount;
	private String status;
//	private String cardHolderName; // can be isolated in a different class
//	private String cardNumber;
//	private int cvv;
//	private Date expiryDate;
	
	// constructors
	public Money (String donatorId, int schoolId, double amount) {
		super("Money", donatorId, schoolId);
		this.amount = amount;
		status = "Pending";
		donationId = generateDonationId();
	}
	
	// getters & setters
	public String getStatus() {
		return status;
	}

	public void setStatus() {
		status = "Paid";
	}

	public double getAmount() {
		return amount;
	}

//	public String getCardHolderName() {
//		return cardHolderName;
//	}
//
//	public String getCardNumber() {
//		return cardNumber;
//	}
//
//	public int getCvv() {
//		return cvv;
//	}
//
//	public Date getExpiryDate() {
//		return expiryDate;
//	}

	// methods
	@Override
	public String generateDonationId() {
		// for money 'MN' + random number
		int num = (int) (Math.random() * 10000 + 1);
		return code + String.valueOf(num);
	}

	@Override
	public boolean checkSchoolNeeds() {
		// access school using id
		// check its financial needs
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
	
}
