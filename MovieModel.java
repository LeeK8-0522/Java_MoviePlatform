package Main;

public class MovieModel {
	private String movieName;
	private float averageScore;
	private float sumOfScores;
	private int numberOfRatings;
	
	public MovieModel(String movieName, float averageScore, float sumOfScores, int numberOfRatings) {
		this.movieName = movieName;
		this.averageScore = averageScore;
		this.sumOfScores = sumOfScores;
		this.numberOfRatings = numberOfRatings;
	}//initialize fields in constructor
	
	/* Below are getter-methods */
	public String getMovieName() {
		return this.movieName;
	}
	public float getAverageScore() {
		return this.averageScore;
	}
	public float getSumOfScores() {
		return this.sumOfScores;
	}
	public int getNumberOfRatings() {
		return this.numberOfRatings;
	}
	/* Finish implementing getter-methods*/

	public void setMovieNmae(String input) {
		this.movieName = input;
	}//setter method for movie name field
	
	public void addSumOfMovieScore(float input) {
		this.sumOfScores += input;
	}//add input score to sum of scores field
	
	public void addRating() {
		this.numberOfRatings++;
	}//increase number of ratings
	
	public void calculateAverageScore() {
		this.averageScore = this.sumOfScores / this.numberOfRatings;
	}//calculate average score by dividing sum of scores by number of ratings
	
	public void encapsulateRatingProcess(float score) {
		addSumOfMovieScore(score);
		addRating();
		calculateAverageScore();
	}//encapsulate updating rating information in movie model
}
