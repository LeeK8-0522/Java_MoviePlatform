package Main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JOptionPane;

public class LogInController implements ActionListener{
	private List<AccountModel> users;
	private LogInView logInView;
	private String enteredID = "";
	private String enteredPassword = "";
	private int loggedInIndex = -1;//represents logged in user's account by pointing index of list
	
	public LogInController(List<AccountModel> users, LogInView logInView) {
		this.users = users;
		this.logInView = logInView;
		logInView.setListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == logInView.getOkButton()) {
			enteredID = logInView.getEnteredID();
			enteredPassword = logInView.getEnteredPassword();
			loggedInIndex = checkAccount(enteredID, enteredPassword);
			if(loggedInIndex >= 0) {
				logInView.dispose();
			}
			else {
				JOptionPane.showMessageDialog(null, "ID or Password is wrong", "Error Message", JOptionPane.ERROR_MESSAGE);//show the problem message in pop-up window
			}
		}
		else if(e.getSource() == logInView.getCancelButton()) {
			logInView.dispose();
		}
	}
	
	public int checkAccount(String enteredID, String enteredPassword) {
		for(AccountModel user: this.users) {
			if(user.getID().equals(enteredID) && user.getPassword().equals(enteredPassword)) {
				return users.indexOf(user);
			}
		}
		return -1;
	}
	
	public int getLoggedInIndex() {
		return this.loggedInIndex;
	}//getter method for loggedInIndex field
}
