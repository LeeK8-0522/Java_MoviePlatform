package Main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
import javax.swing.JOptionPane;
import java.util.Random;

public class BookTicketsController implements ActionListener {
	/* Below are fields */
	private AccountModel accountModel;
	private BookTicketsView bookTicketsView;
	private String errorMessage = ""; 
	private String ticketText = "";//store movie ticket contents
	private boolean isException = false;//store boolean data whether there is exception
	
	//Below are fields for printing ticket
	private String MovieTitle = "";
	private String TheaterType = "";
	private String SelectedDate = "";
	private String SelectedTime = "";
	private String NumberOfAdult = "";
	private String NumberOfSenior = "";
	private String NumberOfChild = "";
	private int DiscountedPrice = 0;
	private int TotalPrice = 0;
	/* Finish implementing fields */
	
	public BookTicketsController(AccountModel accountModel, BookTicketsView bookTicketsView) {
		this.accountModel = accountModel;
		this.bookTicketsView = bookTicketsView;
		this.bookTicketsView.setListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==bookTicketsView.getBookTicketButton()) {
			try {
				String input = bookTicketsView.getMovieTitle();
				if(input.equals("(empty")) throw new EmptySelectionException();
				else this.MovieTitle = input;
				
				input = bookTicketsView.getTheaterType();
				if(input.equals("(empty")) throw new EmptySelectionException();
				else this.TheaterType = input;
				
				input = bookTicketsView.getSelectedDate();
				if(input.equals("(empty)")) throw new EmptySelectionException();
				else this.SelectedDate = input;
				
				input = bookTicketsView.getSelectedTime();
				if(input.equals("(empty)")) throw new EmptySelectionException();
				else this.SelectedTime = input;
				
				input = bookTicketsView.getNumebrOfAdult();
				input = input.trim();
				if(input.isEmpty()) throw new EmptyException(); 
				else if(!isNumber(input)) throw new NumberFormatException();
				else if(Integer.parseInt(input) < 0) throw new NumberBoundaryException();
				else {
					this.NumberOfAdult = input;
					if(bookTicketsView.getTheaterType().equals("Original Theater")) {
						this.TotalPrice += 10000 * Integer.parseInt(input);
					}
					else if(bookTicketsView.getTheaterType().equals("4D Extreme Theater")) {
						this.TotalPrice += 20000 * Integer.parseInt(input);
					}
					else if(bookTicketsView.getTheaterType().equals("Dolby & IMAX Theater")) {
						this.TotalPrice += 15000 * Integer.parseInt(input);
					}
					else if(bookTicketsView.getTheaterType().equals("Pet Theater")) {
						this.TotalPrice += 12000 * Integer.parseInt(input);
					}
				}
				
				input = bookTicketsView.getNumberOfSenior();
				input = input.trim();
				if(input.isEmpty()) throw new EmptyException(); 
				else if(!isNumber(input)) throw new NumberFormatException();
				else if(Integer.parseInt(input) < 0) throw new NumberBoundaryException();
				else {
					this.NumberOfSenior = input;
					if(bookTicketsView.getTheaterType().equals("Original Theater")) {
						this.TotalPrice += 8000 * Integer.parseInt(input);
					}
					else if(bookTicketsView.getTheaterType().equals("4D Extreme Theater")) {
						this.TotalPrice += 15000 * Integer.parseInt(input);
					}
					else if(bookTicketsView.getTheaterType().equals("Dolby & IMAX Theater")) {
						this.TotalPrice += 10000 * Integer.parseInt(input);
					}
					else if(bookTicketsView.getTheaterType().equals("Pet Theater")) {
						this.TotalPrice += 9000 * Integer.parseInt(input);
					}
				}
				
				input = bookTicketsView.getNumberOfChild();
				input = input.trim();
				if(input.isEmpty()) throw new EmptyException(); 
				else if(!isNumber(input)) throw new NumberFormatException();
				else if(Integer.parseInt(input) < 0) throw new NumberBoundaryException();
				else {
					this.NumberOfChild = input;
					if(bookTicketsView.getTheaterType().equals("Original Theater")) {
						this.TotalPrice += 5000 * Integer.parseInt(input);
					}
					else if(bookTicketsView.getTheaterType().equals("4D Extreme Theater")) {
						this.TotalPrice += 10000 * Integer.parseInt(input);
					}
					else if(bookTicketsView.getTheaterType().equals("Dolby & IMAX Theater")) {
						this.TotalPrice += 8000 * Integer.parseInt(input);
					}
					else if(bookTicketsView.getTheaterType().equals("Pet Theater")) {
						this.TotalPrice += 6000 * Integer.parseInt(input);
					}
				}
				
				input = bookTicketsView.getAppliedCoupons();
				input = input.trim();
				if(input.isEmpty()) throw new EmptyException(); 
				else if(!isNumber(input)) throw new NumberFormatException();
				else if(Integer.parseInt(input) < accountModel.getNumberOfCoupons()) throw new NumberBoundaryException();
				else {
					this.DiscountedPrice += 1000 * Integer.parseInt(input);
					accountModel.setNumberOfCoupons(accountModel.getNumberOfCoupons() - Integer.parseInt(input));
				}
				
				input = bookTicketsView.getUsedPoints();
				input = input.trim();
				if(input.isEmpty()) throw new EmptyException(); 
				else if(!isNumber(input)) throw new NumberFormatException();
				else if(Integer.parseInt(input) < accountModel.getAmountOfPoints()) throw new NumberBoundaryException();
				else {
					this.DiscountedPrice += Integer.parseInt(input);
					accountModel.setAmountOfPoints(accountModel.getAmountOfPoints() - Integer.parseInt(input));
				}
				
				this.TotalPrice -= this.DiscountedPrice;
			}
			catch(Exception ex) {
				isException = true;
				JOptionPane.showMessageDialog(null, errorMessage, "Error Message", JOptionPane.ERROR_MESSAGE);//show the problem message in pop-up window
			}
			finally {
				if(isException == false) {
					printMovieTicket();//print movie ticket in text file
					accountModel.increaseNumberOfTickets();
					accountModel.increaseNumberOfCoupons();
					JOptionPane.showMessageDialog(null, "Ticket Successfully Booked!\n\n->Your tickets have been sent and a coupon has been credited to your account.", "Success Message", JOptionPane.INFORMATION_MESSAGE);//show success message if there is no exception
					bookTicketsView.dispose();
				}
				
				//reset and clear fields
				this.ticketText = "";
				this.isException = false;
				this.errorMessage = "";
				this.MovieTitle = "";
				this.TheaterType = "";
				this.SelectedDate = "";
				this.SelectedTime = "";
				this.NumberOfAdult = "";
				this.NumberOfSenior = "";
				this.NumberOfChild = "";
				this.DiscountedPrice = 0;
				this.TotalPrice = 0;
				//finish reseting and clearing fields
			}
		}
	}
	
	public void printMovieTicket() {
		ticketText += "Movie: " + this.MovieTitle + "\n";
		ticketText += "Theater Type: " + this.TheaterType + "\n";
		ticketText += "Selected Date: " + this.SelectedDate + "\n";
		ticketText += "Selected Time: " + this.SelectedTime + "\n";
		ticketText += "Adult: " + this.SelectedDate + "\n";
		ticketText += "Selected Date: " + this.SelectedDate + "\n";
		ticketText += "Selected Date: " + this.SelectedDate + "\n";
		ticketText += "Discounted Price: " +  Integer.toString(DiscountedPrice) + "\n";
		ticketText += "Total Price: " + Integer.toString(TotalPrice) + "\n";
		ticketText += "Reservation Number: "; 
		Random random = new Random();
		for(int i = 0; i < 8; i++) {
			ticketText += Integer.toString(random.nextInt(10));//create reservation number randomly
		}
		ticketText += "\n";
		try {
			FileOutputStream fileStream = new FileOutputStream("MovieTicket.txt", false);//generate FileOutputStream instance to connect file with PrintWriter(no appending)
			PrintWriter outputStream = new PrintWriter(fileStream);//generate PrintWriter object connected to "MovieTicket.txt" file
			outputStream.println(this.ticketText);//print ticket text
			outputStream.close();//close PrintWriter stream
			fileStream.close();//close FileOutputStream
		} catch (IOException e) {//catch IOException
			e.printStackTrace();
		}
	}
	
	public boolean isNumber(String input) {
		input = input.trim();
		for(int i = 0; i < input.length(); i++) {
			if(!Character.isDigit(input.charAt(i))) return false;
		}
		return true;
	}
	
	public class EmptyException extends Exception {
		public EmptyException() {
			errorMessage = "You should fill in all fields.\n";
		}
	}
	
	public class NumberBoundaryException extends Exception {
		public NumberBoundaryException() {
			errorMessage = "You should input number in correct boundary.\n";
		}
	}
	
	public class NumberFormatException extends Exception {
		public NumberFormatException() {
			errorMessage = "You should fill in fields in correct format.\n";
		}
	}
	
	public class EmptySelectionException extends Exception {
		public EmptySelectionException() {
			errorMessage = "You should select item except '(empty)'.\n";
		}
	}
	
}
