package entity;

import java.time.LocalDate;

import entity.Victims.Gender;

public class Suspects {
	private int suspectID;
	private String firstName;
	private String lastName;
	private LocalDate dateOfBirth;
	private Gender gender;
	private String contactInfo;
	
	public Suspects(int suspectID, String firstName, String lastName, LocalDate dateOfBirth, Gender gender,
			String contactInfo) {
		super();
		this.suspectID = suspectID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
		this.contactInfo = contactInfo;
	}
	
	public int getSuspectID() {
		return suspectID;
	}
	public void setSuspectID(int suspectID) {
		this.suspectID = suspectID;
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
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public String getContactInfo() {
		return contactInfo;
	}
	public void setContactInfo(String contactInfo) {
		this.contactInfo = contactInfo;
	}
}
