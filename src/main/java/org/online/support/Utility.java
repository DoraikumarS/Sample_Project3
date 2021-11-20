package org.online.support;

import java.util.Date;

public class Utility {

	public Date getCurrentDate() {
		return new Date();
	}
	
	public String getNameFromDB() {
		System.out.println("Connecting to DB");
		return "Name from DB";
	}
}
