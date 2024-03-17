package entity;

import java.time.LocalDate;

public class Victims {
	private int victimID;
	private String firstName;
	private String lastName;
	private LocalDate dateofBirth;
	private Gender gender;
	private String contactInfo;
	public Victims(int victimID, String firstName, String lastName, LocalDate dateofBirth, Gender gender,String contactInfo) {
		super();
		this.victimID = victimID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateofBirth = dateofBirth;
		this.gender = gender;
		this.contactInfo = contactInfo;
	}
	public int getVictimID() {
		return victimID;
	}
	public void setVictimID(int victimID) {
		this.victimID = victimID;
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
	public LocalDate getDateofBirth() {
		return dateofBirth;
	}
	public void setDateofBirth(LocalDate dateofBirth) {
		this.dateofBirth = dateofBirth;
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
	
	 public enum Gender {
	        MALE,
	        FEMALE
	    }
	
	
	
}
