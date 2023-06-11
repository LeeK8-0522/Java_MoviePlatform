package Main;

import java.util.ArrayList;

public class AccountModel {
	private String userName;//store user's name 
	private String ID;//store user's ID;
	private String password;//store user's password
	private int numberOfCoupons;//store user's number of coupon
	private int amountOfPoints;//store user's amount of points
	private int numberOfTickets;//store user's number of tickets
	private float [] scoreArray = new float [5];//store user's score in integer array(each index represents particular movie: eg. index '1'-> "Four Rooms")
	
	public AccountModel(String userName, String ID, String password) {
		this.userName = userName;
		this.ID = ID;
		this.password = password;
		this.numberOfCoupons = 0;
		this.amountOfPoints = 0;
		this.numberOfTickets = 0;
		for(int i = 0; i < scoreArray.length; i++) {
			scoreArray[i] = -1;
		}
	}//initialize fields in constructor
	
	/* Below are getter-methods */
	public String getUserName() {
		return this.userName;
	}
	
	public String getID() {
		return this.ID;
	}
	
	public String getPassword() {
		return this.password;
	}
	
	public int getNumberOfCoupons() {
		return this.numberOfCoupons;
	}
	
	public int getAmountOfPoints() {
		return this.amountOfPoints;
	}
	
	public int getNumberOfTickets() {
		return this.numberOfTickets;
	}
	
	public float getRating(int index) {
		return this.scoreArray[index];
	}
	/* finish implementing getter-methods */
	
	/* Below are setter-methods */
	public void setUserName(String input) {
		this.userName = input;
	}
	
	public void setID(String input) {
		this.ID = input;
	}
	
	public void setPassword(String input) {
		this.password = input;
	}
	
	public void setNumberOfCoupons(int input) {
		this.numberOfCoupons = input;
	}
	
	public void setAmountOfPoints(int input) {
		this.amountOfPoints = input;
	}
	
	public void setNumberOfTickets(int input) {
		this.numberOfTickets = input;
	}
	
	public void setRating(float score, int index) {
		this.scoreArray[index] = score;
	}//store rating score in index 
	/* finish implementing setter-methods */
	
	public void increaseNumberOfTickets() {
		this.numberOfTickets++;
	}
	
	public void increaseNumberOfCoupons() {
		this.numberOfCoupons++;
	}
	
	public void increaseAmountOfPoints(int input) {
		this.amountOfPoints += input;
	}
}
