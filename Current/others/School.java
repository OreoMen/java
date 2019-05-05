package others;

public class School {
	
	// final
	private String code = "SC";
	
	// properties
	private String schoolId;
	private String name;
	private String street; // address isolated?
	private String city;
	private String type; // description isolated?
	private String level;
	private double money;
	private int teachers;
	private boolean stationery;
	private boolean acceptDonation;
	
	// constructors
	public School (String id, String nm, String st, String ct, String tp, String lv, double amt, int tr, boolean sn, boolean ad) {
		schoolId = generateSchoolId();
		name = nm;
		street = st;
		city = ct;
		type = tp;
		level = lv;
		money = amt;
		teachers = tr;
		stationery = sn;
		acceptDonation = ad;
	}

	// getters & setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}

	public int getTeachers() {
		return teachers;
	}

	public void setTeachers(int teachers) {
		this.teachers = teachers;
	}

	public boolean isStationery() {
		return stationery;
	}

	public void setStationery(boolean stationery) {
		this.stationery = stationery;
	}

	public boolean isAcceptDonation() {
		return acceptDonation;
	}

	public void setAcceptDonation(boolean acceptDonation) {
		this.acceptDonation = acceptDonation;
	}

	public String getSchoolId() {
		return schoolId;
	}
	
	// methods
	public String generateSchoolId() {
		// for school 'SC' + random number
		int num = (int) (Math.random() * 10000 + 1);
		return code + String.valueOf(num);
	}
	
}
