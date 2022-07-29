package Entities;

import java.time.LocalDate;


public class Player {

	private String nationalId;
	private String firstName;
	private String lastName;
	private LocalDate birthday;
	public Player(String nationalId, String firstName, String lastName, LocalDate birthday) {
		super();
		this.nationalId = nationalId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthday = birthday;
	}
	public String getNationalId() {
		return nationalId;
	}
	public void setNationalId(String nationalId) {
		this.nationalId = nationalId;
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
	public LocalDate getBirthday() {
		return birthday;
	}
	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}
	
}