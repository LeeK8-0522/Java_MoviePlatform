package Main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JOptionPane;

public class PersonalizedScorePredictionController implements ActionListener {//this class use 'Slope-One' Item based collaborative filtering algorithm
	private List<MovieModel> movies;
	private List<AccountModel> users;
	private PersonalizedScorePredictionView personalizedScorePredictionView;
	private int loggedInIndex = -1;//represents index of the user who recently logged in
	private String errorMessage = "";//store error message
	private boolean isException = false;//flag for whether exception exist or not
	private float [][]deviation;//for storing deviations
	private int [][]cardinality;//for storing cardinality
	private float predictedScore = 0;//for storing predicted score
	
	public PersonalizedScorePredictionController(List<MovieModel> movies, List<AccountModel> users, PersonalizedScorePredictionView personalizedScorePredictionView, int loggedInIndex) {
		this.movies = movies;
		this.users = users;
		this.personalizedScorePredictionView = personalizedScorePredictionView;
		this.personalizedScorePredictionView.setListener(this);
		this.loggedInIndex = loggedInIndex;
		this.deviation = new float [movies.size()][movies.size()];
		this.cardinality = new int [movies.size()][movies.size()];
	}//initialize fields in constructor
	
	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			if(e.getSource()==personalizedScorePredictionView.getPredictionButton()) {
				if(personalizedScorePredictionView.getSelectedMovie().equals("(empty)")) throw new EmptySelectionException();//if selected item is '(empty)', throw 'EmptySelectionException'
				else if(personalizedScorePredictionView.getSelectedMovie().equals("Toy Story")) {
					encapsulatePredictionProcess(0);//predict score
				}
				else if(personalizedScorePredictionView.getSelectedMovie().equals("Four Rooms")) {
					encapsulatePredictionProcess(1);
				}
				else if(personalizedScorePredictionView.getSelectedMovie().equals("Casino")) {
					encapsulatePredictionProcess(2);
				}
				else if(personalizedScorePredictionView.getSelectedMovie().equals("Golden Eye")) {
					encapsulatePredictionProcess(3);
				}
				else if(personalizedScorePredictionView.getSelectedMovie().equals("Heat")) {
					encapsulatePredictionProcess(4);
				}
			}
		}
		catch(Exception ex){
			isException = true;//change flag state
			JOptionPane.showMessageDialog(null, errorMessage, "Error Message", JOptionPane.ERROR_MESSAGE);//show the problem message in pop-up window
		}
		finally {
			if(isException == false) {//if there was no exception
				JOptionPane.showMessageDialog(null, "Predicted Score for selected movie is "+Float.toString(predictedScore)+"\n" , "Predicted Score", JOptionPane.INFORMATION_MESSAGE);//show message if there is no exception
			}//if there was no exception, show predicted score
			/* Reset fields */
			errorMessage = "";
			isException = false;
			predictedScore = 0;
			/* Finish reseting fields */
		}
	}
	
	public void initializeDeviations() {
		for(int i = 0; i < movies.size(); i++) {
			for(int j = 0; j < movies.size(); j++) {
				this.deviation[i][j] = 0;
				this.cardinality[i][j] = 0;
			}
		}
	}//initialize deviations and cardinality
	
	public void calculateDeviations() {
		for(int i = 0; i < movies.size(); i++) {
			for(int j = 0; j < movies.size(); j++) {
				for(int k = 0; k < users.size(); k++) {
					if(users.get(k).getRating(i) > 0 && users.get(k).getRating(j) > 0) {
						this.cardinality[i][j]++;
						this.deviation[i][j] += users.get(k).getRating(i) - users.get(k).getRating(j);
					}
				}
			}
		}
	}//calculate and store deviations and cardinality according to 'Slope-One' algorithm
	
	public void predictScore(int movieId) {
		int sumOfCardinality = 0;
		for(int i = 0; i < movies.size(); i++) {
			if(users.get(loggedInIndex).getRating(i)>0) {
				this.predictedScore += (this.deviation[movieId][i] + users.get(loggedInIndex).getRating(i))*this.cardinality[movieId][i];
				sumOfCardinality += this.cardinality[movieId][i];
			}
		}
		if(sumOfCardinality > 0) predictedScore /= sumOfCardinality;//if sum of cardinality is positive integer, divide predicted score by sum of cardinality
		else predictedScore = 0;
	}//calculate predicted score according to 'Slope-One' algorithm
	
	public void encapsulatePredictionProcess(int movieId) {
		initializeDeviations();
		calculateDeviations();
		predictScore(movieId);
	}//encapsulate whole process for prediction process
	
	/* Below are Exception classes */
	public class EmptySelectionException extends Exception {
		public EmptySelectionException() {
			errorMessage = "You should select item except '(empty)'.\n";
		}
	}
	
	public class LackOfDataException extends Exception {
		public LackOfDataException() {
			errorMessage = "There is not enough data for the movie you chose.\n";
		}
	}
	/* Finish implementing Exception classes */
}
