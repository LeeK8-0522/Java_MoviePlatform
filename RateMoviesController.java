package Main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.DuplicateFormatFlagsException;
import java.util.List;

import javax.swing.JOptionPane;

public class RateMoviesController implements ActionListener{
	/* Below are fields */
	private RateMoviesView rateMoviesView;
	private AccountModel accountModel;
	private List<MovieModel> movies;
	private String MovieField = "";//for storing entered movie title data
	private String ScoreField = "";//for storing entered score data
	private String errorMessage = "";//for storing error message
	private boolean isException = false;//represents whether there was exception
	/* Finish implementing field */
	
	public RateMoviesController(RateMoviesView rateMoviesView, AccountModel accountModel, List<MovieModel> movies) {
		this.rateMoviesView = rateMoviesView;
		this.accountModel = accountModel;
		this.movies = movies;
		this.rateMoviesView.setListener(this);//add action listener to buttons
	}//initialize fields in constructor

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			if(e.getSource() == rateMoviesView.getSumitRatingButton()) {
				this.MovieField = this.rateMoviesView.getSelectedMovie();
				this.ScoreField = this.rateMoviesView.getSelectedScore();
				if(MovieField.equals("(empty)") || ScoreField.equals("(empty"))throw new EmptySelectionException();//if any of two entered field is '(empty)', throw 'EmptySelectionException'
				else if(MovieField.equals("Toy Story")) {
					if(accountModel.getRating(0)>0) throw new DuplicationException();//if user already rated the movie, throw 'DuplicationException'
					else {
						float score = Float.parseFloat(ScoreField);
						accountModel.setRating(score, 0);
						movies.get(0).encapsulateRatingProcess(score);//add rating data
					}
				}
				else if(MovieField.equals("Four Rooms")) {
					if(accountModel.getRating(1)>0) throw new DuplicationException();//if user already rated the movie, throw 'DuplicationException'
					else {
						float score = Float.parseFloat(ScoreField);
						accountModel.setRating(score, 1);
						movies.get(1).encapsulateRatingProcess(score);//add rating data
					}
				}
				else if(MovieField.equals("Casino")) {
					if(accountModel.getRating(2)>0) throw new DuplicationException();//if user already rated the movie, throw 'DuplicationException'
					else {
						float score = Float.parseFloat(ScoreField);
						accountModel.setRating(score, 2);
						movies.get(2).encapsulateRatingProcess(score);//add rating data
					}
				}
				else if(MovieField.equals("Golden Eye")) {
					if(accountModel.getRating(3)>0) throw new DuplicationException();//if user already rated the movie, throw 'DuplicationException'
					else {
						float score = Float.parseFloat(ScoreField);
						accountModel.setRating(score, 3);
						movies.get(3).encapsulateRatingProcess(score);//add rating data
					}
				}
				else if(MovieField.equals("Heat")) {
					if(accountModel.getRating(4)>0) throw new DuplicationException();//if user already rated the movie, throw 'DuplicationException'
					else {
						float score = Float.parseFloat(ScoreField);
						accountModel.setRating(score, 4);
						movies.get(4).encapsulateRatingProcess(score);//add rating data
					}
				}
			}
		}
		catch (Exception ex){
			isException = true;//change state flag
			JOptionPane.showMessageDialog(null, errorMessage, "Error Message", JOptionPane.ERROR_MESSAGE);//show the problem message in pop-up window
		}
		finally {//reset fields
			if(isException == false) {//if there was no exceptions
				rateMoviesView.dispose();//dispose view window
			}
			/* Initialize fields */
			errorMessage = "";
			MovieField = "";
			ScoreField = "";
			isException = false;
			/* Finish initializing fields */
		}
	}
	
	/* Below are Exception classes */
	public class DuplicationException extends Exception {
		public DuplicationException() {
			errorMessage = "You already rated same movie!\n";
		}
	}
	
	public class EmptySelectionException extends Exception {
		public EmptySelectionException() {
			errorMessage = "You should select item except '(empty)'\n";
		}
	}
	/* Finish implementing Exception classes */
}
