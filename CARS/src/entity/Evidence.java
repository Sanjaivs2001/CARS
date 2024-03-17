package entity;

public class Evidence {
	private int evidenceID;
	private String description;
	private String locationFound;
	private Incidents incident;
	
	public Evidence(int evidenceID, String description, String locationFound, Incidents incident) {
		super();
		this.evidenceID = evidenceID;
		this.description = description;
		this.locationFound = locationFound;
		this.incident = incident;
	}
	
	public int getEvidenceID() {
		return evidenceID;
	}
	public void setEvidenceID(int evidenceID) {
		this.evidenceID = evidenceID;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getLocationFound() {
		return locationFound;
	}
	public void setLocationFound(String locationFound) {
		this.locationFound = locationFound;
	}
	public Incidents getIncident() {
		return incident;
	}
	public void setIncident(Incidents incident) {
		this.incident = incident;
	}
}
