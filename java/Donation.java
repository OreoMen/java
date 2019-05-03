package Features;

import java.util.Date;

public abstract class Donation {
	
	//  properties
	protected String donationId; // M001 S001 --- (M)oney && (S)tationery
	protected String type;
	protected Date dateDonated;
	protected String donatorId; // relating Donation with Donator
	protected int schoolId; // relating Donation with School
	
	// constructors
	Donation (String type, String donatorId, int schoolId) {
		this.type = type;
		this.donatorId = donatorId;
		this.schoolId = schoolId;
		dateDonated = new Date();
		// donationId = ??
	}
	
	// getters & setters
	public String getDonationId() {
		return donationId;
	}

	public String getType() {
		return type;
	}

	public Date getDateDonated() {
		return dateDonated;
	}

	public String getDonatorId() {
		return donatorId;
	}

	public int getSchoolId() {
		return schoolId;
	}
	
	// methods
	public abstract String generateDonationId();
	
	public abstract boolean checkSchoolNeeds();
	
	public abstract boolean checkSchoolAcceptance();
	
}
