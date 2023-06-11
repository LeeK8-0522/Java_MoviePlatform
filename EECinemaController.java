package Main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.SwingWorker;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class EECinemaController implements ActionListener {
	private List<MovieModel> movies;
	private List<AccountModel> users;
	private EECinemaView eecinemaView;
	private TheaterInformationThread theaterInformationThread;//swing worker multi-thread for Theater Information service 
	private BookTicketsThread bookTicketsThread;//swing worker multi-thread for BookTickets service
	private LogInThread logInThread;//swing worker multi-thread for Log-In service
	private boolean isOpened_TheaterInformation;//represent state whether Theater Information View window is opened
	private boolean isOpened_BookTickets;//represent state whether Book Tickets View window is opened
	private boolean isOpened_LogIn;//represents state whether Log-In window is opened
	private boolean isLoggedIn;//represent state whether user logged in
	private int loggedInUserIndex = -1;//represents logged in user's account index
	
	public EECinemaController(List<MovieModel> movies, List<AccountModel> users, EECinemaView eecinemaView) {
		this.movies = movies;
		this.users = users;
		this.eecinemaView = eecinemaView;
		this.eecinemaView.setActionListener(this);
		this.isOpened_BookTickets = false;
		this.isOpened_TheaterInformation = false;
		this.isLoggedIn = false;
		updateScreen();
	}//initialize fields by constructor
	
	public void updateScreen() {
		this.eecinemaView.setMovie1Score("Score: "+Float.toString(movies.get(0).getAverageScore()));
		this.eecinemaView.setMovie2Score("Score: "+Float.toString(movies.get(1).getAverageScore()));
		this.eecinemaView.setMovie3Score("Score: "+Float.toString(movies.get(2).getAverageScore()));
		this.eecinemaView.setMovie4Score("Score: "+Float.toString(movies.get(3).getAverageScore()));
		this.eecinemaView.setMovie5Score("Score: "+Float.toString(movies.get(4).getAverageScore()));
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == eecinemaView.getTheaterInformationButton()) {
			if(isLoggedIn == false) {
				JOptionPane.showMessageDialog(null, "You have to log in first before using services.", "Information Message", JOptionPane.INFORMATION_MESSAGE);//show the problem message in pop-up window
			}
			else if(isOpened_TheaterInformation == false) {
				isOpened_TheaterInformation = true;
				theaterInformationThread = new TheaterInformationThread();
				theaterInformationThread.execute();
			}
		}
		else if(e.getSource() == eecinemaView.getBookTicketsButton()) {
			if(isLoggedIn == false) {
				JOptionPane.showMessageDialog(null, "You have to log in first before using services.", "Information Message", JOptionPane.INFORMATION_MESSAGE);//show the problem message in pop-up window
			}
			else if(isOpened_BookTickets == false) {
				isOpened_BookTickets = true;
				bookTicketsThread = new BookTicketsThread();
				bookTicketsThread.execute();
			}
		}
		else if(e.getSource() == eecinemaView.getLogInButton()) {
			if(isLoggedIn == false) {
				logInThread = new LogInThread();
				logInThread.execute();
			}
			else {
				isLoggedIn = false;
				eecinemaView.getLogInButton().setText("Log In");
				eecinemaView.setHelloNameLabel("Hello~!(NAME)");
			}
		}
	}
	
	public class LogInThread extends SwingWorker<Boolean, Float> {
		private LogInView logInView;
		private LogInController logInController;
		
		@Override
		protected Boolean doInBackground() throws Exception {
			logInView = new LogInView();
			logInController = new LogInController(users, logInView);
			logInView.setVisible(true);
			logInView.addWindowListener(new WindowAdapter() {
			    @Override
			    public void windowClosed(WindowEvent e) {
			        cancel(true);
			        loggedInUserIndex = logInController.getLoggedInIndex();
			        if(loggedInUserIndex >= 0) {
						isLoggedIn = true;
						eecinemaView.getLogInButton().setText("Log Out");
						eecinemaView.setHelloNameLabel("Hello~! "+users.get(loggedInUserIndex).getUserName());
					}
			    }
			});
			return null;
		}
		
		@Override
		protected void process(List<Float> chunks) {
			// TODO Auto-generated method stub
			super.process(chunks);
		}
		
		@Override
		protected void done() {
			
		}	
	}
	
	public class TheaterInformationThread extends SwingWorker<Boolean, Float> {
		private TheaterInformationView theaterInformationView;
		
		@Override
		protected Boolean doInBackground() throws Exception {
			theaterInformationView = new TheaterInformationView();
			theaterInformationView.setVisible(true);
			theaterInformationView.addWindowListener(new WindowAdapter() {
			    @Override
			    public void windowClosed(WindowEvent e) {
			        cancel(true);
			        isOpened_TheaterInformation = false;
			    }
			});
			return null;
		}
		
		@Override
		protected void process(List<Float> chunks) {
			// TODO Auto-generated method stub
			super.process(chunks);
		}
		
		@Override
		protected void done() {
			theaterInformationView = null;
		}		
	}
	
	public class BookTicketsThread extends SwingWorker<Boolean, Float> {
		private BookTicketsView bookTicketsView;
		private BookTicketsController bookTicketsController;
		
		@Override
		protected Boolean doInBackground() throws Exception {
			bookTicketsView = new BookTicketsView();
			bookTicketsController = new BookTicketsController(users.get(loggedInUserIndex), bookTicketsView);
			bookTicketsView.setVisible(true);
			bookTicketsView.addWindowListener(new WindowAdapter() {
			    @Override
			    public void windowClosed(WindowEvent e) {
			        cancel(true);
			        isOpened_BookTickets = false;
			    }
			});
			return null;
		}
		
		@Override
		protected void process(List<Float> chunks) {
			// TODO Auto-generated method stub
			super.process(chunks);
		}
		
		@Override
		protected void done() {
			
		}
	}
}