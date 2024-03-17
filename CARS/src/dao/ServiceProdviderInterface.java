package dao;

import java.time.LocalDate;

public interface ServiceProdviderInterface {
	void createIncident(int incidentID,String incidenttype,LocalDate incidentdate,double location, String description,String status,int victimID,int suspectID);
	void UpdateIncidentStatus(int incidentID2,String status2);
	void getIncidentsInDateRange(LocalDate fromDate,LocalDate toDate);
	void searchIncidents(int incidentID);
	void generateIncidentReport(int reportOfficerID);
}
