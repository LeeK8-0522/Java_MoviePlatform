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
import java.awt.event.ActionListener;

public class TheaterInformationView extends JFrame {

	/* Below are fields */
	private JPanel contentPane;
	private JButton Pet_button;
	private JButton DolbyIMAX_button;
	private JButton Extreme4D_button;
	private JButton Original_button;
	private JTextArea TheaterTypeExplanation_textArea;
	/* Finish implementing fields */

	/**
	 * Create the frame.
	 */
	public TheaterInformationView() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\User\\Desktop\\final_project\\final_project\\eeCinema.png"));
		setTitle("EEC Theaters Information");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 517, 582);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new BorderLayout(0, 0));
		
		JPanel West_panel = new JPanel();
		West_panel.setBackground(new Color(255, 98, 98));
		panel.add(West_panel, BorderLayout.WEST);
		West_panel.setLayout(new BorderLayout(15, 15));
		
		JPanel TheaterType_panel = new JPanel();
		TheaterType_panel.setBackground(new Color(255, 98, 98));
		West_panel.add(TheaterType_panel, BorderLayout.NORTH);
		TheaterType_panel.setLayout(new BoxLayout(TheaterType_panel, BoxLayout.Y_AXIS));
		
		JPanel Original_panel = new JPanel();
		Original_panel.setBackground(new Color(255, 98, 98));
		TheaterType_panel.add(Original_panel);
		Original_panel.setLayout(new BorderLayout(5, 5));
		
		JLabel Original_label = new JLabel("Original Theater");
		Original_label.setFont(new Font("굴림", Font.BOLD, 14));
		Original_panel.add(Original_label, BorderLayout.WEST);
		
		Original_button = new JButton("");
		Original_button.setBackground(new Color(245, 245, 245));
		Original_button.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\final_project\\final_project\\go_smallSize.png"));
		Original_panel.add(Original_button, BorderLayout.EAST);
		
		JPanel Extreme4D_panel = new JPanel();
		Extreme4D_panel.setBackground(new Color(255, 98, 98));
		TheaterType_panel.add(Extreme4D_panel);
		Extreme4D_panel.setLayout(new BorderLayout(5, 5));
		
		JLabel Extreme4D_label = new JLabel("4D Extreme Theater");
		Extreme4D_label.setFont(new Font("굴림", Font.BOLD, 14));
		Extreme4D_panel.add(Extreme4D_label, BorderLayout.WEST);
		
		Extreme4D_button = new JButton("");
		Extreme4D_button.setBackground(new Color(245, 245, 245));
		Extreme4D_button.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\final_project\\final_project\\go_smallSize.png"));
		Extreme4D_panel.add(Extreme4D_button, BorderLayout.EAST);
		
		JPanel DolbyIMAX_panel = new JPanel();
		DolbyIMAX_panel.setBackground(new Color(255, 98, 98));
		TheaterType_panel.add(DolbyIMAX_panel);
		DolbyIMAX_panel.setLayout(new BorderLayout(5, 5));
		
		JLabel DolbyIMAX_label = new JLabel("Dolby & IMAX Theater");
		DolbyIMAX_label.setFont(new Font("굴림", Font.BOLD, 14));
		DolbyIMAX_panel.add(DolbyIMAX_label, BorderLayout.WEST);
		
		DolbyIMAX_button = new JButton("");
		DolbyIMAX_button.setBackground(new Color(245, 245, 245));
		DolbyIMAX_button.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\final_project\\final_project\\go_smallSize.png"));
		DolbyIMAX_panel.add(DolbyIMAX_button, BorderLayout.EAST);
		
		JPanel Pet_panel = new JPanel();
		Pet_panel.setBackground(new Color(255, 98, 98));
		TheaterType_panel.add(Pet_panel);
		Pet_panel.setLayout(new BorderLayout(5, 5));
		
		JLabel Pet_label = new JLabel("Pet Theater");
		Pet_label.setFont(new Font("굴림", Font.BOLD, 14));
		Pet_panel.add(Pet_label, BorderLayout.WEST);
		
		Pet_button = new JButton("");
		Pet_button.setBackground(new Color(245, 245, 245));
		Pet_button.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\final_project\\final_project\\go_smallSize.png"));
		Pet_panel.add(Pet_button, BorderLayout.EAST);
		
		TheaterTypeExplanation_textArea = new JTextArea();
		panel.add(TheaterTypeExplanation_textArea, BorderLayout.CENTER);
	}
	
	public void setListener(ActionListener listener) {
		Original_button.addActionListener(listener);
		Extreme4D_button.addActionListener(listener);
		DolbyIMAX_button.addActionListener(listener);
		Pet_button.addActionListener(listener);
	}//add action listener to each button
	
	/* Below are getter-methods */
	public JButton getOriginalButton() {
		return this.Original_button;
	}
	public JButton getExtreme4DButton() {
		return this.Extreme4D_button;
	}
	public JButton getDolbyIMAXButton() {
		return this.DolbyIMAX_button;
	}
	public JButton getPetButton() {
		return this.Pet_button;
	}
	/* Finish implementing getter-methods */
	
	public void setExpanationTextArea(String input) {
		TheaterTypeExplanation_textArea.setText(input);
	}//setter method for Theater Type explanation text area

}
