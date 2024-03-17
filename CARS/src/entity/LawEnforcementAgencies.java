package entity;

public class LawEnforcementAgencies {
	private int agencyID;
	private String agencyName;
	private String jurisdiction;
	private String contactInfo;
	private Officers officer;
	
	public LawEnforcementAgencies(int agencyID, String agencyName, String jurisdiction, String contactInfo,
			Officers officer) {
		super();
		this.agencyID = agencyID;
		this.agencyName = agencyName;
		this.jurisdiction = jurisdiction;
		this.contactInfo = contactInfo;
		this.officer = officer;
	}
	
	public int getAgencyID() {
		return agencyID;
	}
	public void setAgencyID(int agencyID) {
		this.agencyID = agencyID;
	}
	public String getAgencyName() {
		return agencyName;
	}
	public void setAgencyName(String agencyName) {
		this.agencyName = agencyName;
	}
	public String getJurisdiction() {
		return jurisdiction;
	}
	public void setJurisdiction(String jurisdiction) {
		this.jurisdiction = jurisdiction;
	}
	public String getContactInfo() {
		return contactInfo;
	}
	public void setContactInfo(String contactInfo) {
		this.contactInfo = contactInfo;
	}
	public Officers getOfficer() {
		return officer;
	}
	public void setOfficer(Officers officer) {
		this.officer = officer;
	}
}
