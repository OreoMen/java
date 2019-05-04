package features;

import java.util.Date;

public abstract class Donation {
	
	//  properties
	protected String donationId;
	protected String type;
	protected Date dateDonated;
//	protected Donator donator; 
//	protected School school;
	
	// constructors
	Donation (String type, String donatorId, int schoolId) {
		this.type = type;
//		this.donatorId = donatorId;
//		this.schoolId = schoolId;
		dateDonated = new Date();
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

//	public String getDonatorId() {
//		return donatorId;
//	}
//
//	public int getSchoolId() {
//		return schoolId;
//	}
	
	// methods
	public abstract String generateDonationId();
	
	public abstract boolean checkSchoolNeeds();
	
	public abstract boolean checkSchoolAcceptance();
	
}
