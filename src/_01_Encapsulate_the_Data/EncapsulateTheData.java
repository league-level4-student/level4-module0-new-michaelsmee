package _01_Encapsulate_the_Data;

import java.lang.reflect.Member;
import java.util.Random;

public class EncapsulateTheData {

	// 1. Encapsulate all the members.

	// 2. Implement the setter restrictions described above each member variable.

	// 3. Pass all the JUnit tests.

	/* 
	 * All negative arguments should set itemsReceived to 0.
	 */
	
	private int itemsReceived;

	private Integer itemsRecieved;

	public void setItemsReceived(int randomPositiveNum) {
		if(randomPositiveNum < 0) {
			this.itemsReceived = 0;
		}
		else {
			this.itemsRecieved = randomPositiveNum;
		}
	}
	
	public Integer getItemsReceived() {
		return this.itemsRecieved;
	}
	
	
	/*
	 * degreesTurned must be locked between 0.0 and 360.0 inclusive.
	 * 
	 * All parameters outside this range should set degreesTurned to the nearest
	 * bound.
	 */

	private double degreesTurned;
	
	

	public void setDegreesTurned(double randomPositiveNum) {
		if(randomPositiveNum<0.0) {
			this.degreesTurned = 0.0;
		}
		else if(randomPositiveNum > 360.0) {
			this.degreesTurned = 360.0;
		}
		else {
			this.degreesTurned = randomPositiveNum;
		}
		
	}
	
	public Double getDegreesTurned() {
		return this.degreesTurned;
	}

	
	/*
	 * nomenclature must not contain an empty String.
	 * 
	 * An empty String parameter should set nomenclature to a String with a single
	 * space.
	 */


	private String nomenclature;
	

	public void setNomenclature(String randomString) {
		this.nomenclature = " ";
	}
	
	public Object getNomenclature() {
		return this.nomenclature;
	}
	
	
	/*
	 * memberObj must not be a String.
	 * 
	 * A String parameter should set memberObj to a new Object();
	 * 
	 * Hint: Use the instanceof operator.
	 * 
	 * Example:
	 * 
	 * Robot rob = new Robot();
	 * 
	 * System.out.println(rob instanceof Robot); // prints true
	 * 
	 * System.out.println(rob instanceof Random); //prints false
	 */

	private Object memberObj;
	private String parameter;
	
	
	public void setMemberObj(Object randomObject) {
		this.memberObj = new Object();
		if(memberObj instanceof Member) {
			System.out.println(memberObj instanceof Member);
		}
		else {
			System.out.println(memberObj instanceof Random);
		}
	}

	public String getMemberObj() {
		return this.parameter;
	}

	

	

	
	

	

	

}
