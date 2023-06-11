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
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;

public class PersonalizedScorePredictionView extends JFrame {

	private JPanel contentPane;
	private JComboBox SelectMovie_comboBox;
	private JButton GetPrediction_button;

	/**
	 * Create the frame.
	 */
	public PersonalizedScorePredictionView() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\User\\Desktop\\final_project\\final_project\\eeCinema.png"));
		setTitle("EEC Score Prediction");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 500, 373);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel ContentPanel = new JPanel();
		ContentPanel.setBorder(new EmptyBorder(0, 0, 0, 0));
		contentPane.add(ContentPanel, BorderLayout.CENTER);
		ContentPanel.setLayout(new BorderLayout(0, 0));
		
		JPanel South_panel = new JPanel();
		South_panel.setBackground(new Color(255, 98, 98));
		South_panel.setBorder(new EmptyBorder(20, 150, 20, 150));
		ContentPanel.add(South_panel, BorderLayout.SOUTH);
		South_panel.setLayout(new BorderLayout(5, 5));
		
		GetPrediction_button = new JButton("Get Score Prediction!");
		GetPrediction_button.setFont(new Font("굴림", Font.BOLD | Font.ITALIC, 14));
		South_panel.add(GetPrediction_button, BorderLayout.CENTER);
		
		JPanel Center_panel = new JPanel();
		ContentPanel.add(Center_panel, BorderLayout.CENTER);
		Center_panel.setLayout(new BorderLayout(0, 0));
		
		JLabel image_label = new JLabel("");
		image_label.setPreferredSize(new Dimension(170, 0));
		image_label.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\final_project\\final_project\\ai.jpg"));
		image_label.setHorizontalAlignment(SwingConstants.CENTER);
		Center_panel.add(image_label, BorderLayout.WEST);
		
		JPanel SelectMovie_panel = new JPanel();
		SelectMovie_panel.setBorder(new EmptyBorder(200, 20, 200, 20));
		Center_panel.add(SelectMovie_panel, BorderLayout.CENTER);
		SelectMovie_panel.setLayout(null);
		
		JLabel SelectMovie_label = new JLabel("Select Movie:");
		SelectMovie_label.setFont(new Font("굴림", Font.BOLD, 14));
		SelectMovie_label.setBounds(40, 124, 103, 15);
		SelectMovie_panel.add(SelectMovie_label);
		
		SelectMovie_comboBox = new JComboBox();
		SelectMovie_comboBox.setModel(new DefaultComboBoxModel(new String[] {"(empty)", "Toy Story", "Four Rooms", "Casino", "Golden Eye", "Heat"}));
		SelectMovie_comboBox.setBounds(141, 120, 125, 23);
		SelectMovie_panel.add(SelectMovie_comboBox);
	}
	
	public void setListener(ActionListener listener) {
		this.GetPrediction_button.addActionListener(listener);
	}//add action listener to Get-Prediction button
	
	/* Below are getter-methods */
	public JButton getPredictionButton() {
		return this.GetPrediction_button;
	}
	
	public String getSelectedMovie() {
		return (String)this.SelectMovie_comboBox.getSelectedItem();
	}
	/* Finish implementing getter-methods */
}
