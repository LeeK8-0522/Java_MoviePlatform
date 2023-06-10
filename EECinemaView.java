package Main;

import java.awt.EventQueue;
import java.net.URL;

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

public class EECinemaView {

	private JFrame EECinema_frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EECinemaView window = new EECinemaView();
					window.EECinema_frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public EECinemaView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		EECinema_frame = new JFrame();
		EECinema_frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\User\\Desktop\\final_project\\final_project\\eeCinema.png"));
		EECinema_frame.setTitle("EECinema");
		EECinema_frame.setBounds(100, 100, 561, 608);
		EECinema_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		EECinema_frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		EECinema_frame.getContentPane().add(panel, BorderLayout.NORTH);
		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
		
		JPanel panel_1 = new JPanel();
		panel_1.setPreferredSize(new Dimension(10, 70));
		panel_1.setBackground(new Color(255, 98, 98));
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, 0, 86, 70);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\final_project\\final_project\\film.png"));
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("EECinema");
		lblNewLabel_1.setBounds(91, 0, 443, 70);
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD | Font.ITALIC, 22));
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("offer Extreme Experience");
		lblNewLabel_2.setFont(new Font("굴림", Font.PLAIN, 11));
		lblNewLabel_2.setBounds(91, 45, 158, 15);
		panel_1.add(lblNewLabel_2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 98, 98));
		panel.add(panel_2);
		panel_2.setLayout(new GridLayout(2, 0, 0, 0));
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(255, 98, 98));
		panel_2.add(panel_3);
		panel_3.setLayout(new BoxLayout(panel_3, BoxLayout.X_AXIS));
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(255, 98, 98));
		panel_3.add(panel_5);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(255, 98, 98));
		panel_3.add(panel_6);
		panel_6.setLayout(new BoxLayout(panel_6, BoxLayout.X_AXIS));
		
		JButton btnNewButton = new JButton("Log Out");
		btnNewButton.setFont(new Font("굴림", Font.PLAIN, 12));
		panel_6.add(btnNewButton);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(255, 98, 98));
		panel_2.add(panel_4);
		panel_4.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_3 = new JLabel("Hello~! (NAME)");
		lblNewLabel_3.setFont(new Font("굴림", Font.BOLD, 11));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		panel_4.add(lblNewLabel_3, BorderLayout.SOUTH);
		
		JPanel panel_7 = new JPanel();
		EECinema_frame.getContentPane().add(panel_7, BorderLayout.CENTER);
		GridBagLayout gbl_panel_7 = new GridBagLayout();
		gbl_panel_7.columnWidths = new int[]{0, 0};
		gbl_panel_7.rowHeights = new int[]{0, 0, 0, 0};
		gbl_panel_7.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panel_7.rowWeights = new double[]{1.0, 1.0, 1.0, Double.MIN_VALUE};
		panel_7.setLayout(gbl_panel_7);
		
		JPanel panel_11 = new JPanel();
		panel_11.setLayout(null);
		GridBagConstraints gbc_panel_11 = new GridBagConstraints();
		gbc_panel_11.insets = new Insets(0, 0, 5, 0);
		gbc_panel_11.weighty = 1.0;
		gbc_panel_11.fill = GridBagConstraints.BOTH;
		gbc_panel_11.gridx = 0;
		gbc_panel_11.gridy = 0;
		panel_7.add(panel_11, gbc_panel_11);
		
		JLabel lblNewLabel_6 = new JLabel("Top Box Office");
		lblNewLabel_6.setBounds(12, 0, 157, 43);
		lblNewLabel_6.setFont(new Font("돋움체", Font.BOLD | Font.ITALIC, 14));
		panel_11.add(lblNewLabel_6);
		
		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.insets = new Insets(0, 0, 5, 0);
		gbc_scrollPane.weighty = 6.0;
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 0;
		gbc_scrollPane.gridy = 1;
		panel_7.add(scrollPane, gbc_scrollPane);
		
		JPanel panel_12 = new JPanel();
		scrollPane.setViewportView(panel_12);
		panel_12.setLayout(new BoxLayout(panel_12, BoxLayout.X_AXIS));
		
		JPanel panel_13 = new JPanel();
		panel_12.add(panel_13);
		panel_13.setLayout(new BorderLayout(5, 5));
		
		JLabel lblNewLabel_7 = new JLabel("Toy Story");
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setFont(new Font("굴림", Font.BOLD, 12));
		panel_13.add(lblNewLabel_7, BorderLayout.NORTH);
		
		JLabel lblNewLabel_8 = new JLabel("Score:");
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_8.setFont(new Font("굴림", Font.BOLD, 12));
		panel_13.add(lblNewLabel_8, BorderLayout.SOUTH);
		
		JLabel lblNewLabel_9 = new JLabel("");
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_9.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\final_project\\final_project\\ToyStory.jpg"));
		panel_13.add(lblNewLabel_9, BorderLayout.CENTER);
		
		JPanel panel_14 = new JPanel();
		panel_12.add(panel_14);
		panel_14.setLayout(new BorderLayout(5, 5));
		
		JLabel lblNewLabel_10 = new JLabel("Four Rooms");
		lblNewLabel_10.setFont(new Font("굴림", Font.BOLD, 12));
		lblNewLabel_10.setHorizontalAlignment(SwingConstants.CENTER);
		panel_14.add(lblNewLabel_10, BorderLayout.NORTH);
		
		JLabel lblNewLabel_11 = new JLabel("");
		lblNewLabel_11.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\final_project\\final_project\\FourRooms.jpg"));
		lblNewLabel_11.setHorizontalAlignment(SwingConstants.CENTER);
		panel_14.add(lblNewLabel_11, BorderLayout.CENTER);
		
		JLabel lblNewLabel_12 = new JLabel("Score:");
		lblNewLabel_12.setFont(new Font("굴림", Font.BOLD, 12));
		lblNewLabel_12.setHorizontalAlignment(SwingConstants.CENTER);
		panel_14.add(lblNewLabel_12, BorderLayout.SOUTH);
		
		JPanel panel_15 = new JPanel();
		panel_12.add(panel_15);
		panel_15.setLayout(new BorderLayout(5, 5));
		
		JLabel lblNewLabel_13 = new JLabel("Casino");
		lblNewLabel_13.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_13.setFont(new Font("굴림", Font.BOLD, 12));
		panel_15.add(lblNewLabel_13, BorderLayout.NORTH);
		
		JLabel lblNewLabel_14 = new JLabel("");
		lblNewLabel_14.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\final_project\\final_project\\Casino.jpg"));
		lblNewLabel_14.setHorizontalAlignment(SwingConstants.CENTER);
		panel_15.add(lblNewLabel_14, BorderLayout.CENTER);
		
		JLabel lblNewLabel_15 = new JLabel("Score:");
		lblNewLabel_15.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_15.setFont(new Font("굴림", Font.BOLD, 12));
		panel_15.add(lblNewLabel_15, BorderLayout.SOUTH);
		
		JPanel panel_16 = new JPanel();
		panel_12.add(panel_16);
		panel_16.setLayout(new BorderLayout(5, 5));
		
		JLabel lblNewLabel_16 = new JLabel("Golden Eye");
		lblNewLabel_16.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_16.setFont(new Font("굴림", Font.BOLD, 12));
		panel_16.add(lblNewLabel_16, BorderLayout.NORTH);
		
		JLabel lblNewLabel_17 = new JLabel("Score:");
		lblNewLabel_17.setFont(new Font("굴림", Font.BOLD, 12));
		lblNewLabel_17.setHorizontalAlignment(SwingConstants.CENTER);
		panel_16.add(lblNewLabel_17, BorderLayout.SOUTH);
		
		JLabel lblNewLabel_18 = new JLabel("");
		lblNewLabel_18.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_18.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\final_project\\final_project\\GoldenEye.jpg"));
		panel_16.add(lblNewLabel_18, BorderLayout.CENTER);
		
		JPanel panel_17 = new JPanel();
		panel_12.add(panel_17);
		panel_17.setLayout(new BorderLayout(5, 5));
		
		JLabel lblNewLabel_19 = new JLabel("Heat");
		lblNewLabel_19.setFont(new Font("굴림", Font.BOLD, 12));
		lblNewLabel_19.setHorizontalAlignment(SwingConstants.CENTER);
		panel_17.add(lblNewLabel_19, BorderLayout.NORTH);
		
		JLabel lblNewLabel_20 = new JLabel("");
		lblNewLabel_20.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\final_project\\final_project\\Heat.jpg"));
		lblNewLabel_20.setHorizontalAlignment(SwingConstants.CENTER);
		panel_17.add(lblNewLabel_20, BorderLayout.CENTER);
		
		JLabel lblNewLabel_21 = new JLabel("Score:");
		lblNewLabel_21.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_21.setFont(new Font("굴림", Font.BOLD, 12));
		panel_17.add(lblNewLabel_21, BorderLayout.SOUTH);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		GridBagConstraints gbc_scrollPane_1 = new GridBagConstraints();
		gbc_scrollPane_1.weighty = 9.0;
		gbc_scrollPane_1.fill = GridBagConstraints.BOTH;
		gbc_scrollPane_1.gridx = 0;
		gbc_scrollPane_1.gridy = 2;
		panel_7.add(scrollPane_1, gbc_scrollPane_1);
		
		JPanel panel_21 = new JPanel();
		scrollPane_1.setViewportView(panel_21);
		panel_21.setLayout(new BoxLayout(panel_21, BoxLayout.X_AXIS));
		
		JPanel panel_22 = new JPanel();
		panel_21.add(panel_22);
		GridBagLayout gbl_panel_22 = new GridBagLayout();
		gbl_panel_22.columnWidths = new int[]{0, 0};
		gbl_panel_22.rowHeights = new int[]{0, 0, 0, 0};
		gbl_panel_22.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panel_22.rowWeights = new double[]{1.0, 1.0, 1.0, Double.MIN_VALUE};
		panel_22.setLayout(gbl_panel_22);
		
		JPanel panel_26 = new JPanel();
		GridBagConstraints gbc_panel_26 = new GridBagConstraints();
		gbc_panel_26.weighty = 1.0;
		gbc_panel_26.fill = GridBagConstraints.BOTH;
		gbc_panel_26.gridx = 0;
		gbc_panel_26.gridy = 0;
		panel_22.add(panel_26, gbc_panel_26);
		
		JPanel panel_27 = new JPanel();
		GridBagConstraints gbc_panel_27 = new GridBagConstraints();
		gbc_panel_27.weighty = 6.0;
		gbc_panel_27.fill = GridBagConstraints.BOTH;
		gbc_panel_27.gridx = 0;
		gbc_panel_27.gridy = 1;
		panel_22.add(panel_27, gbc_panel_27);
		panel_27.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_26 = new JLabel("Book Tickets");
		lblNewLabel_26.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_26.setFont(new Font("굴림", Font.BOLD, 16));
		panel_27.add(lblNewLabel_26, BorderLayout.CENTER);
		
		JLabel lblNewLabel_30 = new JLabel("");
		lblNewLabel_30.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\final_project\\final_project\\ticket.png"));
		lblNewLabel_30.setHorizontalAlignment(SwingConstants.CENTER);
		panel_27.add(lblNewLabel_30, BorderLayout.SOUTH);
		
		JPanel panel_28 = new JPanel();
		GridBagConstraints gbc_panel_28 = new GridBagConstraints();
		gbc_panel_28.weighty = 3.0;
		gbc_panel_28.fill = GridBagConstraints.BOTH;
		gbc_panel_28.gridx = 0;
		gbc_panel_28.gridy = 2;
		panel_22.add(panel_28, gbc_panel_28);
		GridBagLayout gbl_panel_28 = new GridBagLayout();
		gbl_panel_28.columnWidths = new int[]{0, 0};
		gbl_panel_28.rowHeights = new int[]{0, 0, 0, 0};
		gbl_panel_28.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panel_28.rowWeights = new double[]{1.0, 0.0, 1.0, Double.MIN_VALUE};
		panel_28.setLayout(gbl_panel_28);
		
		JPanel panel_38 = new JPanel();
		GridBagConstraints gbc_panel_38 = new GridBagConstraints();
		gbc_panel_38.weighty = 1.0;
		gbc_panel_38.fill = GridBagConstraints.BOTH;
		gbc_panel_38.gridx = 0;
		gbc_panel_38.gridy = 0;
		panel_28.add(panel_38, gbc_panel_38);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setBackground(new Color(245, 245, 245));
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\final_project\\final_project\\go-removebg-preview (1).png"));
		GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
		gbc_btnNewButton_1.weighty = 3.0;
		gbc_btnNewButton_1.gridx = 0;
		gbc_btnNewButton_1.gridy = 1;
		panel_28.add(btnNewButton_1, gbc_btnNewButton_1);
		
		JPanel panel_39 = new JPanel();
		GridBagConstraints gbc_panel_39 = new GridBagConstraints();
		gbc_panel_39.weighty = 1.0;
		gbc_panel_39.fill = GridBagConstraints.BOTH;
		gbc_panel_39.gridx = 0;
		gbc_panel_39.gridy = 2;
		panel_28.add(panel_39, gbc_panel_39);
		
		JPanel panel_23 = new JPanel();
		panel_21.add(panel_23);
		GridBagLayout gbl_panel_23 = new GridBagLayout();
		gbl_panel_23.columnWidths = new int[]{0, 0};
		gbl_panel_23.rowHeights = new int[]{0, 0, 0, 0};
		gbl_panel_23.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panel_23.rowWeights = new double[]{1.0, 1.0, 1.0, Double.MIN_VALUE};
		panel_23.setLayout(gbl_panel_23);
		
		JPanel panel_29 = new JPanel();
		GridBagConstraints gbc_panel_29 = new GridBagConstraints();
		gbc_panel_29.weighty = 1.0;
		gbc_panel_29.fill = GridBagConstraints.BOTH;
		gbc_panel_29.gridx = 0;
		gbc_panel_29.gridy = 0;
		panel_23.add(panel_29, gbc_panel_29);
		
		JPanel panel_30 = new JPanel();
		GridBagConstraints gbc_panel_30 = new GridBagConstraints();
		gbc_panel_30.weighty = 6.0;
		gbc_panel_30.fill = GridBagConstraints.BOTH;
		gbc_panel_30.gridx = 0;
		gbc_panel_30.gridy = 1;
		panel_23.add(panel_30, gbc_panel_30);
		panel_30.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_27 = new JLabel("Theaters Information");
		lblNewLabel_27.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_27.setFont(new Font("굴림", Font.BOLD, 16));
		panel_30.add(lblNewLabel_27, BorderLayout.CENTER);
		
		JLabel lblNewLabel_31 = new JLabel("");
		lblNewLabel_31.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\final_project\\final_project\\theater.png"));
		lblNewLabel_31.setHorizontalAlignment(SwingConstants.CENTER);
		panel_30.add(lblNewLabel_31, BorderLayout.SOUTH);
		
		JPanel panel_31 = new JPanel();
		GridBagConstraints gbc_panel_31 = new GridBagConstraints();
		gbc_panel_31.weighty = 3.0;
		gbc_panel_31.fill = GridBagConstraints.BOTH;
		gbc_panel_31.gridx = 0;
		gbc_panel_31.gridy = 2;
		panel_23.add(panel_31, gbc_panel_31);
		GridBagLayout gbl_panel_31 = new GridBagLayout();
		gbl_panel_31.columnWidths = new int[]{0, 0};
		gbl_panel_31.rowHeights = new int[]{0, 0, 0, 0};
		gbl_panel_31.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panel_31.rowWeights = new double[]{1.0, 0.0, 1.0, Double.MIN_VALUE};
		panel_31.setLayout(gbl_panel_31);
		
		JPanel panel_40 = new JPanel();
		GridBagConstraints gbc_panel_40 = new GridBagConstraints();
		gbc_panel_40.weighty = 1.0;
		gbc_panel_40.fill = GridBagConstraints.BOTH;
		gbc_panel_40.gridx = 0;
		gbc_panel_40.gridy = 0;
		panel_31.add(panel_40, gbc_panel_40);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setBackground(new Color(245, 245, 245));
		btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\final_project\\final_project\\go-removebg-preview (1).png"));
		GridBagConstraints gbc_btnNewButton_2 = new GridBagConstraints();
		gbc_btnNewButton_2.weighty = 3.0;
		gbc_btnNewButton_2.gridx = 0;
		gbc_btnNewButton_2.gridy = 1;
		panel_31.add(btnNewButton_2, gbc_btnNewButton_2);
		
		JPanel panel_41 = new JPanel();
		GridBagConstraints gbc_panel_41 = new GridBagConstraints();
		gbc_panel_41.weighty = 1.0;
		gbc_panel_41.fill = GridBagConstraints.BOTH;
		gbc_panel_41.gridx = 0;
		gbc_panel_41.gridy = 2;
		panel_31.add(panel_41, gbc_panel_41);
		
		JPanel panel_24 = new JPanel();
		panel_21.add(panel_24);
		GridBagLayout gbl_panel_24 = new GridBagLayout();
		gbl_panel_24.columnWidths = new int[]{0, 0};
		gbl_panel_24.rowHeights = new int[]{0, 0, 0, 0};
		gbl_panel_24.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panel_24.rowWeights = new double[]{1.0, 1.0, 1.0, Double.MIN_VALUE};
		panel_24.setLayout(gbl_panel_24);
		
		JPanel panel_32 = new JPanel();
		GridBagConstraints gbc_panel_32 = new GridBagConstraints();
		gbc_panel_32.weighty = 1.0;
		gbc_panel_32.fill = GridBagConstraints.BOTH;
		gbc_panel_32.gridx = 0;
		gbc_panel_32.gridy = 0;
		panel_24.add(panel_32, gbc_panel_32);
		
		JPanel panel_33 = new JPanel();
		GridBagConstraints gbc_panel_33 = new GridBagConstraints();
		gbc_panel_33.weighty = 6.0;
		gbc_panel_33.fill = GridBagConstraints.BOTH;
		gbc_panel_33.gridx = 0;
		gbc_panel_33.gridy = 1;
		panel_24.add(panel_33, gbc_panel_33);
		panel_33.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_28 = new JLabel("Rate Movies");
		lblNewLabel_28.setFont(new Font("굴림", Font.BOLD, 16));
		lblNewLabel_28.setHorizontalAlignment(SwingConstants.CENTER);
		panel_33.add(lblNewLabel_28, BorderLayout.CENTER);
		
		JLabel lblNewLabel_32 = new JLabel("");
		lblNewLabel_32.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\final_project\\final_project\\score-removebg-preview.png"));
		lblNewLabel_32.setHorizontalAlignment(SwingConstants.CENTER);
		panel_33.add(lblNewLabel_32, BorderLayout.SOUTH);
		
		JPanel panel_34 = new JPanel();
		GridBagConstraints gbc_panel_34 = new GridBagConstraints();
		gbc_panel_34.weighty = 3.0;
		gbc_panel_34.fill = GridBagConstraints.BOTH;
		gbc_panel_34.gridx = 0;
		gbc_panel_34.gridy = 2;
		panel_24.add(panel_34, gbc_panel_34);
		GridBagLayout gbl_panel_34 = new GridBagLayout();
		gbl_panel_34.columnWidths = new int[]{0, 0};
		gbl_panel_34.rowHeights = new int[]{0, 0, 0, 0};
		gbl_panel_34.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panel_34.rowWeights = new double[]{1.0, 0.0, 1.0, Double.MIN_VALUE};
		panel_34.setLayout(gbl_panel_34);
		
		JPanel panel_42 = new JPanel();
		GridBagConstraints gbc_panel_42 = new GridBagConstraints();
		gbc_panel_42.weighty = 1.0;
		gbc_panel_42.fill = GridBagConstraints.BOTH;
		gbc_panel_42.gridx = 0;
		gbc_panel_42.gridy = 0;
		panel_34.add(panel_42, gbc_panel_42);
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.setBackground(new Color(245, 245, 245));
		btnNewButton_3.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\final_project\\final_project\\go-removebg-preview (1).png"));
		GridBagConstraints gbc_btnNewButton_3 = new GridBagConstraints();
		gbc_btnNewButton_3.weighty = 3.0;
		gbc_btnNewButton_3.gridx = 0;
		gbc_btnNewButton_3.gridy = 1;
		panel_34.add(btnNewButton_3, gbc_btnNewButton_3);
		
		JPanel panel_43 = new JPanel();
		GridBagConstraints gbc_panel_43 = new GridBagConstraints();
		gbc_panel_43.weighty = 1.0;
		gbc_panel_43.fill = GridBagConstraints.BOTH;
		gbc_panel_43.gridx = 0;
		gbc_panel_43.gridy = 2;
		panel_34.add(panel_43, gbc_panel_43);
		
		JPanel panel_25 = new JPanel();
		panel_21.add(panel_25);
		GridBagLayout gbl_panel_25 = new GridBagLayout();
		gbl_panel_25.columnWidths = new int[]{0, 0};
		gbl_panel_25.rowHeights = new int[]{0, 0, 0, 0};
		gbl_panel_25.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panel_25.rowWeights = new double[]{1.0, 1.0, 1.0, Double.MIN_VALUE};
		panel_25.setLayout(gbl_panel_25);
		
		JPanel panel_35 = new JPanel();
		GridBagConstraints gbc_panel_35 = new GridBagConstraints();
		gbc_panel_35.weighty = 1.0;
		gbc_panel_35.fill = GridBagConstraints.BOTH;
		gbc_panel_35.gridx = 0;
		gbc_panel_35.gridy = 0;
		panel_25.add(panel_35, gbc_panel_35);
		
		JPanel panel_36 = new JPanel();
		GridBagConstraints gbc_panel_36 = new GridBagConstraints();
		gbc_panel_36.weighty = 6.0;
		gbc_panel_36.fill = GridBagConstraints.BOTH;
		gbc_panel_36.gridx = 0;
		gbc_panel_36.gridy = 1;
		panel_25.add(panel_36, gbc_panel_36);
		panel_36.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_29 = new JLabel("Personalized Score Prediction");
		lblNewLabel_29.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_29.setFont(new Font("굴림", Font.BOLD, 16));
		panel_36.add(lblNewLabel_29, BorderLayout.CENTER);
		
		JLabel lblNewLabel_33 = new JLabel("");
		lblNewLabel_33.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\final_project\\final_project\\ai.png"));
		lblNewLabel_33.setHorizontalAlignment(SwingConstants.CENTER);
		panel_36.add(lblNewLabel_33, BorderLayout.SOUTH);
		
		JPanel panel_37 = new JPanel();
		GridBagConstraints gbc_panel_37 = new GridBagConstraints();
		gbc_panel_37.weighty = 3.0;
		gbc_panel_37.fill = GridBagConstraints.BOTH;
		gbc_panel_37.gridx = 0;
		gbc_panel_37.gridy = 2;
		panel_25.add(panel_37, gbc_panel_37);
		GridBagLayout gbl_panel_37 = new GridBagLayout();
		gbl_panel_37.columnWidths = new int[]{0, 0};
		gbl_panel_37.rowHeights = new int[]{0, 0, 0, 0};
		gbl_panel_37.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panel_37.rowWeights = new double[]{1.0, 0.0, 1.0, Double.MIN_VALUE};
		panel_37.setLayout(gbl_panel_37);
		
		JPanel panel_44 = new JPanel();
		GridBagConstraints gbc_panel_44 = new GridBagConstraints();
		gbc_panel_44.weighty = 1.0;
		gbc_panel_44.fill = GridBagConstraints.BOTH;
		gbc_panel_44.gridx = 0;
		gbc_panel_44.gridy = 0;
		panel_37.add(panel_44, gbc_panel_44);
		
		JButton btnNewButton_4 = new JButton("");
		btnNewButton_4.setBackground(new Color(245, 245, 245));
		btnNewButton_4.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\final_project\\final_project\\go-removebg-preview (1).png"));
		GridBagConstraints gbc_btnNewButton_4 = new GridBagConstraints();
		gbc_btnNewButton_4.weighty = 3.0;
		gbc_btnNewButton_4.gridx = 0;
		gbc_btnNewButton_4.gridy = 1;
		panel_37.add(btnNewButton_4, gbc_btnNewButton_4);
		
		JPanel panel_45 = new JPanel();
		GridBagConstraints gbc_panel_45 = new GridBagConstraints();
		gbc_panel_45.weighty = 1.0;
		gbc_panel_45.fill = GridBagConstraints.BOTH;
		gbc_panel_45.gridx = 0;
		gbc_panel_45.gridy = 2;
		panel_37.add(panel_45, gbc_panel_45);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBackground(new Color(255, 98, 98));
		EECinema_frame.getContentPane().add(panel_8, BorderLayout.SOUTH);
		panel_8.setLayout(new BoxLayout(panel_8, BoxLayout.X_AXIS));
		
		JPanel panel_9 = new JPanel();
		panel_9.setBackground(new Color(255, 98, 98));
		panel_8.add(panel_9);
		panel_9.setLayout(new BoxLayout(panel_9, BoxLayout.X_AXIS));
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setStringPainted(true);
		panel_9.add(progressBar);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBackground(new Color(255, 98, 98));
		panel_8.add(panel_10);
		panel_10.setLayout(new BoxLayout(panel_10, BoxLayout.X_AXIS));
		
		JPanel panel_18 = new JPanel();
		panel_18.setBackground(new Color(255, 98, 98));
		panel_10.add(panel_18);
		panel_18.setLayout(new BorderLayout(5, 5));
		
		JLabel lblNewLabel_4 = new JLabel("Ticket(s):");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_4.setFont(new Font("굴림", Font.BOLD, 12));
		panel_18.add(lblNewLabel_4, BorderLayout.WEST);
		
		JLabel lblNewLabel_5 = new JLabel("0");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		panel_18.add(lblNewLabel_5);
		
		JPanel panel_19 = new JPanel();
		panel_19.setBackground(new Color(255, 98, 98));
		panel_10.add(panel_19);
		panel_19.setLayout(new BorderLayout(5, 5));
		
		JLabel lblNewLabel_22 = new JLabel("Coupon:");
		lblNewLabel_22.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_22.setFont(new Font("굴림", Font.BOLD, 12));
		panel_19.add(lblNewLabel_22, BorderLayout.WEST);
		
		JLabel lblNewLabel_23 = new JLabel("0");
		lblNewLabel_23.setHorizontalAlignment(SwingConstants.CENTER);
		panel_19.add(lblNewLabel_23);
		
		JPanel panel_20 = new JPanel();
		panel_20.setBackground(new Color(255, 98, 98));
		panel_10.add(panel_20);
		panel_20.setLayout(new BorderLayout(5, 5));
		
		JLabel lblNewLabel_24 = new JLabel("Points:");
		lblNewLabel_24.setFont(new Font("굴림", Font.BOLD, 12));
		lblNewLabel_24.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_20.add(lblNewLabel_24, BorderLayout.WEST);
		
		JLabel lblNewLabel_25 = new JLabel("0");
		lblNewLabel_25.setHorizontalAlignment(SwingConstants.CENTER);
		panel_20.add(lblNewLabel_25);
	}
}
