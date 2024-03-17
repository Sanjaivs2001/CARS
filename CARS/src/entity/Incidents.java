package entity;

import java.time.LocalDate;

public class Incidents {
	private int incidentID;
	private String incidentType;
	private LocalDate incidentDate;
	private double location;
	private String description;
	private String status;
	private Victims victim;
	private Suspects suspect;
	public Incidents(int incidentID, String incidentType, LocalDate incidentDate, double location, String description,
			String status, Victims victim, Suspects suspect) {
		super();
		this.incidentID = incidentID;
		this.incidentType = incidentType;
		this.incidentDate = incidentDate;
		this.location = location;
		this.description = description;
		this.status = status;
		this.victim = victim;
		this.suspect = suspect;
	}
	public int getIncidentID() {
		return incidentID;
	}
	public void setIncidentID(int incidentID) {
		this.incidentID = incidentID;
	}
	public String getIncidentType() {
		return incidentType;
	}
	public void setIncidentType(String incidentType) {
		this.incidentType = incidentType;
	}
	public LocalDate getIncidentDate() {
		return incidentDate;
	}
	public void setIncidentDate(LocalDate incidentDate) {
		this.incidentDate = incidentDate;
	}
	public double getLocation() {
		return location;
	}
	public void setLocation(double location) {
		this.location = location;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Victims getVictim() {
		return victim;
	}
	public void setVictim(Victims victim) {
		this.victim = victim;
	}
	public Suspects getSuspect() {
		return suspect;
	}
	public void setSuspect(Suspects suspect) {
		this.suspect = suspect;
	}
	
	
}
