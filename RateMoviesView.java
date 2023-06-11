package Main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
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

	/**
	 * Create the frame.
	 */
	public RateMoviesView() {
		setTitle("EEC Rate Movies");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\User\\Desktop\\final_project\\final_project\\eeCinema.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 365);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 98, 98));
		panel_1.setBorder(new EmptyBorder(10, 150, 10, 150));
		panel.add(panel_1, BorderLayout.SOUTH);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JButton btnNewButton = new JButton("Submit Rating");
		btnNewButton.setFont(new Font("굴림", Font.BOLD | Font.ITALIC, 14));
		panel_1.add(btnNewButton, BorderLayout.CENTER);
		
		JPanel panel_2 = new JPanel();
		panel.add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new EmptyBorder(100, 7, 100, 7));
		panel_3.setBackground(new Color(255, 98, 98));
		panel_2.add(panel_3, BorderLayout.WEST);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\final_project\\final_project\\tomato.png"));
		panel_3.add(lblNewLabel, BorderLayout.CENTER);
		
		JPanel panel_4 = new JPanel();
		panel_2.add(panel_4, BorderLayout.CENTER);
		panel_4.setLayout(new GridLayout(2, 0, 0, 0));
		
		JPanel panel_5 = new JPanel();
		panel_4.add(panel_5);
		panel_5.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_7 = new JPanel();
		panel_7.setBorder(new EmptyBorder(20, 20, 20, 20));
		panel_5.add(panel_7, BorderLayout.SOUTH);
		panel_7.setLayout(new GridLayout(1, 0, 0, 0));
		
		JLabel lblNewLabel_1 = new JLabel("Movie:");
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 14));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel_7.add(lblNewLabel_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"(empty)", "Toy Story", "Four Rooms", "Casino", "Golden Eye", "Heat"}));
		panel_7.add(comboBox);
		
		JPanel panel_6 = new JPanel();
		panel_4.add(panel_6);
		panel_6.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_8 = new JPanel();
		panel_8.setBorder(new EmptyBorder(20, 20, 20, 20));
		panel_6.add(panel_8, BorderLayout.NORTH);
		panel_8.setLayout(new GridLayout(1, 0, 0, 0));
		
		JLabel lblNewLabel_2 = new JLabel("Score:");
		lblNewLabel_2.setFont(new Font("굴림", Font.BOLD, 14));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		panel_8.add(lblNewLabel_2);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"(empty)", "0.5", "1.0", "1.5", "2.0", "2.5", "3.0", "3.5", "4.0", "4.5", "5.0"}));
		panel_8.add(comboBox_1);
	}

}
