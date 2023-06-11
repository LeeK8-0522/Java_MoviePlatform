package Main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.SwingWorker;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class EECinemaController implements ActionListener {
	/* Below are fields */
	private List<MovieModel> movies;
	private List<AccountModel> users;
	private EECinemaView eecinemaView;
	private TheaterInformationThread theaterInformationThread;//swing worker multi-thread for Theater Information service 
	private BookTicketsThread bookTicketsThread;//swing worker multi-thread for BookTickets service
	private LogInThread logInThread;//swing worker multi-thread for Log-In service
	private RateMoviesThread rateMoviesThread;//swing worker multi-thread for rating service
	private PredictScoreThread predictScoreThread;//swing worker multi-thread for predicting score service
	private boolean isOpened_TheaterInformation;//represents state whether Theater Information View window is opened
	private boolean isOpened_BookTickets;//represents state whether Book Tickets View window is opened
	private boolean isOpened_LogIn;//represents state whether Log-In window is opened
	private boolean isOpened_RateMovies;//represents state whether Rate-Movies window is opened
	private boolean isOpened_PredictScore;//represents state whether Predict-Score window is opened
	private boolean isLoggedIn;//represent state whether user logged in
	private int loggedInUserIndex = -1;//represents logged in user's account index
	/* Finish implementing fields */
	
	public EECinemaController(List<MovieModel> movies, List<AccountModel> users, EECinemaView eecinemaView) {
		this.movies = movies;
		this.users = users;
		this.eecinemaView = eecinemaView;
		this.eecinemaView.setActionListener(this);
		this.isOpened_BookTickets = false;
		this.isOpened_TheaterInformation = false;
		this.isOpened_RateMovies = false;
		this.isLoggedIn = false;
		this.eecinemaView.updateMovieScoreState(movies);
	}//initialize fields by constructor

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == eecinemaView.getTheaterInformationButton()) {
			if(isLoggedIn == false) {//if user didn't log in yet
				JOptionPane.showMessageDialog(null, "You have to log in first before using services.", "Information Message", JOptionPane.INFORMATION_MESSAGE);//show the problem message in pop-up window
			}
			else if(isOpened_TheaterInformation == false) {//if the window is not opened (for blocking two same windows)
				isOpened_TheaterInformation = true;
				theaterInformationThread = new TheaterInformationThread();
				theaterInformationThread.execute();
			}
		}
		else if(e.getSource() == eecinemaView.getBookTicketsButton()) {
			if(isLoggedIn == false) {//if user didn't log in yet
				JOptionPane.showMessageDialog(null, "You have to log in first before using services.", "Information Message", JOptionPane.INFORMATION_MESSAGE);//show the problem message in pop-up window
			}
			else if(isOpened_BookTickets == false) {//if the window is not opened (for blocking two same windows)
				isOpened_BookTickets = true;
				bookTicketsThread = new BookTicketsThread();
				bookTicketsThread.execute();
			}
		}
		else if(e.getSource() == eecinemaView.getLogInButton()) {
			if(isLoggedIn == false) {//if user didn't log in yet
				logInThread = new LogInThread();
				logInThread.execute();
			}
			else {
				isLoggedIn = false;//change state flag
				eecinemaView.clearState();
			}
		}
		else if(e.getSource() == eecinemaView.getRateMoviesButton()) {
			if(isLoggedIn == false) {//if user didn't log in yet
				JOptionPane.showMessageDialog(null, "You have to log in first before using services.", "Information Message", JOptionPane.INFORMATION_MESSAGE);//show the problem message in pop-up window
			}
			else if(isOpened_RateMovies == false) {//if the window is not opened (for blocking two same windows)
				isOpened_RateMovies = true;
				rateMoviesThread = new RateMoviesThread();
				rateMoviesThread.execute();
			}
		}
		else if(e.getSource() == eecinemaView.getPersonalizedScorePredictionButton()) {
			if(isLoggedIn == false) {//if user didn't log in yet
				JOptionPane.showMessageDialog(null, "You have to log in first before using services.", "Information Message", JOptionPane.INFORMATION_MESSAGE);//show the problem message in pop-up window
			}
			else if(isOpened_PredictScore == false) {//if the window is not opened (for blocking two same windows)
				isOpened_PredictScore = true;
				predictScoreThread = new PredictScoreThread();
				predictScoreThread.execute();
			}
		}
	}
	
	/* Below are multi-thread classes extended from swing worker */ 
	public class LogInThread extends SwingWorker<Boolean, Float> {//multi-thread for log in service 
		private LogInView logInView;//view field
		private LogInController logInController;//control field
		
		@Override
		protected Boolean doInBackground() throws Exception {
			logInView = new LogInView();
			logInController = new LogInController(users, logInView);
			logInView.setVisible(true);
			logInView.addWindowListener(new WindowAdapter() {
			    @Override
			    public void windowClosed(WindowEvent e) {//when closing window event happens,
			        cancel(true);//dispose this multi-thread
			        loggedInUserIndex = logInController.getLoggedInIndex();
			        if(loggedInUserIndex >= 0) {//if log-in process successfully done
						isLoggedIn = true;//change flag state when closing window
						eecinemaView.updateState(users.get(loggedInUserIndex));//update screen
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
	
	public class TheaterInformationThread extends SwingWorker<Boolean, Float> {//multi-thread for theater information service
		private TheaterInformationView theaterInformationView;//view field
		private TheaterInformationController theaterInformationController;//control field
		
		@Override
		protected Boolean doInBackground() throws Exception {
			theaterInformationView = new TheaterInformationView();
			theaterInformationController = new TheaterInformationController(theaterInformationView);
			theaterInformationView.setVisible(true);
			theaterInformationView.addWindowListener(new WindowAdapter() {
			    @Override
			    public void windowClosed(WindowEvent e) {//when closing window event happens,
			        cancel(true);//dispose this multi-thread
			        isOpened_TheaterInformation = false;//change flag state when closing window
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
	
	public class BookTicketsThread extends SwingWorker<Boolean, Float> {//multi-thread for booking-tickets service
		private BookTicketsView bookTicketsView;//view field
		private BookTicketsController bookTicketsController;//control field
		
		@Override
		protected Boolean doInBackground() throws Exception {
			bookTicketsView = new BookTicketsView();
			bookTicketsController = new BookTicketsController(users.get(loggedInUserIndex), bookTicketsView);
			bookTicketsView.setVisible(true);
			bookTicketsView.addWindowListener(new WindowAdapter() {
			    @Override
			    public void windowClosed(WindowEvent e) {//when closing window event happens,
			        cancel(true);//dispose this multi-thread
			        isOpened_BookTickets = false;//change flag state when closing window
			        eecinemaView.updateState(users.get(loggedInUserIndex));//update screen
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
	
	public class RateMoviesThread extends SwingWorker<Boolean, Float> {//multi-thread for rating movies service
		private RateMoviesView rateMoviesView;//view field
		private RateMoviesController rateMoviesController;//control field
		
		@Override
		protected Boolean doInBackground() throws Exception {
			rateMoviesView = new RateMoviesView();
			rateMoviesController = new RateMoviesController(rateMoviesView, users.get(loggedInUserIndex), movies);
			rateMoviesView.setVisible(true);
			rateMoviesView.addWindowListener(new WindowAdapter() {
			    @Override
			    public void windowClosed(WindowEvent e) {//when closing window event happens,
			        cancel(true);//dispose this multi-thread
			        isOpened_RateMovies = false;//change flag state when closing window
			        eecinemaView.updateMovieScoreState(movies);//update screen
			    }
			});
			return null;
		}
	}
	
	public class PredictScoreThread extends SwingWorker<Boolean, Float> {// multi-thread for predicting score service 
		private PersonalizedScorePredictionView personalizedScorePredictionView;//view field
		private PersonalizedScorePredictionController personalizedScorePredictionController;//control field
		
		@Override
		protected Boolean doInBackground() throws Exception {
			personalizedScorePredictionView = new PersonalizedScorePredictionView();
			personalizedScorePredictionController = new PersonalizedScorePredictionController(movies, users, personalizedScorePredictionView, loggedInUserIndex);
			personalizedScorePredictionView.setVisible(true);
			personalizedScorePredictionView.addWindowListener(new WindowAdapter() {
			    @Override
			    public void windowClosed(WindowEvent e) {//when closing window event happens,
			        cancel(true);//dispose this multi-thread
			        isOpened_PredictScore = false;//change flag state when closing window
			    }
			});
			return null;
		}
	}
	/* Finish implemeting multi-thread classes */
}