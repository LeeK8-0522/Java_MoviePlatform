package Main;

import java.awt.EventQueue;
import java.util.List;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		List<MovieModel> movies = new ArrayList<>();
		List<AccountModel> users = new ArrayList<>();
		
		movies.add(new MovieModel("Toy Story", 0, 0, 0));
		movies.add(new MovieModel("Four Rooms", 0, 0, 0));
		movies.add(new MovieModel("Casino", 0, 0, 0));
		movies.add(new MovieModel("Golden Eye", 0, 0, 0));
		movies.add(new MovieModel("Heat", 0, 0, 0));
		
		users.add(new AccountModel("SeHyeong","skku0522", "SKKU0522"));
		users.add(new AccountModel("Elon-Musk","twitter666","TWITTER666"));
		users.add(new AccountModel("Bill-Gates","MSGood","MSGOOD!!!"));
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {//run Runnable object
				try {
					EECinemaView eecinemaView = new EECinemaView();
					EECinemaController eecinemaController = new EECinemaController(movies, users, eecinemaView);
					eecinemaView.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
