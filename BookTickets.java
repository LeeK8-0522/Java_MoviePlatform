package Main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import java.awt.GridLayout;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Dimension;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Component;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class BookTickets extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BookTickets frame = new BookTickets();
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
	public BookTickets() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\User\\Desktop\\final_project\\final_project\\eeCinema.png"));
		setTitle("EEC Book Ticket");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 549, 575);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(5, 5));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new EmptyBorder(10, 190, 10, 190));
		panel_1.setBackground(new Color(255, 98, 98));
		panel.add(panel_1, BorderLayout.SOUTH);
		panel_1.setLayout(new BorderLayout(5, 5));
		
		JButton btnNewButton = new JButton("Book Ticket!");
		btnNewButton.setFont(new Font("굴림", Font.BOLD | Font.ITALIC, 14));
		panel_1.add(btnNewButton, BorderLayout.NORTH);
		
		JPanel panel_2 = new JPanel();
		panel.add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setPreferredSize(new Dimension(180, 0));
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\final_project\\final_project\\theater.jpg"));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lblNewLabel, BorderLayout.WEST);
		
		JPanel panel_3 = new JPanel();
		panel_2.add(panel_3, BorderLayout.CENTER);
		panel_3.setLayout(new BoxLayout(panel_3, BoxLayout.Y_AXIS));
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new EmptyBorder(30, 20, 30, 20));
		panel_3.add(panel_4);
		panel_4.setLayout(new GridLayout(1, 0, 5, 5));
		
		JLabel lblNewLabel_1 = new JLabel("Movie:");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 14));
		panel_4.add(lblNewLabel_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"(empty)", "Toy Story", "Four Rooms", "Casino", "Golden Eye", "Heat"}));
		panel_4.add(comboBox);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new EmptyBorder(30, 20, 30, 20));
		panel_3.add(panel_5);
		panel_5.setLayout(new GridLayout(1, 0, 5, 5));
		
		JLabel lblNewLabel_2 = new JLabel("Theater Type:");
		lblNewLabel_2.setFont(new Font("굴림", Font.BOLD, 14));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_5.add(lblNewLabel_2);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"(empty)", "Original Theater", "4D Extreme Theater", "Dolby & IMAX Theater", "Pet Theater"}));
		panel_5.add(comboBox_1);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new EmptyBorder(30, 20, 30, 20));
		panel_3.add(panel_6);
		panel_6.setLayout(new GridLayout(1, 0, 5, 5));
		
		JLabel lblNewLabel_3 = new JLabel("Choose Date:");
		lblNewLabel_3.setFont(new Font("굴림", Font.BOLD, 14));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_6.add(lblNewLabel_3);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"(empty)", "11/06/2023", "12/06/2023", "13/06/2023", "14/06/2023"}));
		panel_6.add(comboBox_2);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBorder(new EmptyBorder(30, 20, 30, 20));
		panel_3.add(panel_7);
		panel_7.setLayout(new GridLayout(1, 0, 5, 5));
		
		JLabel lblNewLabel_4 = new JLabel("Choose Time:");
		lblNewLabel_4.setFont(new Font("굴림", Font.BOLD, 14));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_7.add(lblNewLabel_4);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"(empty)", "08:00", "12:00", "16:00", "20:00"}));
		panel_7.add(comboBox_3);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBorder(new EmptyBorder(30, 20, 30, 20));
		panel_3.add(panel_8);
		panel_8.setLayout(new GridLayout(1, 0, 5, 5));
		
		JLabel lblNewLabel_5 = new JLabel("Adult:");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_5.setFont(new Font("굴림", Font.BOLD, 14));
		panel_8.add(lblNewLabel_5);
		
		textField = new JTextField();
		panel_8.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Senoir:");
		lblNewLabel_6.setFont(new Font("굴림", Font.BOLD, 14));
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_8.add(lblNewLabel_6);
		
		textField_1 = new JTextField();
		panel_8.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Child:");
		lblNewLabel_7.setFont(new Font("굴림", Font.BOLD, 14));
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_8.add(lblNewLabel_7);
		
		textField_2 = new JTextField();
		panel_8.add(textField_2);
		textField_2.setColumns(10);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBorder(new EmptyBorder(30, 20, 30, 20));
		panel_3.add(panel_9);
		panel_9.setLayout(new GridLayout(1, 0, 5, 5));
		
		JLabel lblNewLabel_8 = new JLabel("Apply Coupon:");
		lblNewLabel_8.setFont(new Font("굴림", Font.BOLD, 14));
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_9.add(lblNewLabel_8);
		
		textField_3 = new JTextField();
		panel_9.add(textField_3);
		textField_3.setColumns(10);
	}

}
