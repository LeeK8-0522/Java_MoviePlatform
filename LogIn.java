package Main;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;
import java.awt.Color;

public class LogIn extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			LogIn dialog = new LogIn();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public LogIn() {
		setTitle("EECinema Log In");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(0, 0, 0, 0));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		GridBagLayout gbl_contentPanel = new GridBagLayout();
		gbl_contentPanel.columnWidths = new int[] {0, 0, 0, 0};
		gbl_contentPanel.rowHeights = new int[]{0, 0};
		gbl_contentPanel.columnWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
		gbl_contentPanel.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		contentPanel.setLayout(gbl_contentPanel);
		{
			JPanel panel = new JPanel();
			panel.setBackground(new Color(240, 240, 240));
			GridBagConstraints gbc_panel = new GridBagConstraints();
			gbc_panel.weightx = 1.0;
			gbc_panel.fill = GridBagConstraints.BOTH;
			gbc_panel.gridx = 0;
			gbc_panel.gridy = 0;
			contentPanel.add(panel, gbc_panel);
			GridBagLayout gbl_panel = new GridBagLayout();
			gbl_panel.columnWidths = new int[]{0, 0};
			gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0};
			gbl_panel.columnWeights = new double[]{1.0, Double.MIN_VALUE};
			gbl_panel.rowWeights = new double[]{1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
			panel.setLayout(gbl_panel);
			
			JPanel panel_1 = new JPanel();
			panel_1.setBackground(new Color(240, 240, 240));
			GridBagConstraints gbc_panel_1 = new GridBagConstraints();
			gbc_panel_1.fill = GridBagConstraints.BOTH;
			gbc_panel_1.gridx = 0;
			gbc_panel_1.gridy = 0;
			panel.add(panel_1, gbc_panel_1);
			
			JPanel panel_2 = new JPanel();
			panel_2.setBackground(new Color(240, 240, 240));
			GridBagConstraints gbc_panel_2 = new GridBagConstraints();
			gbc_panel_2.insets = new Insets(0, 0, 20, 0);
			gbc_panel_2.fill = GridBagConstraints.BOTH;
			gbc_panel_2.gridx = 0;
			gbc_panel_2.gridy = 1;
			panel.add(panel_2, gbc_panel_2);
			panel_2.setLayout(new BorderLayout(0, 0));
			
			JLabel lblNewLabel = new JLabel("ID:");
			lblNewLabel.setVerticalAlignment(SwingConstants.BOTTOM);
			lblNewLabel.setFont(new Font("굴림", Font.BOLD, 14));
			panel_2.add(lblNewLabel, BorderLayout.EAST);
			
			JPanel panel_3 = new JPanel();
			panel_3.setBackground(new Color(240, 240, 240));
			GridBagConstraints gbc_panel_3 = new GridBagConstraints();
			gbc_panel_3.fill = GridBagConstraints.BOTH;
			gbc_panel_3.gridx = 0;
			gbc_panel_3.gridy = 2;
			panel.add(panel_3, gbc_panel_3);
			panel_3.setLayout(new BorderLayout(0, 0));
			
			JLabel lblNewLabel_1 = new JLabel("Password:");
			lblNewLabel_1.setVerticalAlignment(SwingConstants.TOP);
			lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 14));
			panel_3.add(lblNewLabel_1, BorderLayout.EAST);
			
			JPanel panel_4 = new JPanel();
			panel_4.setBackground(new Color(240, 240, 240));
			GridBagConstraints gbc_panel_4 = new GridBagConstraints();
			gbc_panel_4.fill = GridBagConstraints.BOTH;
			gbc_panel_4.gridx = 0;
			gbc_panel_4.gridy = 3;
			panel.add(panel_4, gbc_panel_4);
		}
		{
			JPanel panel = new JPanel();
			GridBagConstraints gbc_panel = new GridBagConstraints();
			gbc_panel.weightx = 3.0;
			gbc_panel.fill = GridBagConstraints.BOTH;
			gbc_panel.gridx = 1;
			gbc_panel.gridy = 0;
			contentPanel.add(panel, gbc_panel);
			GridBagLayout gbl_panel = new GridBagLayout();
			gbl_panel.columnWidths = new int[]{0, 0};
			gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0};
			gbl_panel.columnWeights = new double[]{1.0, Double.MIN_VALUE};
			gbl_panel.rowWeights = new double[]{1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
			panel.setLayout(gbl_panel);
			
			JPanel panel_1 = new JPanel();
			GridBagConstraints gbc_panel_1 = new GridBagConstraints();
			gbc_panel_1.weighty = 4.0;
			gbc_panel_1.fill = GridBagConstraints.BOTH;
			gbc_panel_1.gridx = 0;
			gbc_panel_1.gridy = 0;
			panel.add(panel_1, gbc_panel_1);
			
			JPanel panel_2 = new JPanel();
			GridBagConstraints gbc_panel_2 = new GridBagConstraints();
			gbc_panel_2.weighty = 1.0;
			gbc_panel_2.fill = GridBagConstraints.BOTH;
			gbc_panel_2.gridx = 0;
			gbc_panel_2.gridy = 1;
			panel.add(panel_2, gbc_panel_2);
			panel_2.setLayout(new BorderLayout(5, 5));
			
			textField = new JTextField();
			panel_2.add(textField, BorderLayout.CENTER);
			textField.setColumns(10);
			
			JPanel panel_3 = new JPanel();
			GridBagConstraints gbc_panel_3 = new GridBagConstraints();
			gbc_panel_3.weighty = 1.0;
			gbc_panel_3.insets = new Insets(5, 0, 0, 0);
			gbc_panel_3.fill = GridBagConstraints.BOTH;
			gbc_panel_3.gridx = 0;
			gbc_panel_3.gridy = 2;
			panel.add(panel_3, gbc_panel_3);
			panel_3.setLayout(new BorderLayout(5, 5));
			
			textField_1 = new JTextField();
			panel_3.add(textField_1, BorderLayout.CENTER);
			textField_1.setColumns(10);
			
			JPanel panel_4 = new JPanel();
			GridBagConstraints gbc_panel_4 = new GridBagConstraints();
			gbc_panel_4.weighty = 4.0;
			gbc_panel_4.fill = GridBagConstraints.BOTH;
			gbc_panel_4.gridx = 0;
			gbc_panel_4.gridy = 3;
			panel.add(panel_4, gbc_panel_4);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(new Color(255, 98, 98));
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setForeground(new Color(255, 0, 0));
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
