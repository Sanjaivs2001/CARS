package entity;

public class Officers {
	private int officerID;
	private String firstName;
	private String lastName;
	private int badgeNumber;
	private int rank;
	private String contactInfo;
	private LawEnforcementAgencies agency;
	
	public Officers(int officerID, String firstName, String lastName, int badgeNumber, int rank, String contactInfo,LawEnforcementAgencies agency) {
		super();
		this.officerID = officerID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.badgeNumber = badgeNumber;
		this.rank = rank;
		this.contactInfo = contactInfo;
		this.agency = agency;
	}

	public int getOfficerID() {
		return officerID;
	}

	public void setOfficerID(int officerID) {
		this.officerID = officerID;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getBadgeNumber() {
		return badgeNumber;
	}

	public void setBadgeNumber(int badgeNumber) {
		this.badgeNumber = badgeNumber;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public String getContactInfo() {
		return contactInfo;
	}

	public void setContactInfo(String contactInfo) {
		this.contactInfo = contactInfo;
	}

	public LawEnforcementAgencies getAgency() {
		return agency;
	}

	public void setAgency(LawEnforcementAgencies agency) {
		this.agency = agency;
	}
	
	
	
}
