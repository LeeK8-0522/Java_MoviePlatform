package Main;

import java.awt.EventQueue;
import java.net.URL;
import java.util.List;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Dimension;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.BoxLayout;
import javax.swing.JPasswordField;
import javax.swing.JSlider;
import javax.swing.JSeparator;
import java.awt.GridLayout;
import java.awt.Component;
import java.awt.ComponentOrientation;
import javax.swing.SwingConstants;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.FlowLayout;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JLayeredPane;
import javax.swing.JDesktopPane;
import javax.swing.JTree;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JProgressBar;
import javax.swing.JToolBar;
import javax.swing.JInternalFrame;
import java.awt.CardLayout;
import java.awt.Toolkit;

public class EECinemaView extends JFrame {

	/* Below are fields */
	private JButton LogIn_button;
	private JLabel HelloName_label;
	private JLabel Movie1Score_label;
	private JLabel Movie2Score_label;
	private JLabel Movie3Score_label;
	private JLabel Movie4Score_label;
	private JLabel Movie5Score_label;
	private JButton BookTicketsButton_button;
	private JButton TheaterInformationButton_button;
	private JButton RateMoviesButton_button;
	private JButton PersonalizedScorePredictionButton_button;
	private JLabel PointsLeft_label;
	private JLabel CouponLeft_label;
	private JLabel TicketsNumber_label;
	private JProgressBar progressBar;
	/* Finish implementing fields */
	

	/**
	 * Initialize the contents of the frame.
	 */
	public EECinemaView() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\User\\Desktop\\final_project\\final_project\\eeCinema.png"));
		setTitle("EECinema");
		setBounds(100, 100, 561, 608);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel North_panel = new JPanel();
		getContentPane().add(North_panel, BorderLayout.NORTH);
		North_panel.setLayout(new BoxLayout(North_panel, BoxLayout.X_AXIS));
		
		JPanel Title_panel = new JPanel();
		Title_panel.setPreferredSize(new Dimension(10, 70));
		Title_panel.setBackground(new Color(255, 98, 98));
		North_panel.add(Title_panel);
		Title_panel.setLayout(null);
		
		JLabel TitleImage_label = new JLabel("");
		TitleImage_label.setBounds(0, 0, 86, 70);
		TitleImage_label.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\final_project\\final_project\\film.png"));
		Title_panel.add(TitleImage_label);
		
		JLabel EECinemTitle_label = new JLabel("EECinema");
		EECinemTitle_label.setBounds(91, 0, 443, 70);
		EECinemTitle_label.setFont(new Font("굴림", Font.BOLD | Font.ITALIC, 22));
		Title_panel.add(EECinemTitle_label);
		
		JLabel EECinemaSubtitle_label = new JLabel("offer Extreme Experience");
		EECinemaSubtitle_label.setFont(new Font("굴림", Font.PLAIN, 11));
		EECinemaSubtitle_label.setBounds(91, 45, 158, 15);
		Title_panel.add(EECinemaSubtitle_label);
		
		JPanel NorthEast_panel = new JPanel();
		NorthEast_panel.setBackground(new Color(255, 98, 98));
		North_panel.add(NorthEast_panel);
		NorthEast_panel.setLayout(new GridLayout(2, 0, 0, 0));
		
		JPanel NorthEastUpper_panel = new JPanel();
		NorthEastUpper_panel.setBackground(new Color(255, 98, 98));
		NorthEast_panel.add(NorthEastUpper_panel);
		NorthEastUpper_panel.setLayout(new BoxLayout(NorthEastUpper_panel, BoxLayout.X_AXIS));
		
		JPanel blank_panel = new JPanel();
		blank_panel.setBackground(new Color(255, 98, 98));
		NorthEastUpper_panel.add(blank_panel);
		
		LogIn_button = new JButton("Log In");
		NorthEastUpper_panel.add(LogIn_button);
		LogIn_button.setFont(new Font("굴림", Font.PLAIN, 12));
		
		JPanel LogIn_panel = new JPanel();
		LogIn_panel.setBackground(new Color(255, 98, 98));
		NorthEastUpper_panel.add(LogIn_panel);
		LogIn_panel.setLayout(new BoxLayout(LogIn_panel, BoxLayout.X_AXIS));
		
		JPanel HelloName_panel = new JPanel();
		HelloName_panel.setBackground(new Color(255, 98, 98));
		NorthEast_panel.add(HelloName_panel);
		HelloName_panel.setLayout(new BorderLayout(0, 0));
		
		HelloName_label = new JLabel("Hello~! (NAME)");
		HelloName_label.setFont(new Font("굴림", Font.BOLD, 11));
		HelloName_label.setHorizontalAlignment(SwingConstants.CENTER);
		HelloName_panel.add(HelloName_label, BorderLayout.SOUTH);
		
		JPanel Center_panel = new JPanel();
		getContentPane().add(Center_panel, BorderLayout.CENTER);
		GridBagLayout gbl_Center_panel = new GridBagLayout();
		gbl_Center_panel.columnWidths = new int[]{0, 0};
		gbl_Center_panel.rowHeights = new int[]{0, 0, 0, 0};
		gbl_Center_panel.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_Center_panel.rowWeights = new double[]{1.0, 1.0, 1.0, Double.MIN_VALUE};
		Center_panel.setLayout(gbl_Center_panel);
		
		JPanel OnScreen_panel = new JPanel();
		OnScreen_panel.setLayout(null);
		GridBagConstraints gbc_OnScreen_panel = new GridBagConstraints();
		gbc_OnScreen_panel.insets = new Insets(0, 0, 5, 0);
		gbc_OnScreen_panel.weighty = 1.0;
		gbc_OnScreen_panel.fill = GridBagConstraints.BOTH;
		gbc_OnScreen_panel.gridx = 0;
		gbc_OnScreen_panel.gridy = 0;
		Center_panel.add(OnScreen_panel, gbc_OnScreen_panel);
		
		JLabel OnScreen_label = new JLabel("On Screen:");
		OnScreen_label.setBounds(12, 0, 157, 43);
		OnScreen_label.setFont(new Font("돋움체", Font.BOLD | Font.ITALIC, 14));
		OnScreen_panel.add(OnScreen_label);
		
		JScrollPane OnScreen_scrollPane = new JScrollPane();
		GridBagConstraints gbc_OnScreen_scrollPane = new GridBagConstraints();
		gbc_OnScreen_scrollPane.insets = new Insets(0, 0, 5, 0);
		gbc_OnScreen_scrollPane.weighty = 6.0;
		gbc_OnScreen_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_OnScreen_scrollPane.gridx = 0;
		gbc_OnScreen_scrollPane.gridy = 1;
		Center_panel.add(OnScreen_scrollPane, gbc_OnScreen_scrollPane);
		
		JPanel Movies_panel = new JPanel();
		OnScreen_scrollPane.setViewportView(Movies_panel);
		Movies_panel.setLayout(new BoxLayout(Movies_panel, BoxLayout.X_AXIS));
		
		JPanel Movie1_panel = new JPanel();
		Movies_panel.add(Movie1_panel);
		Movie1_panel.setLayout(new BorderLayout(5, 5));
		
		JLabel Movie1Title_label = new JLabel("Toy Story");
		Movie1Title_label.setHorizontalAlignment(SwingConstants.CENTER);
		Movie1Title_label.setFont(new Font("굴림", Font.BOLD, 12));
		Movie1_panel.add(Movie1Title_label, BorderLayout.NORTH);
		
		Movie1Score_label = new JLabel("Score:");
		Movie1Score_label.setHorizontalAlignment(SwingConstants.CENTER);
		Movie1Score_label.setFont(new Font("굴림", Font.BOLD, 12));
		Movie1_panel.add(Movie1Score_label, BorderLayout.SOUTH);
		
		JLabel Movie1Poster_label = new JLabel("");
		Movie1Poster_label.setHorizontalAlignment(SwingConstants.CENTER);
		Movie1Poster_label.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\final_project\\final_project\\ToyStory.jpg"));
		Movie1_panel.add(Movie1Poster_label, BorderLayout.CENTER);
		
		JPanel Movie2_panel = new JPanel();
		Movies_panel.add(Movie2_panel);
		Movie2_panel.setLayout(new BorderLayout(5, 5));
		
		JLabel Movie2Title_label = new JLabel("Four Rooms");
		Movie2Title_label.setFont(new Font("굴림", Font.BOLD, 12));
		Movie2Title_label.setHorizontalAlignment(SwingConstants.CENTER);
		Movie2_panel.add(Movie2Title_label, BorderLayout.NORTH);
		
		JLabel Movie2Poster_label = new JLabel("");
		Movie2Poster_label.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\final_project\\final_project\\FourRooms.jpg"));
		Movie2Poster_label.setHorizontalAlignment(SwingConstants.CENTER);
		Movie2_panel.add(Movie2Poster_label, BorderLayout.CENTER);
		
		Movie2Score_label = new JLabel("Score:");
		Movie2Score_label.setFont(new Font("굴림", Font.BOLD, 12));
		Movie2Score_label.setHorizontalAlignment(SwingConstants.CENTER);
		Movie2_panel.add(Movie2Score_label, BorderLayout.SOUTH);
		
		JPanel Movie3_panel = new JPanel();
		Movies_panel.add(Movie3_panel);
		Movie3_panel.setLayout(new BorderLayout(5, 5));
		
		JLabel Movie3Title_label = new JLabel("Casino");
		Movie3Title_label.setHorizontalAlignment(SwingConstants.CENTER);
		Movie3Title_label.setFont(new Font("굴림", Font.BOLD, 12));
		Movie3_panel.add(Movie3Title_label, BorderLayout.NORTH);
		
		JLabel Movie3Poster_label = new JLabel("");
		Movie3Poster_label.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\final_project\\final_project\\Casino.jpg"));
		Movie3Poster_label.setHorizontalAlignment(SwingConstants.CENTER);
		Movie3_panel.add(Movie3Poster_label, BorderLayout.CENTER);
		
		Movie3Score_label = new JLabel("Score:");
		Movie3Score_label.setHorizontalAlignment(SwingConstants.CENTER);
		Movie3Score_label.setFont(new Font("굴림", Font.BOLD, 12));
		Movie3_panel.add(Movie3Score_label, BorderLayout.SOUTH);
		
		JPanel Movie4_panel = new JPanel();
		Movies_panel.add(Movie4_panel);
		Movie4_panel.setLayout(new BorderLayout(5, 5));
		
		JLabel Movie4Title_label = new JLabel("Golden Eye");
		Movie4Title_label.setHorizontalAlignment(SwingConstants.CENTER);
		Movie4Title_label.setFont(new Font("굴림", Font.BOLD, 12));
		Movie4_panel.add(Movie4Title_label, BorderLayout.NORTH);
		
		Movie4Score_label = new JLabel("Score:");
		Movie4Score_label.setFont(new Font("굴림", Font.BOLD, 12));
		Movie4Score_label.setHorizontalAlignment(SwingConstants.CENTER);
		Movie4_panel.add(Movie4Score_label, BorderLayout.SOUTH);
		
		JLabel Movie4Poster_label = new JLabel("");
		Movie4Poster_label.setHorizontalAlignment(SwingConstants.CENTER);
		Movie4Poster_label.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\final_project\\final_project\\GoldenEye.jpg"));
		Movie4_panel.add(Movie4Poster_label, BorderLayout.CENTER);
		
		JPanel Movie5_panel = new JPanel();
		Movies_panel.add(Movie5_panel);
		Movie5_panel.setLayout(new BorderLayout(5, 5));
		
		JLabel Movie5Title_label = new JLabel("Heat");
		Movie5Title_label.setFont(new Font("굴림", Font.BOLD, 12));
		Movie5Title_label.setHorizontalAlignment(SwingConstants.CENTER);
		Movie5_panel.add(Movie5Title_label, BorderLayout.NORTH);
		
		JLabel Movie5Poster_label = new JLabel("");
		Movie5Poster_label.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\final_project\\final_project\\Heat.jpg"));
		Movie5Poster_label.setHorizontalAlignment(SwingConstants.CENTER);
		Movie5_panel.add(Movie5Poster_label, BorderLayout.CENTER);
		
		Movie5Score_label = new JLabel("Score:");
		Movie5Score_label.setHorizontalAlignment(SwingConstants.CENTER);
		Movie5Score_label.setFont(new Font("굴림", Font.BOLD, 12));
		Movie5_panel.add(Movie5Score_label, BorderLayout.SOUTH);
		
		JScrollPane Menu_scrollPane = new JScrollPane();
		GridBagConstraints gbc_Menu_scrollPane = new GridBagConstraints();
		gbc_Menu_scrollPane.weighty = 9.0;
		gbc_Menu_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_Menu_scrollPane.gridx = 0;
		gbc_Menu_scrollPane.gridy = 2;
		Center_panel.add(Menu_scrollPane, gbc_Menu_scrollPane);
		
		JPanel Menu_panel = new JPanel();
		Menu_scrollPane.setViewportView(Menu_panel);
		Menu_panel.setLayout(new BoxLayout(Menu_panel, BoxLayout.X_AXIS));
		
		JPanel BookTickets_panel = new JPanel();
		Menu_panel.add(BookTickets_panel);
		GridBagLayout gbl_BookTickets_panel = new GridBagLayout();
		gbl_BookTickets_panel.columnWidths = new int[]{0, 0};
		gbl_BookTickets_panel.rowHeights = new int[]{0, 0, 0, 0};
		gbl_BookTickets_panel.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_BookTickets_panel.rowWeights = new double[]{1.0, 1.0, 1.0, Double.MIN_VALUE};
		BookTickets_panel.setLayout(gbl_BookTickets_panel);
		
		JPanel BookTicketsBlank_panel = new JPanel();
		GridBagConstraints gbc_BookTicketsBlank_panel = new GridBagConstraints();
		gbc_BookTicketsBlank_panel.weighty = 1.0;
		gbc_BookTicketsBlank_panel.fill = GridBagConstraints.BOTH;
		gbc_BookTicketsBlank_panel.gridx = 0;
		gbc_BookTicketsBlank_panel.gridy = 0;
		BookTickets_panel.add(BookTicketsBlank_panel, gbc_BookTicketsBlank_panel);
		
		JPanel BookTicketsImage_panel = new JPanel();
		GridBagConstraints gbc_BookTicketsImage_panel = new GridBagConstraints();
		gbc_BookTicketsImage_panel.weighty = 6.0;
		gbc_BookTicketsImage_panel.fill = GridBagConstraints.BOTH;
		gbc_BookTicketsImage_panel.gridx = 0;
		gbc_BookTicketsImage_panel.gridy = 1;
		BookTickets_panel.add(BookTicketsImage_panel, gbc_BookTicketsImage_panel);
		BookTicketsImage_panel.setLayout(new BorderLayout(0, 0));
		
		JLabel BookTicketsTitle_label = new JLabel("Book Tickets");
		BookTicketsTitle_label.setHorizontalAlignment(SwingConstants.CENTER);
		BookTicketsTitle_label.setFont(new Font("굴림", Font.BOLD, 16));
		BookTicketsImage_panel.add(BookTicketsTitle_label, BorderLayout.CENTER);
		
		JLabel BookTicketsImage_label = new JLabel("");
		BookTicketsImage_label.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\final_project\\final_project\\ticket.png"));
		BookTicketsImage_label.setHorizontalAlignment(SwingConstants.CENTER);
		BookTicketsImage_panel.add(BookTicketsImage_label, BorderLayout.SOUTH);
		
		JPanel BookTicketsButton_panel = new JPanel();
		GridBagConstraints gbc_BookTicketsButton_panel = new GridBagConstraints();
		gbc_BookTicketsButton_panel.weighty = 3.0;
		gbc_BookTicketsButton_panel.fill = GridBagConstraints.BOTH;
		gbc_BookTicketsButton_panel.gridx = 0;
		gbc_BookTicketsButton_panel.gridy = 2;
		BookTickets_panel.add(BookTicketsButton_panel, gbc_BookTicketsButton_panel);
		GridBagLayout gbl_BookTicketsButton_panel = new GridBagLayout();
		gbl_BookTicketsButton_panel.columnWidths = new int[]{0, 0};
		gbl_BookTicketsButton_panel.rowHeights = new int[]{0, 0, 0, 0};
		gbl_BookTicketsButton_panel.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_BookTicketsButton_panel.rowWeights = new double[]{1.0, 0.0, 1.0, Double.MIN_VALUE};
		BookTicketsButton_panel.setLayout(gbl_BookTicketsButton_panel);
		
		JPanel BookTicketsButtonNorth_panel = new JPanel();
		GridBagConstraints gbc_BookTicketsButtonNorth_panel = new GridBagConstraints();
		gbc_BookTicketsButtonNorth_panel.weighty = 1.0;
		gbc_BookTicketsButtonNorth_panel.fill = GridBagConstraints.BOTH;
		gbc_BookTicketsButtonNorth_panel.gridx = 0;
		gbc_BookTicketsButtonNorth_panel.gridy = 0;
		BookTicketsButton_panel.add(BookTicketsButtonNorth_panel, gbc_BookTicketsButtonNorth_panel);
		
		BookTicketsButton_button = new JButton("");
		BookTicketsButton_button.setBackground(new Color(245, 245, 245));
		BookTicketsButton_button.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\final_project\\final_project\\go-removebg-preview (1).png"));
		GridBagConstraints gbc_BookTicketsButton_button = new GridBagConstraints();
		gbc_BookTicketsButton_button.weighty = 3.0;
		gbc_BookTicketsButton_button.gridx = 0;
		gbc_BookTicketsButton_button.gridy = 1;
		BookTicketsButton_panel.add(BookTicketsButton_button, gbc_BookTicketsButton_button);
		
		JPanel BookTicketsButtonSouth_panel = new JPanel();
		GridBagConstraints gbc_BookTicketsButtonSouth_panel = new GridBagConstraints();
		gbc_BookTicketsButtonSouth_panel.weighty = 1.0;
		gbc_BookTicketsButtonSouth_panel.fill = GridBagConstraints.BOTH;
		gbc_BookTicketsButtonSouth_panel.gridx = 0;
		gbc_BookTicketsButtonSouth_panel.gridy = 2;
		BookTicketsButton_panel.add(BookTicketsButtonSouth_panel, gbc_BookTicketsButtonSouth_panel);
		
		JPanel TheaterInformation_panel = new JPanel();
		Menu_panel.add(TheaterInformation_panel);
		GridBagLayout gbl_TheaterInformation_panel = new GridBagLayout();
		gbl_TheaterInformation_panel.columnWidths = new int[]{0, 0};
		gbl_TheaterInformation_panel.rowHeights = new int[]{0, 0, 0, 0};
		gbl_TheaterInformation_panel.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_TheaterInformation_panel.rowWeights = new double[]{1.0, 1.0, 1.0, Double.MIN_VALUE};
		TheaterInformation_panel.setLayout(gbl_TheaterInformation_panel);
		
		JPanel TheaterInformationBlank_panel = new JPanel();
		GridBagConstraints gbc_TheaterInformationBlank_panel = new GridBagConstraints();
		gbc_TheaterInformationBlank_panel.weighty = 1.0;
		gbc_TheaterInformationBlank_panel.fill = GridBagConstraints.BOTH;
		gbc_TheaterInformationBlank_panel.gridx = 0;
		gbc_TheaterInformationBlank_panel.gridy = 0;
		TheaterInformation_panel.add(TheaterInformationBlank_panel, gbc_TheaterInformationBlank_panel);
		
		JPanel TheaterInformationImage_panel = new JPanel();
		GridBagConstraints gbc_TheaterInformationImage_panel = new GridBagConstraints();
		gbc_TheaterInformationImage_panel.weighty = 6.0;
		gbc_TheaterInformationImage_panel.fill = GridBagConstraints.BOTH;
		gbc_TheaterInformationImage_panel.gridx = 0;
		gbc_TheaterInformationImage_panel.gridy = 1;
		TheaterInformation_panel.add(TheaterInformationImage_panel, gbc_TheaterInformationImage_panel);
		TheaterInformationImage_panel.setLayout(new BorderLayout(0, 0));
		
		JLabel TheaterInformationTitle_label = new JLabel("Theaters Information");
		TheaterInformationTitle_label.setHorizontalAlignment(SwingConstants.CENTER);
		TheaterInformationTitle_label.setFont(new Font("굴림", Font.BOLD, 16));
		TheaterInformationImage_panel.add(TheaterInformationTitle_label, BorderLayout.CENTER);
		
		JLabel TheaterInformationImage_label = new JLabel("");
		TheaterInformationImage_label.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\final_project\\final_project\\theater.png"));
		TheaterInformationImage_label.setHorizontalAlignment(SwingConstants.CENTER);
		TheaterInformationImage_panel.add(TheaterInformationImage_label, BorderLayout.SOUTH);
		
		JPanel TheaterInformationButton_panel = new JPanel();
		GridBagConstraints gbc_TheaterInformationButton_panel = new GridBagConstraints();
		gbc_TheaterInformationButton_panel.weighty = 3.0;
		gbc_TheaterInformationButton_panel.fill = GridBagConstraints.BOTH;
		gbc_TheaterInformationButton_panel.gridx = 0;
		gbc_TheaterInformationButton_panel.gridy = 2;
		TheaterInformation_panel.add(TheaterInformationButton_panel, gbc_TheaterInformationButton_panel);
		GridBagLayout gbl_TheaterInformationButton_panel = new GridBagLayout();
		gbl_TheaterInformationButton_panel.columnWidths = new int[]{0, 0};
		gbl_TheaterInformationButton_panel.rowHeights = new int[]{0, 0, 0, 0};
		gbl_TheaterInformationButton_panel.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_TheaterInformationButton_panel.rowWeights = new double[]{1.0, 0.0, 1.0, Double.MIN_VALUE};
		TheaterInformationButton_panel.setLayout(gbl_TheaterInformationButton_panel);
		
		JPanel TheaterInformationButtonNorth_panel = new JPanel();
		GridBagConstraints gbc_TheaterInformationButtonNorth_panel = new GridBagConstraints();
		gbc_TheaterInformationButtonNorth_panel.weighty = 1.0;
		gbc_TheaterInformationButtonNorth_panel.fill = GridBagConstraints.BOTH;
		gbc_TheaterInformationButtonNorth_panel.gridx = 0;
		gbc_TheaterInformationButtonNorth_panel.gridy = 0;
		TheaterInformationButton_panel.add(TheaterInformationButtonNorth_panel, gbc_TheaterInformationButtonNorth_panel);
		
		TheaterInformationButton_button = new JButton("");
		TheaterInformationButton_button.setBackground(new Color(245, 245, 245));
		TheaterInformationButton_button.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\final_project\\final_project\\go-removebg-preview (1).png"));
		GridBagConstraints gbc_TheaterInformationButton_button = new GridBagConstraints();
		gbc_TheaterInformationButton_button.weighty = 3.0;
		gbc_TheaterInformationButton_button.gridx = 0;
		gbc_TheaterInformationButton_button.gridy = 1;
		TheaterInformationButton_panel.add(TheaterInformationButton_button, gbc_TheaterInformationButton_button);
		
		JPanel TheaterInformationButtonSouth_panel = new JPanel();
		GridBagConstraints gbc_TheaterInformationButtonSouth_panel = new GridBagConstraints();
		gbc_TheaterInformationButtonSouth_panel.weighty = 1.0;
		gbc_TheaterInformationButtonSouth_panel.fill = GridBagConstraints.BOTH;
		gbc_TheaterInformationButtonSouth_panel.gridx = 0;
		gbc_TheaterInformationButtonSouth_panel.gridy = 2;
		TheaterInformationButton_panel.add(TheaterInformationButtonSouth_panel, gbc_TheaterInformationButtonSouth_panel);
		
		JPanel RateMovies_panel = new JPanel();
		Menu_panel.add(RateMovies_panel);
		GridBagLayout gbl_RateMovies_panel = new GridBagLayout();
		gbl_RateMovies_panel.columnWidths = new int[]{0, 0};
		gbl_RateMovies_panel.rowHeights = new int[]{0, 0, 0, 0};
		gbl_RateMovies_panel.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_RateMovies_panel.rowWeights = new double[]{1.0, 1.0, 1.0, Double.MIN_VALUE};
		RateMovies_panel.setLayout(gbl_RateMovies_panel);
		
		JPanel RateMoviesBlank_panel = new JPanel();
		GridBagConstraints gbc_RateMoviesBlank_panel = new GridBagConstraints();
		gbc_RateMoviesBlank_panel.weighty = 1.0;
		gbc_RateMoviesBlank_panel.fill = GridBagConstraints.BOTH;
		gbc_RateMoviesBlank_panel.gridx = 0;
		gbc_RateMoviesBlank_panel.gridy = 0;
		RateMovies_panel.add(RateMoviesBlank_panel, gbc_RateMoviesBlank_panel);
		
		JPanel RateMoviesImage_panel = new JPanel();
		GridBagConstraints gbc_RateMoviesImage_panel = new GridBagConstraints();
		gbc_RateMoviesImage_panel.weighty = 6.0;
		gbc_RateMoviesImage_panel.fill = GridBagConstraints.BOTH;
		gbc_RateMoviesImage_panel.gridx = 0;
		gbc_RateMoviesImage_panel.gridy = 1;
		RateMovies_panel.add(RateMoviesImage_panel, gbc_RateMoviesImage_panel);
		RateMoviesImage_panel.setLayout(new BorderLayout(0, 0));
		
		JLabel RateMoviesImageTitle_label = new JLabel("Rate Movies");
		RateMoviesImageTitle_label.setFont(new Font("굴림", Font.BOLD, 16));
		RateMoviesImageTitle_label.setHorizontalAlignment(SwingConstants.CENTER);
		RateMoviesImage_panel.add(RateMoviesImageTitle_label, BorderLayout.CENTER);
		
		JLabel RateMoviesImage_label = new JLabel("");
		RateMoviesImage_label.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\final_project\\final_project\\score-removebg-preview.png"));
		RateMoviesImage_label.setHorizontalAlignment(SwingConstants.CENTER);
		RateMoviesImage_panel.add(RateMoviesImage_label, BorderLayout.SOUTH);
		
		JPanel RateMoviesButton_panel = new JPanel();
		GridBagConstraints gbc_RateMoviesButton_panel = new GridBagConstraints();
		gbc_RateMoviesButton_panel.weighty = 3.0;
		gbc_RateMoviesButton_panel.fill = GridBagConstraints.BOTH;
		gbc_RateMoviesButton_panel.gridx = 0;
		gbc_RateMoviesButton_panel.gridy = 2;
		RateMovies_panel.add(RateMoviesButton_panel, gbc_RateMoviesButton_panel);
		GridBagLayout gbl_RateMoviesButton_panel = new GridBagLayout();
		gbl_RateMoviesButton_panel.columnWidths = new int[]{0, 0};
		gbl_RateMoviesButton_panel.rowHeights = new int[]{0, 0, 0, 0};
		gbl_RateMoviesButton_panel.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_RateMoviesButton_panel.rowWeights = new double[]{1.0, 0.0, 1.0, Double.MIN_VALUE};
		RateMoviesButton_panel.setLayout(gbl_RateMoviesButton_panel);
		
		JPanel RateMoviesButtonNorth_panel = new JPanel();
		GridBagConstraints gbc_RateMoviesButtonNorth_panel = new GridBagConstraints();
		gbc_RateMoviesButtonNorth_panel.weighty = 1.0;
		gbc_RateMoviesButtonNorth_panel.fill = GridBagConstraints.BOTH;
		gbc_RateMoviesButtonNorth_panel.gridx = 0;
		gbc_RateMoviesButtonNorth_panel.gridy = 0;
		RateMoviesButton_panel.add(RateMoviesButtonNorth_panel, gbc_RateMoviesButtonNorth_panel);
		
		RateMoviesButton_button = new JButton("");
		RateMoviesButton_button.setBackground(new Color(245, 245, 245));
		RateMoviesButton_button.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\final_project\\final_project\\go-removebg-preview (1).png"));
		GridBagConstraints gbc_RateMoviesButton_button = new GridBagConstraints();
		gbc_RateMoviesButton_button.weighty = 3.0;
		gbc_RateMoviesButton_button.gridx = 0;
		gbc_RateMoviesButton_button.gridy = 1;
		RateMoviesButton_panel.add(RateMoviesButton_button, gbc_RateMoviesButton_button);
		
		JPanel RateMoviesButtonSouth_panel = new JPanel();
		GridBagConstraints gbc_RateMoviesButtonSouth_panel = new GridBagConstraints();
		gbc_RateMoviesButtonSouth_panel.weighty = 1.0;
		gbc_RateMoviesButtonSouth_panel.fill = GridBagConstraints.BOTH;
		gbc_RateMoviesButtonSouth_panel.gridx = 0;
		gbc_RateMoviesButtonSouth_panel.gridy = 2;
		RateMoviesButton_panel.add(RateMoviesButtonSouth_panel, gbc_RateMoviesButtonSouth_panel);
		
		JPanel PersonalizedScorePrediction_panel = new JPanel();
		Menu_panel.add(PersonalizedScorePrediction_panel);
		GridBagLayout gbl_PersonalizedScorePrediction_panel = new GridBagLayout();
		gbl_PersonalizedScorePrediction_panel.columnWidths = new int[]{0, 0};
		gbl_PersonalizedScorePrediction_panel.rowHeights = new int[]{0, 0, 0, 0};
		gbl_PersonalizedScorePrediction_panel.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_PersonalizedScorePrediction_panel.rowWeights = new double[]{1.0, 1.0, 1.0, Double.MIN_VALUE};
		PersonalizedScorePrediction_panel.setLayout(gbl_PersonalizedScorePrediction_panel);
		
		JPanel PersonalizedScorePredictionNorth_panel = new JPanel();
		GridBagConstraints gbc_PersonalizedScorePredictionNorth_panel = new GridBagConstraints();
		gbc_PersonalizedScorePredictionNorth_panel.weighty = 1.0;
		gbc_PersonalizedScorePredictionNorth_panel.fill = GridBagConstraints.BOTH;
		gbc_PersonalizedScorePredictionNorth_panel.gridx = 0;
		gbc_PersonalizedScorePredictionNorth_panel.gridy = 0;
		PersonalizedScorePrediction_panel.add(PersonalizedScorePredictionNorth_panel, gbc_PersonalizedScorePredictionNorth_panel);
		
		JPanel PersonalizedScorePredictionImage_panel = new JPanel();
		GridBagConstraints gbc_PersonalizedScorePredictionImage_panel = new GridBagConstraints();
		gbc_PersonalizedScorePredictionImage_panel.weighty = 6.0;
		gbc_PersonalizedScorePredictionImage_panel.fill = GridBagConstraints.BOTH;
		gbc_PersonalizedScorePredictionImage_panel.gridx = 0;
		gbc_PersonalizedScorePredictionImage_panel.gridy = 1;
		PersonalizedScorePrediction_panel.add(PersonalizedScorePredictionImage_panel, gbc_PersonalizedScorePredictionImage_panel);
		PersonalizedScorePredictionImage_panel.setLayout(new BorderLayout(0, 0));
		
		JLabel PersonalizedScorePredictionImageTitle_label = new JLabel("Personalized Score Prediction");
		PersonalizedScorePredictionImageTitle_label.setHorizontalAlignment(SwingConstants.CENTER);
		PersonalizedScorePredictionImageTitle_label.setFont(new Font("굴림", Font.BOLD, 16));
		PersonalizedScorePredictionImage_panel.add(PersonalizedScorePredictionImageTitle_label, BorderLayout.CENTER);
		
		JLabel PersonalizedScorePredictionImage_label = new JLabel("");
		PersonalizedScorePredictionImage_label.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\final_project\\final_project\\ai.png"));
		PersonalizedScorePredictionImage_label.setHorizontalAlignment(SwingConstants.CENTER);
		PersonalizedScorePredictionImage_panel.add(PersonalizedScorePredictionImage_label, BorderLayout.SOUTH);
		
		JPanel PersonalizedScorePredictionButton_panel = new JPanel();
		GridBagConstraints gbc_PersonalizedScorePredictionButton_panel = new GridBagConstraints();
		gbc_PersonalizedScorePredictionButton_panel.weighty = 3.0;
		gbc_PersonalizedScorePredictionButton_panel.fill = GridBagConstraints.BOTH;
		gbc_PersonalizedScorePredictionButton_panel.gridx = 0;
		gbc_PersonalizedScorePredictionButton_panel.gridy = 2;
		PersonalizedScorePrediction_panel.add(PersonalizedScorePredictionButton_panel, gbc_PersonalizedScorePredictionButton_panel);
		GridBagLayout gbl_PersonalizedScorePredictionButton_panel = new GridBagLayout();
		gbl_PersonalizedScorePredictionButton_panel.columnWidths = new int[]{0, 0};
		gbl_PersonalizedScorePredictionButton_panel.rowHeights = new int[]{0, 0, 0, 0};
		gbl_PersonalizedScorePredictionButton_panel.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_PersonalizedScorePredictionButton_panel.rowWeights = new double[]{1.0, 0.0, 1.0, Double.MIN_VALUE};
		PersonalizedScorePredictionButton_panel.setLayout(gbl_PersonalizedScorePredictionButton_panel);
		
		JPanel PersonalizedScorePredictionButtonNorth_panel = new JPanel();
		GridBagConstraints gbc_PersonalizedScorePredictionButtonNorth_panel = new GridBagConstraints();
		gbc_PersonalizedScorePredictionButtonNorth_panel.weighty = 1.0;
		gbc_PersonalizedScorePredictionButtonNorth_panel.fill = GridBagConstraints.BOTH;
		gbc_PersonalizedScorePredictionButtonNorth_panel.gridx = 0;
		gbc_PersonalizedScorePredictionButtonNorth_panel.gridy = 0;
		PersonalizedScorePredictionButton_panel.add(PersonalizedScorePredictionButtonNorth_panel, gbc_PersonalizedScorePredictionButtonNorth_panel);
		
		PersonalizedScorePredictionButton_button = new JButton("");
		PersonalizedScorePredictionButton_button.setBackground(new Color(245, 245, 245));
		PersonalizedScorePredictionButton_button.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\final_project\\final_project\\go-removebg-preview (1).png"));
		GridBagConstraints gbc_PersonalizedScorePredictionButton_button = new GridBagConstraints();
		gbc_PersonalizedScorePredictionButton_button.weighty = 3.0;
		gbc_PersonalizedScorePredictionButton_button.gridx = 0;
		gbc_PersonalizedScorePredictionButton_button.gridy = 1;
		PersonalizedScorePredictionButton_panel.add(PersonalizedScorePredictionButton_button, gbc_PersonalizedScorePredictionButton_button);
		
		JPanel PersonalizedScorePredictionButtonSouth_panel = new JPanel();
		GridBagConstraints gbc_PersonalizedScorePredictionButtonSouth_panel = new GridBagConstraints();
		gbc_PersonalizedScorePredictionButtonSouth_panel.weighty = 1.0;
		gbc_PersonalizedScorePredictionButtonSouth_panel.fill = GridBagConstraints.BOTH;
		gbc_PersonalizedScorePredictionButtonSouth_panel.gridx = 0;
		gbc_PersonalizedScorePredictionButtonSouth_panel.gridy = 2;
		PersonalizedScorePredictionButton_panel.add(PersonalizedScorePredictionButtonSouth_panel, gbc_PersonalizedScorePredictionButtonSouth_panel);
		
		JPanel State_panel = new JPanel();
		State_panel.setBackground(new Color(255, 98, 98));
		getContentPane().add(State_panel, BorderLayout.SOUTH);
		State_panel.setLayout(new BoxLayout(State_panel, BoxLayout.X_AXIS));
		
		JPanel ProgressBar_panel = new JPanel();
		ProgressBar_panel.setBackground(new Color(255, 98, 98));
		State_panel.add(ProgressBar_panel);
		ProgressBar_panel.setLayout(new BoxLayout(ProgressBar_panel, BoxLayout.X_AXIS));
		
		progressBar = new JProgressBar();
		progressBar.setStringPainted(true);
		ProgressBar_panel.add(progressBar);
		
		JPanel StatesOfUser_panel = new JPanel();
		StatesOfUser_panel.setBackground(new Color(255, 98, 98));
		State_panel.add(StatesOfUser_panel);
		StatesOfUser_panel.setLayout(new BoxLayout(StatesOfUser_panel, BoxLayout.X_AXIS));
		
		JPanel TicketsSate_pannel = new JPanel();
		TicketsSate_pannel.setBackground(new Color(255, 98, 98));
		StatesOfUser_panel.add(TicketsSate_pannel);
		TicketsSate_pannel.setLayout(new BorderLayout(5, 5));
		
		JLabel TicketsTitle_label = new JLabel("Ticket(s):");
		TicketsTitle_label.setHorizontalAlignment(SwingConstants.RIGHT);
		TicketsTitle_label.setFont(new Font("굴림", Font.BOLD, 12));
		TicketsSate_pannel.add(TicketsTitle_label, BorderLayout.WEST);
		
		TicketsNumber_label = new JLabel("");
		TicketsNumber_label.setHorizontalAlignment(SwingConstants.CENTER);
		TicketsSate_pannel.add(TicketsNumber_label);
		
		JPanel CouponState_pannel = new JPanel();
		CouponState_pannel.setBackground(new Color(255, 98, 98));
		StatesOfUser_panel.add(CouponState_pannel);
		CouponState_pannel.setLayout(new BorderLayout(5, 5));
		
		JLabel CouponTitle_label = new JLabel("Coupon:");
		CouponTitle_label.setHorizontalAlignment(SwingConstants.RIGHT);
		CouponTitle_label.setFont(new Font("굴림", Font.BOLD, 12));
		CouponState_pannel.add(CouponTitle_label, BorderLayout.WEST);
		
		CouponLeft_label = new JLabel("");
		CouponLeft_label.setHorizontalAlignment(SwingConstants.CENTER);
		CouponState_pannel.add(CouponLeft_label);
		
		JPanel PointsState_panel = new JPanel();
		PointsState_panel.setBackground(new Color(255, 98, 98));
		StatesOfUser_panel.add(PointsState_panel);
		PointsState_panel.setLayout(new BorderLayout(5, 5));
		
		JLabel PointsTitle_label = new JLabel("Points:");
		PointsTitle_label.setFont(new Font("굴림", Font.BOLD, 12));
		PointsTitle_label.setHorizontalAlignment(SwingConstants.RIGHT);
		PointsState_panel.add(PointsTitle_label, BorderLayout.WEST);
		
		PointsLeft_label = new JLabel("");
		PointsLeft_label.setHorizontalAlignment(SwingConstants.CENTER);
		PointsState_panel.add(PointsLeft_label);
	}
	
	public void setActionListener(ActionListener listener) {
		LogIn_button.addActionListener(listener);
		BookTicketsButton_button.addActionListener(listener);
		TheaterInformationButton_button.addActionListener(listener);
		RateMoviesButton_button.addActionListener(listener);
		PersonalizedScorePredictionButton_button.addActionListener(listener);
	}//add action listener to each button
	
	/* Below are getter methods */
	public JButton getLogInButton() {
		return this.LogIn_button;
	}
	
	public JButton getBookTicketsButton() {
		return this.BookTicketsButton_button;
	}
	
	public JButton getTheaterInformationButton() {
		return this.TheaterInformationButton_button;
	}
	
	public JButton getRateMoviesButton() {
		return this.RateMoviesButton_button;
	}
	
	public JButton getPersonalizedScorePredictionButton() {
		return this.PersonalizedScorePredictionButton_button;
	}
	/* Finish implementing getter methods */
	
	/* Below are setter-methods */
	public void setHelloNameLabel(String input) {
		this.HelloName_label.setText(input);
	}
	public void setMovie1Score(String input) {
		this.Movie1Score_label.setText(input);
	}
	public void setMovie2Score(String input) {
		this.Movie2Score_label.setText(input);
	}
	public void setMovie3Score(String input) {
		this.Movie3Score_label.setText(input);
	}
	public void setMovie4Score(String input) {
		this.Movie4Score_label.setText(input);
	}
	public void setMovie5Score(String input) {
		this.Movie5Score_label.setText(input);
	}
	public void setTicketsNumberLabel(String input) {
		this.TicketsNumber_label.setText(input);
	}
	public void setCouponLeftLabel(String input) {
		this.CouponLeft_label.setText(input);
	}
	public void setPointsLeftLabel(String input) {
		this.PointsLeft_label.setText(input);
	}
	/* Finish implementing setter-methods */
	
	public void clearState() {
		this.getLogInButton().setText("Log In");
		this.setHelloNameLabel("Hello~!(NAME)");
		this.setTicketsNumberLabel("");
		this.setCouponLeftLabel("");
		this.setPointsLeftLabel("");
	}//clear 'hello~! (NAME)'part label
	
	public void updateState(AccountModel accountModel) {
		this.getLogInButton().setText("Log Out");
		this.setHelloNameLabel("Hello~! "+accountModel.getUserName());
		this.setTicketsNumberLabel(Integer.toString(accountModel.getNumberOfTickets()));
		this.setCouponLeftLabel(Integer.toString(accountModel.getNumberOfCoupons()));
		this.setPointsLeftLabel(Integer.toString(accountModel.getAmountOfPoints()));
	}//update 'hello~! (NAME)"part label
	
	public void updateMovieScoreState(List<MovieModel> movies) {
		this.setMovie1Score(Float.toString(movies.get(0).getAverageScore()));
		this.setMovie2Score(Float.toString(movies.get(1).getAverageScore()));
		this.setMovie3Score(Float.toString(movies.get(2).getAverageScore()));
		this.setMovie4Score(Float.toString(movies.get(3).getAverageScore()));
		this.setMovie5Score(Float.toString(movies.get(4).getAverageScore()));
	}//update movie average score information screen
}
