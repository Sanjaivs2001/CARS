package junittest;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;

import org.junit.Test;

import dao.ICrimeAnalysisService;
import exception.InvalidStatusException;
import util.DBConnection;

public class JunitTestCaseTest {
	private Connection connection;
	public JunitTestCaseTest() {connection = DBConnection.createConnection();}

	@Test
	public void uploadingTest() {
		
		ICrimeAnalysisService iCAS = new ICrimeAnalysisService();
		int incidentID = 32;
		String incidenttype = "Car Theft";
		String date = "2024-02-25";
		LocalDate incidentdate = LocalDate.parse(date);
		double location = 34.052;
		String description = "Car stolen from parking lot";
		String status = "Closed";
		int victimID = 6;
		int suspectID = 8;
		iCAS.createIncident(incidentID,incidenttype,incidentdate,location,description,status,victimID,suspectID);
		try {
			Statement statement = connection.createStatement();
			ResultSet results = statement.executeQuery("select incidenttype from incidents where incidentid = "+incidentID+"");
			if(results.next())
			{
				assertEquals("Car Theft",results.getString(1));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void updateCheckingTest() {
		
		ICrimeAnalysisService iCAS = new ICrimeAnalysisService();
		int incidentID = 30;
		String checkingstatus = "closed";
		iCAS.UpdateIncidentStatus(incidentID,checkingstatus);
		try {
			Statement statement = connection.createStatement();
			ResultSet results = statement.executeQuery("select status from incidents where incidentid = "+incidentID+"");
			if(results.next())
			{
				String stat = results.getString(1); 
				if(stat.equals("closed"))
				{
					assertEquals("closed",results.getString(1));
				}
				else if(stat.equals("open"))
				{
					assertEquals("open",results.getString(1));
				}
				else
				{
					throw new InvalidStatusException("Wrong Status Update");
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (InvalidStatusException e) {
			System.out.println(e);
		}
	}
}
