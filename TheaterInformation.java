package Main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Color;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;
import java.awt.Toolkit;

public class TheaterInformation extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TheaterInformation frame = new TheaterInformation();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TheaterInformation() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\User\\Desktop\\final_project\\final_project\\eeCinema.png"));
		setTitle("EEC Theaters Information");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 517, 582);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 98, 98));
		panel.add(panel_1, BorderLayout.WEST);
		panel_1.setLayout(new BorderLayout(15, 15));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 98, 98));
		panel_1.add(panel_2, BorderLayout.NORTH);
		panel_2.setLayout(new BoxLayout(panel_2, BoxLayout.Y_AXIS));
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(255, 98, 98));
		panel_2.add(panel_3);
		panel_3.setLayout(new BorderLayout(5, 5));
		
		JLabel lblNewLabel = new JLabel("Original Theater");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 14));
		panel_3.add(lblNewLabel, BorderLayout.WEST);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBackground(new Color(245, 245, 245));
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\final_project\\final_project\\go_smallSize.png"));
		panel_3.add(btnNewButton, BorderLayout.EAST);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(255, 98, 98));
		panel_2.add(panel_4);
		panel_4.setLayout(new BorderLayout(5, 5));
		
		JLabel lblNewLabel_1 = new JLabel("4D Extreme Theater");
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 14));
		panel_4.add(lblNewLabel_1, BorderLayout.WEST);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setBackground(new Color(245, 245, 245));
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\final_project\\final_project\\go_smallSize.png"));
		panel_4.add(btnNewButton_1, BorderLayout.EAST);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(255, 98, 98));
		panel_2.add(panel_5);
		panel_5.setLayout(new BorderLayout(5, 5));
		
		JLabel lblNewLabel_2 = new JLabel("Dolby & IMAX Theater");
		lblNewLabel_2.setFont(new Font("굴림", Font.BOLD, 14));
		panel_5.add(lblNewLabel_2, BorderLayout.WEST);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setBackground(new Color(245, 245, 245));
		btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\final_project\\final_project\\go_smallSize.png"));
		panel_5.add(btnNewButton_2, BorderLayout.EAST);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(255, 98, 98));
		panel_2.add(panel_6);
		panel_6.setLayout(new BorderLayout(5, 5));
		
		JLabel lblNewLabel_3 = new JLabel("Pet Theater");
		lblNewLabel_3.setFont(new Font("굴림", Font.BOLD, 14));
		panel_6.add(lblNewLabel_3, BorderLayout.WEST);
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.setBackground(new Color(245, 245, 245));
		btnNewButton_3.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\final_project\\final_project\\go_smallSize.png"));
		panel_6.add(btnNewButton_3, BorderLayout.EAST);
		
		JTextArea textArea = new JTextArea();
		panel.add(textArea, BorderLayout.CENTER);
	}

}
