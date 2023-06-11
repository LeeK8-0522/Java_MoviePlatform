package Main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.GridLayout;
import javax.swing.JComboBox;
import javax.swing.SwingConstants;
import javax.swing.DefaultComboBoxModel;

public class RateMoviesView extends JFrame {

	private JPanel contentPane;
	private JComboBox ScoreField_comboBox;
	private JComboBox MovieField_comboBox;
	private JButton SubmitRating_button;

	/**
	 * Create the frame.
	 */
	public RateMoviesView() {
		setTitle("EEC Rate Movies");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\User\\Desktop\\final_project\\final_project\\eeCinema.png"));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 365);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel ContentPanel = new JPanel();
		contentPane.add(ContentPanel, BorderLayout.CENTER);
		ContentPanel.setLayout(new BorderLayout(0, 0));
		
		JPanel SubmitRating_panel = new JPanel();
		SubmitRating_panel.setBackground(new Color(255, 98, 98));
		SubmitRating_panel.setBorder(new EmptyBorder(10, 150, 10, 150));
		ContentPanel.add(SubmitRating_panel, BorderLayout.SOUTH);
		SubmitRating_panel.setLayout(new BorderLayout(0, 0));
		
		SubmitRating_button = new JButton("Submit Rating");
		SubmitRating_button.setFont(new Font("굴림", Font.BOLD | Font.ITALIC, 14));
		SubmitRating_panel.add(SubmitRating_button, BorderLayout.CENTER);
		
		JPanel Center_panel = new JPanel();
		ContentPanel.add(Center_panel, BorderLayout.CENTER);
		Center_panel.setLayout(new BorderLayout(0, 0));
		
		JPanel Image_panel = new JPanel();
		Image_panel.setBorder(new EmptyBorder(100, 7, 100, 7));
		Image_panel.setBackground(new Color(255, 98, 98));
		Center_panel.add(Image_panel, BorderLayout.WEST);
		Image_panel.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\final_project\\final_project\\tomato.png"));
		Image_panel.add(lblNewLabel, BorderLayout.CENTER);
		
		JPanel Rating_panel = new JPanel();
		Center_panel.add(Rating_panel, BorderLayout.CENTER);
		Rating_panel.setLayout(new GridLayout(2, 0, 0, 0));
		
		JPanel Movie_panel = new JPanel();
		Rating_panel.add(Movie_panel);
		Movie_panel.setLayout(new BorderLayout(0, 0));
		
		JPanel MovieField_panel = new JPanel();
		MovieField_panel.setBorder(new EmptyBorder(20, 20, 20, 20));
		Movie_panel.add(MovieField_panel, BorderLayout.SOUTH);
		MovieField_panel.setLayout(new GridLayout(1, 0, 0, 0));
		
		JLabel MovieField_label = new JLabel("Movie:");
		MovieField_label.setFont(new Font("굴림", Font.BOLD, 14));
		MovieField_label.setHorizontalAlignment(SwingConstants.CENTER);
		MovieField_panel.add(MovieField_label);
		
		MovieField_comboBox = new JComboBox();
		MovieField_comboBox.setModel(new DefaultComboBoxModel(new String[] {"(empty)", "Toy Story", "Four Rooms", "Casino", "Golden Eye", "Heat"}));
		MovieField_panel.add(MovieField_comboBox);
		
		JPanel Score_panel = new JPanel();
		Rating_panel.add(Score_panel);
		Score_panel.setLayout(new BorderLayout(0, 0));
		
		JPanel ScoreField_panel = new JPanel();
		ScoreField_panel.setBorder(new EmptyBorder(20, 20, 20, 20));
		Score_panel.add(ScoreField_panel, BorderLayout.NORTH);
		ScoreField_panel.setLayout(new GridLayout(1, 0, 0, 0));
		
		JLabel ScoreField_label = new JLabel("Score:");
		ScoreField_label.setFont(new Font("굴림", Font.BOLD, 14));
		ScoreField_label.setHorizontalAlignment(SwingConstants.CENTER);
		ScoreField_panel.add(ScoreField_label);
		
		ScoreField_comboBox = new JComboBox();
		ScoreField_comboBox.setModel(new DefaultComboBoxModel(new String[] {"(empty)", "0.5", "1.0", "1.5", "2.0", "2.5", "3.0", "3.5", "4.0", "4.5", "5.0"}));
		ScoreField_panel.add(ScoreField_comboBox);
	}
	
	public void setListener(ActionListener listener) {
		this.SubmitRating_button.addActionListener(listener);
	}//add action listener to submit button
	
	/* Below are getter-methods */
	public JButton getSumitRatingButton() {
		return this.SubmitRating_button;
	}
	public String getSelectedMovie() {
		return (String)this.MovieField_comboBox.getSelectedItem();
	}
	public String getSelectedScore() {
		return (String)this.ScoreField_comboBox.getSelectedItem();
	}
	/* Finish implementing getter-methods */
}
