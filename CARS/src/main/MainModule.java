package main;

import java.time.LocalDate;
import java.util.Scanner;
import dao.*;

public class MainModule {
	public static void main(String[] args)
	{
		ICrimeAnalysisService sPI = new ICrimeAnalysisService();
		boolean choice = true;
		while(choice)
		{
			System.out.println("Crime Analysis and Reporting System \n1.Create Incident \n2.Update Incident Status \n3.Get Incidents In a Date Range \n4.Search Incidents \n5.Generate Incidents Reports \nPlease Enter Any One");
			Scanner sc = new Scanner(System.in);
			int chosen = sc.nextInt();
			switch(chosen)
			{
			case 1:
				System.out.println("Please Enter Incident ID");
				int incidentID = sc.nextInt();
				System.out.println("Please Enter Incident Type");
				String incidenttype = sc.next();
				System.out.println("Please Enter Incident Date");
				LocalDate incidentdate = LocalDate.parse(sc.next());
				System.out.println("Please Enter Incident Location");
				double location = sc.nextDouble();
				sc.nextLine();
				System.out.println("Please Enter Incident Description");
				String description = sc.nextLine();
				System.out.println("Please Enter Status");
				String status = sc.next();
				System.out.println("Please Enter Victims ID");
				int victimID = sc.nextInt();
				System.out.println("Please Enter Suspects ID");
				int suspectID = sc.nextInt();
				sPI.createIncident(incidentID,incidenttype,incidentdate,location,description,status,victimID,suspectID);
				break;
			case 2:
				System.out.println("Please Enter Incident ID");
				int incidentID2 = sc.nextInt();
				System.out.println("To Update Status Please Enter");
				String status2 = sc.next();
				sPI.UpdateIncidentStatus(incidentID2,status2);
				break;
			case 3:
				System.out.println("Please Enter Start Date");
				String date1 = sc.next();
				LocalDate fromDate = LocalDate.parse(date1);
				System.out.println("Please Enter End Date");
				String date2 = sc.next();
				LocalDate toDate = LocalDate.parse(date2);
				sPI.getIncidentsInDateRange(fromDate,toDate);
				break;
			case 4:
				System.out.println("Please Enter Incident ID");
				int incidentID3 = sc.nextInt();
				sPI.searchIncidents(incidentID3);
				break;
			case 5:
				System.out.println("Please Enter Officer ID");
				int reportOfficerID = sc.nextInt();
				sPI.generateIncidentReport(reportOfficerID);
				break;
			default:
				System.out.print("Please Enter the  given number");
				break;
			}
		}
	}
}
