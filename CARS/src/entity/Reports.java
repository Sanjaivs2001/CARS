package entity;

import java.time.LocalDate;

public class Reports {
	private int reportID;
	private Incidents incidents; 
	private Officers reportOfficer; 
	private LocalDate reportDate;
	private String ReportDetails;
	private String Status;
	
	public Reports(int reportID, Incidents incidents, Officers reportOfficer, LocalDate reportDate,String reportDetails, String status) {
		super();
		this.reportID = reportID;
		this.incidents = incidents;
		this.reportOfficer = reportOfficer;
		this.reportDate = reportDate;
		ReportDetails = reportDetails;
		Status = status;
	}
	
	public int getReportID() {
		return reportID;
	}
	public void setReportID(int reportID) {
		this.reportID = reportID;
	}
	public Incidents getIncidents() {
		return incidents;
	}
	public void setIncidents(Incidents incidents) {
		this.incidents = incidents;
	}
	public Officers getReportOfficer() {
		return reportOfficer;
	}
	public void setReportOfficer(Officers reportOfficer) {
		this.reportOfficer = reportOfficer;
	}
	public LocalDate getReportDate() {
		return reportDate;
	}
	public void setReportDate(LocalDate reportDate) {
		this.reportDate = reportDate;
	}
	public String getReportDetails() {
		return ReportDetails;
	}
	public void setReportDetails(String reportDetails) {
		ReportDetails = reportDetails;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
}
