package Main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Dimension;
import javax.swing.BoxLayout;
import java.awt.CardLayout;
import java.awt.GridLayout;
import javax.swing.JComboBox;
import javax.swing.JPasswordField;
import java.awt.Toolkit;
import javax.swing.DefaultComboBoxModel;

public class PersonalizedScorePredictionView extends JFrame {

	private JPanel contentPane;


	/**
	 * Create the frame.
	 */
	public PersonalizedScorePredictionView() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\User\\Desktop\\final_project\\final_project\\eeCinema.png"));
		setTitle("EEC Score Prediction");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 373);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBorder(new EmptyBorder(0, 0, 0, 0));
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 98, 98));
		panel_1.setBorder(new EmptyBorder(20, 150, 20, 150));
		panel.add(panel_1, BorderLayout.SOUTH);
		panel_1.setLayout(new BorderLayout(5, 5));
		
		JButton btnNewButton = new JButton("Get Score Prediction!");
		btnNewButton.setFont(new Font("굴림", Font.BOLD | Font.ITALIC, 14));
		panel_1.add(btnNewButton, BorderLayout.CENTER);
		
		JPanel panel_2 = new JPanel();
		panel.add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setPreferredSize(new Dimension(170, 0));
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\final_project\\final_project\\ai.jpg"));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lblNewLabel, BorderLayout.WEST);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new EmptyBorder(200, 20, 200, 20));
		panel_2.add(panel_3, BorderLayout.CENTER);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Select Movie:");
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 14));
		lblNewLabel_1.setBounds(40, 124, 103, 15);
		panel_3.add(lblNewLabel_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"(empty)", "Toy Story", "Four Rooms", "Casino", "Golden Eye", "Heat"}));
		comboBox.setBounds(141, 120, 125, 23);
		panel_3.add(comboBox);
	}
}
