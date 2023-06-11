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
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.awt.CardLayout;

public class BookTicketsView extends JFrame {

	private JPanel contentPane;
	private JTextField Adult_textField;
	private JTextField Senior_textField;
	private JTextField Child_textField;
	private JTextField CouponApply_textField;
	private JComboBox MovieSelection_comboBox;
	private JComboBox TheaterTypeSelection_comboBox;
	private JComboBox DateSelection_comboBox;
	private JComboBox TimeSelection_comboBox;
	private JButton BookTicket_button;
	private JTextField PointsApply_textFeild;

	/**
	 * Create the frame.
	 */
	public BookTicketsView() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\User\\Desktop\\final_project\\final_project\\eeCinema.png"));
		setTitle("EEC Book Ticket");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 549, 651);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(5, 5));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new BorderLayout(0, 0));
		
		JPanel South_panel = new JPanel();
		South_panel.setBorder(new EmptyBorder(10, 190, 10, 190));
		South_panel.setBackground(new Color(255, 98, 98));
		panel.add(South_panel, BorderLayout.SOUTH);
		South_panel.setLayout(new BorderLayout(5, 5));
		
		BookTicket_button = new JButton("Book Ticket!");
		BookTicket_button.setFont(new Font("굴림", Font.BOLD | Font.ITALIC, 14));
		South_panel.add(BookTicket_button, BorderLayout.NORTH);
		
		JPanel Center_panel = new JPanel();
		panel.add(Center_panel, BorderLayout.CENTER);
		Center_panel.setLayout(new BorderLayout(0, 0));
		
		JLabel Image_label = new JLabel("");
		Image_label.setPreferredSize(new Dimension(180, 0));
		Image_label.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\final_project\\final_project\\theater.jpg"));
		Image_label.setHorizontalAlignment(SwingConstants.CENTER);
		Center_panel.add(Image_label, BorderLayout.WEST);
		
		JPanel Selection_panel = new JPanel();
		Center_panel.add(Selection_panel, BorderLayout.CENTER);
		Selection_panel.setLayout(new BoxLayout(Selection_panel, BoxLayout.Y_AXIS));
		
		JPanel MovieSelection_panel = new JPanel();
		MovieSelection_panel.setBorder(new EmptyBorder(30, 20, 30, 20));
		Selection_panel.add(MovieSelection_panel);
		MovieSelection_panel.setLayout(new GridLayout(1, 0, 5, 5));
		
		JLabel MovieSelection_label = new JLabel("Movie:");
		MovieSelection_label.setHorizontalAlignment(SwingConstants.RIGHT);
		MovieSelection_label.setFont(new Font("굴림", Font.BOLD, 14));
		MovieSelection_panel.add(MovieSelection_label);
		
		MovieSelection_comboBox = new JComboBox();
		MovieSelection_comboBox.setModel(new DefaultComboBoxModel(new String[] {"(empty)", "Toy Story", "Four Rooms", "Casino", "Golden Eye", "Heat"}));
		MovieSelection_panel.add(MovieSelection_comboBox);
		
		JPanel TheaterTypeSelection_panel = new JPanel();
		TheaterTypeSelection_panel.setBorder(new EmptyBorder(30, 20, 30, 20));
		Selection_panel.add(TheaterTypeSelection_panel);
		TheaterTypeSelection_panel.setLayout(new GridLayout(1, 0, 5, 5));
		
		JLabel TheaterTypeSelection_label = new JLabel("Theater Type:");
		TheaterTypeSelection_label.setFont(new Font("굴림", Font.BOLD, 14));
		TheaterTypeSelection_label.setHorizontalAlignment(SwingConstants.RIGHT);
		TheaterTypeSelection_panel.add(TheaterTypeSelection_label);
		
		TheaterTypeSelection_comboBox = new JComboBox();
		TheaterTypeSelection_comboBox.setModel(new DefaultComboBoxModel(new String[] {"(empty)", "Original Theater", "4D Extreme Theater", "Dolby & IMAX Theater", "Pet Theater"}));
		TheaterTypeSelection_panel.add(TheaterTypeSelection_comboBox);
		
		JPanel DateSelection_panel = new JPanel();
		DateSelection_panel.setBorder(new EmptyBorder(30, 20, 30, 20));
		Selection_panel.add(DateSelection_panel);
		DateSelection_panel.setLayout(new GridLayout(1, 0, 5, 5));
		
		JLabel DateSelection_label = new JLabel("Choose Date:");
		DateSelection_label.setFont(new Font("굴림", Font.BOLD, 14));
		DateSelection_label.setHorizontalAlignment(SwingConstants.RIGHT);
		DateSelection_panel.add(DateSelection_label);
		
		DateSelection_comboBox = new JComboBox();
		DateSelection_comboBox.setModel(new DefaultComboBoxModel(new String[] {"(empty)", "11/06/2023", "12/06/2023", "13/06/2023", "14/06/2023"}));
		DateSelection_panel.add(DateSelection_comboBox);
		
		JPanel TimeSelection_panel = new JPanel();
		TimeSelection_panel.setBorder(new EmptyBorder(30, 20, 30, 20));
		Selection_panel.add(TimeSelection_panel);
		TimeSelection_panel.setLayout(new GridLayout(1, 0, 5, 5));
		
		JLabel TiemSelection_label = new JLabel("Choose Time:");
		TiemSelection_label.setFont(new Font("굴림", Font.BOLD, 14));
		TiemSelection_label.setHorizontalAlignment(SwingConstants.RIGHT);
		TimeSelection_panel.add(TiemSelection_label);
		
		TimeSelection_comboBox = new JComboBox();
		TimeSelection_comboBox.setModel(new DefaultComboBoxModel(new String[] {"(empty)", "08:00", "12:00", "16:00", "20:00"}));
		TimeSelection_panel.add(TimeSelection_comboBox);
		
		JPanel PersonSelection_panel = new JPanel();
		PersonSelection_panel.setBorder(new EmptyBorder(30, 20, 30, 20));
		Selection_panel.add(PersonSelection_panel);
		PersonSelection_panel.setLayout(new GridLayout(1, 0, 5, 5));
		
		JLabel Adult_label = new JLabel("Adult:");
		Adult_label.setHorizontalAlignment(SwingConstants.RIGHT);
		Adult_label.setFont(new Font("굴림", Font.BOLD, 14));
		PersonSelection_panel.add(Adult_label);
		
		Adult_textField = new JTextField();
		PersonSelection_panel.add(Adult_textField);
		Adult_textField.setColumns(10);
		
		JLabel Senior_label = new JLabel("Senoir:");
		Senior_label.setFont(new Font("굴림", Font.BOLD, 14));
		Senior_label.setHorizontalAlignment(SwingConstants.RIGHT);
		PersonSelection_panel.add(Senior_label);
		
		Senior_textField = new JTextField();
		PersonSelection_panel.add(Senior_textField);
		Senior_textField.setColumns(10);
		
		JLabel Child_label = new JLabel("Child:");
		Child_label.setFont(new Font("굴림", Font.BOLD, 14));
		Child_label.setHorizontalAlignment(SwingConstants.RIGHT); 
		PersonSelection_panel.add(Child_label);
		
		Child_textField = new JTextField();
		PersonSelection_panel.add(Child_textField);
		Child_textField.setColumns(10);
		
		JPanel CouponApply_panel = new JPanel();
		CouponApply_panel.setBorder(new EmptyBorder(30, 20, 30, 20));
		Selection_panel.add(CouponApply_panel);
		CouponApply_panel.setLayout(new GridLayout(1, 0, 5, 5));
		
		JLabel CouponApply_label = new JLabel("Apply Coupon:");
		CouponApply_label.setFont(new Font("굴림", Font.BOLD, 14));
		CouponApply_label.setHorizontalAlignment(SwingConstants.RIGHT);
		CouponApply_panel.add(CouponApply_label);
		
		CouponApply_textField = new JTextField();
		CouponApply_panel.add(CouponApply_textField);
		CouponApply_textField.setColumns(10);
		
		JPanel PointsApply_panel = new JPanel();
		PointsApply_panel.setBorder(new EmptyBorder(30, 20, 30, 20));
		Selection_panel.add(PointsApply_panel);
		PointsApply_panel.setLayout(new GridLayout(1, 0, 5, 5));
		
		JLabel PointsApply_label = new JLabel("Use Points:");
		PointsApply_label.setHorizontalAlignment(SwingConstants.RIGHT);
		PointsApply_label.setFont(new Font("굴림", Font.BOLD, 14));
		PointsApply_panel.add(PointsApply_label);
		
		PointsApply_textFeild = new JTextField();
		PointsApply_panel.add(PointsApply_textFeild);
		PointsApply_textFeild.setColumns(10);
	}
	
	public void setListener(ActionListener actionListener) {
		BookTicket_button.addActionListener(actionListener);
	}//add action listener to BookTicket button
	
	/* Below are getter-methods */
	public JButton getBookTicketButton() {
		return this.BookTicket_button;
	}
	
	public String getMovieTitle() {
		return this.MovieSelection_comboBox.getSelectedItem().toString();
	}
	
	public String getTheaterType() {
		return this.TheaterTypeSelection_comboBox.getSelectedItem().toString();
	}
	
	public String getSelectedDate() {
		return this.DateSelection_comboBox.getSelectedItem().toString();
	}
	
	public String getSelectedTime() {
		return this.TimeSelection_comboBox.getSelectedItem().toString();
	}
	
	public String getNumebrOfAdult() {
		return this.Adult_textField.getText();
	}
	
	public String getNumberOfSenior() {
		return this.Senior_textField.getText();
	}
	
	public String getNumberOfChild() {
		return this.Child_textField.getText();
	}
	
	public String getAppliedCoupons() {
		return this.CouponApply_textField.getText();
	}
	
	public String getUsedPoints() {
		return this.PointsApply_textFeild.getText();
	}
	/* Finish implementing getter-methods */
	
	
}
