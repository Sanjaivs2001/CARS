package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import exception.*;
import java.util.InputMismatchException;

import util.DBConnection;

public class ICrimeAnalysisService implements ServiceProdviderInterface{
	private Connection connection;
	public ICrimeAnalysisService() {connection = DBConnection.createConnection();}

	@Override
	public void createIncident(int incidentID,String incidenttype,LocalDate incidentdate,double location, String description,String status,int victimID,int suspectID) {
		try {
			Statement statement = connection.createStatement();
			ResultSet checkID = statement.executeQuery("select incidentid from incidents where incidentid = '"+incidentID+"'");
			if(checkID.next())
			{
				if(checkID.getInt(1) == incidentID)
				{
					throw new IncidentExistException("Incident ID Already Exists");
				}
			}
			statement.executeUpdate("INSERT INTO Incidents (IncidentID, IncidentType, IncidentDate, Location, Description, Status, VictimID, SuspectID) VALUES("+incidentID+", '"+incidenttype+"', '"+incidentdate+"', "+location+", '"+description+"', '"+status+"', "+victimID+", "+suspectID+")");
			ResultSet result = statement.executeQuery("select * from incidents");
			System.out.println("Details of Incident");
			while(result.next())
			{
				System.out.println("IncidentID = "+result.getInt(1)+" IncidentType = "+result.getString(2)+" IncidentDate = "+result.getDate(3)+" Location = "+result.getDouble(4)+" Description = "+result.getString(5)+" Status = "+result.getString(6)+" VictimID = "+result.getInt(7)+" SuspectID = "+result.getInt(8));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(IncidentExistException e) {
			System.out.println(e);
		}
	}

	@Override
	public void UpdateIncidentStatus(int incidentID,String status) {
		try {
			Statement statement = connection.createStatement();
			System.out.println("Details of Incident");
			ResultSet preresult = statement.executeQuery("select * from incidents where incidentid = "+incidentID+"");
			if(preresult.next())
			{
				System.out.println("IncidentID = "+preresult.getInt(1)+" IncidentType = "+preresult.getString(2)+" IncidentDate = "+preresult.getDate(3)+" Location = "+preresult.getDouble(4)+" Description = "+preresult.getString(5)+" Status = "+preresult.getString(6)+" VictimID = "+preresult.getInt(7)+" SuspectID = "+preresult.getInt(8));
			}
			else
			{
				throw new IncidentNumberNotFoundException("Incidents Not Found, Please Enter Correct Incidents ID");
			}
			statement.executeUpdate("update incidents set status = '"+status+"' where incidentid = "+incidentID+"");
			ResultSet result = statement.executeQuery("select * from incidents where incidentid = "+incidentID+"");
			System.out.println("Details of Incident");
			while(result.next())
			{
				System.out.println("IncidentID = "+result.getInt(1)+" IncidentType = "+result.getString(2)+" IncidentDate = "+result.getDate(3)+" Location = "+result.getDouble(4)+" Description = "+result.getString(5)+" Status = "+result.getString(6)+" VictimID = "+result.getInt(7)+" SuspectID = "+result.getInt(8));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(IncidentNumberNotFoundException e) {
			System.out.println(e);
		}
	}

	@Override
	public void getIncidentsInDateRange(LocalDate fromDate,LocalDate toDate) {
		try {
			Statement statement = connection.createStatement();
			ResultSet result = statement.executeQuery("select * from Incidents where IncidentDate between '"+fromDate+"' and '"+toDate+"'");
			System.out.println("Details of Incident");
			while(result.next())
			{
				System.out.println("IncidentID = "+result.getInt(1)+" IncidentType = "+result.getString(2)+" IncidentDate = "+result.getDate(3)+" Location = "+result.getDouble(4)+" Description = "+result.getString(5)+" Status = "+result.getString(6)+" VictimID = "+result.getInt(7)+" SuspectID = "+result.getInt(8));
			}
		} catch (SQLException |InputMismatchException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void searchIncidents(int incidentID) {
		try {
			Statement statement = connection.createStatement();
			System.out.println("Details of Incident");
			ResultSet result = statement.executeQuery("select * from incidents where incidentid = '"+incidentID+"'");
			if(result.next())
			{
				System.out.println("IncidentID = "+result.getInt(1)+" IncidentType = "+result.getString(2)+" IncidentDate = "+result.getDate(3)+" Location = "+result.getDouble(4)+" Description = "+result.getString(5)+" Status = "+result.getString(6)+" VictimID = "+result.getInt(7)+" SuspectID = "+result.getInt(8));
			}
			else
			{
				throw new IncidentNumberNotFoundException("Incidents Not Found, Please Enter Correct Incidents ID");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(IncidentNumberNotFoundException e) {
			System.out.println(e);
		}
	}

	@Override
	public void generateIncidentReport(int reportOfficerID) { 
		try {
			Statement statement = connection.createStatement();
			ResultSet result = statement.executeQuery("select I.IncidentID,I.IncidentType,I.IncidentDate,I.Location,I.Description,I.Status,I.VictimID,V.FirstName,V.LastName,V.Gender,V.ContatInfo,S.SuspectID,S.FirstName,S.LastName,S.Gender,S.ContactInfo,R.ReportID,R.ReportingOfficer,R.ReportDate,R.ReportDetails from incidents as I inner join victims as V on I.VictimID = V.VictimID inner join suspects as S on I.SuspectID = S.SuspectID inner join reports as R on I.IncidentID = R.IncidentID where R.reportingofficer = "+reportOfficerID+"");
			System.out.println("Details of Incident");
			if(result.next())
			{
				System.out.println("IncidentID = "+result.getInt(1)+" IncidentType = "+result.getString(2)+" IncidentDate = "+result.getDate(3)+" Location = "+result.getDouble(4)+" Description = "+result.getString(5)+" Status = "+result.getString(6)+"\n\nVictimID = "+result.getInt(7)+" FirstName = "+result.getString(8)+" LastName = "+result.getString(9)+" Gender = "+result.getString(10)+" ContactInfo = "+result.getString(11)+"\n\nSuspectID = "+result.getInt(12)+" FirstName = "+result.getString(13)+" LastName = "+result.getString(14)+" Gender = "+result.getString(15)+" ContactInfo = "+result.getString(16)+"\n\nReportID = "+result.getInt(17)+" ReportOfficer = "+result.getInt(18)+" ReportDate = "+result.getDate(19)+" ReportDetails = "+result.getString(20));
			}
			else 
			{
				throw new IncidentNumberNotFoundException("Incidents Not Found, Please Enter Correct Incidents ID");
			}
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(IncidentNumberNotFoundException e) {
			System.out.println(e);
		}
	}

}
