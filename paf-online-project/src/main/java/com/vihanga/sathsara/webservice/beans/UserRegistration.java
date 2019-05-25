package com.vihanga.sathsara.webservice.beans;

import java.util.ArrayList;
import java.util.List;

public class UserRegistration {
	private List<User> userRecords;
	
	private static UserRegistration usrregd = null;
	
	private UserRegistration() {
		userRecords = new ArrayList<User>();
	}
	
	public static UserRegistration getInstance() {
		if (usrregd == null) {
			usrregd = new UserRegistration();
			return usrregd;
		}
		else {
			return usrregd;
		}
	}
	
	public void add(User usr) {
		userRecords.add(usr);
	}
	
	public String upDateUser(User usr) {
		for(int i=0; i<userRecords.size(); i++) {
			User usrs = userRecords.get(i);
			if(usrs.getRegistrationNumber().equals(usr.getRegistrationNumber())) {
				userRecords.set(i, usr);
				return "Update Successful";
			}
		}
		return "Update unsuccessful";
	}
	
	public String deleteUser(String registrationNumber) {
		for(int i=0; i<userRecords.size(); i++) {
			User usrs = userRecords.get(i);
			if(usrs.getRegistrationNumber().equals(registrationNumber)) {
				userRecords.remove(i);
				return "Delete Successful";
			}
		}
		return "Delete Unsuccessful";
	}
	
	public List<User> getUserRecords(){
		return userRecords;
	}
}

