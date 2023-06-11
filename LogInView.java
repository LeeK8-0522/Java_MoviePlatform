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
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;
import java.awt.Color;

public class LogInView extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField ID_textField;
	private JTextField Password_textField;
	private JButton okButton;
	private JButton cancelButton;

	/**
	 * Create the dialog.
	 */
	public LogInView() {
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
			JPanel West_panel = new JPanel();
			West_panel.setBackground(new Color(240, 240, 240));
			GridBagConstraints gbc_West_panel = new GridBagConstraints();
			gbc_West_panel.weightx = 1.0;
			gbc_West_panel.fill = GridBagConstraints.BOTH;
			gbc_West_panel.gridx = 0;
			gbc_West_panel.gridy = 0;
			contentPanel.add(West_panel, gbc_West_panel);
			GridBagLayout gbl_West_panel = new GridBagLayout();
			gbl_West_panel.columnWidths = new int[]{0, 0};
			gbl_West_panel.rowHeights = new int[]{0, 0, 0, 0, 0};
			gbl_West_panel.columnWeights = new double[]{1.0, Double.MIN_VALUE};
			gbl_West_panel.rowWeights = new double[]{1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
			West_panel.setLayout(gbl_West_panel);
			
			JPanel WestUpper_panel = new JPanel();
			WestUpper_panel.setBackground(new Color(240, 240, 240));
			GridBagConstraints gbc_WestUpper_panel = new GridBagConstraints();
			gbc_WestUpper_panel.fill = GridBagConstraints.BOTH;
			gbc_WestUpper_panel.gridx = 0;
			gbc_WestUpper_panel.gridy = 0;
			West_panel.add(WestUpper_panel, gbc_WestUpper_panel);
			
			JPanel IDTitle_panel = new JPanel();
			IDTitle_panel.setBackground(new Color(240, 240, 240));
			GridBagConstraints gbc_IDTitle_panel = new GridBagConstraints();
			gbc_IDTitle_panel.insets = new Insets(0, 0, 20, 0);
			gbc_IDTitle_panel.fill = GridBagConstraints.BOTH;
			gbc_IDTitle_panel.gridx = 0;
			gbc_IDTitle_panel.gridy = 1;
			West_panel.add(IDTitle_panel, gbc_IDTitle_panel);
			IDTitle_panel.setLayout(new BorderLayout(0, 0));
			
			JLabel ID_label = new JLabel("ID:");
			ID_label.setVerticalAlignment(SwingConstants.BOTTOM);
			ID_label.setFont(new Font("굴림", Font.BOLD, 14));
			IDTitle_panel.add(ID_label, BorderLayout.EAST);
			
			JPanel WestMiddle_panel = new JPanel();
			WestMiddle_panel.setBackground(new Color(240, 240, 240));
			GridBagConstraints gbc_WestMiddle_panel = new GridBagConstraints();
			gbc_WestMiddle_panel.fill = GridBagConstraints.BOTH;
			gbc_WestMiddle_panel.gridx = 0;
			gbc_WestMiddle_panel.gridy = 2;
			West_panel.add(WestMiddle_panel, gbc_WestMiddle_panel);
			WestMiddle_panel.setLayout(new BorderLayout(0, 0));
			
			JLabel Password_label = new JLabel("Password:");
			Password_label.setVerticalAlignment(SwingConstants.TOP);
			Password_label.setFont(new Font("굴림", Font.BOLD, 14));
			WestMiddle_panel.add(Password_label, BorderLayout.EAST);
			
			JPanel PasswordTtile_panel = new JPanel();
			PasswordTtile_panel.setBackground(new Color(240, 240, 240));
			GridBagConstraints gbc_PasswordTtile_panel = new GridBagConstraints();
			gbc_PasswordTtile_panel.fill = GridBagConstraints.BOTH;
			gbc_PasswordTtile_panel.gridx = 0;
			gbc_PasswordTtile_panel.gridy = 3;
			West_panel.add(PasswordTtile_panel, gbc_PasswordTtile_panel);
		}
		{
			JPanel Input_panel = new JPanel();
			GridBagConstraints gbc_Input_panel = new GridBagConstraints();
			gbc_Input_panel.weightx = 3.0;
			gbc_Input_panel.fill = GridBagConstraints.BOTH;
			gbc_Input_panel.gridx = 1;
			gbc_Input_panel.gridy = 0;
			contentPanel.add(Input_panel, gbc_Input_panel);
			GridBagLayout gbl_Input_panel = new GridBagLayout();
			gbl_Input_panel.columnWidths = new int[]{0, 0};
			gbl_Input_panel.rowHeights = new int[]{0, 0, 0, 0, 0};
			gbl_Input_panel.columnWeights = new double[]{1.0, Double.MIN_VALUE};
			gbl_Input_panel.rowWeights = new double[]{1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
			Input_panel.setLayout(gbl_Input_panel);
			
			JPanel panel_1 = new JPanel();
			GridBagConstraints gbc_panel_1 = new GridBagConstraints();
			gbc_panel_1.weighty = 4.0;
			gbc_panel_1.fill = GridBagConstraints.BOTH;
			gbc_panel_1.gridx = 0;
			gbc_panel_1.gridy = 0;
			Input_panel.add(panel_1, gbc_panel_1);
			
			JPanel panel_2 = new JPanel();
			GridBagConstraints gbc_panel_2 = new GridBagConstraints();
			gbc_panel_2.weighty = 1.0;
			gbc_panel_2.fill = GridBagConstraints.BOTH;
			gbc_panel_2.gridx = 0;
			gbc_panel_2.gridy = 1;
			Input_panel.add(panel_2, gbc_panel_2);
			panel_2.setLayout(new BorderLayout(5, 5));
			
			ID_textField = new JTextField();
			panel_2.add(ID_textField, BorderLayout.CENTER);
			ID_textField.setColumns(10);
			
			JPanel panel_3 = new JPanel();
			GridBagConstraints gbc_panel_3 = new GridBagConstraints();
			gbc_panel_3.weighty = 1.0;
			gbc_panel_3.insets = new Insets(5, 0, 0, 0);
			gbc_panel_3.fill = GridBagConstraints.BOTH;
			gbc_panel_3.gridx = 0;
			gbc_panel_3.gridy = 2;
			Input_panel.add(panel_3, gbc_panel_3);
			panel_3.setLayout(new BorderLayout(5, 5));
			
			Password_textField = new JTextField();
			panel_3.add(Password_textField, BorderLayout.CENTER);
			Password_textField.setColumns(10);
			
			JPanel panel_4 = new JPanel();
			GridBagConstraints gbc_panel_4 = new GridBagConstraints();
			gbc_panel_4.weighty = 4.0;
			gbc_panel_4.fill = GridBagConstraints.BOTH;
			gbc_panel_4.gridx = 0;
			gbc_panel_4.gridy = 3;
			Input_panel.add(panel_4, gbc_panel_4);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(new Color(255, 98, 98));
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				cancelButton = new JButton("Cancel");
				cancelButton.setForeground(new Color(255, 0, 0));
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
	
	public void setListener(ActionListener listener) {
		okButton.addActionListener(listener);
		cancelButton.addActionListener(listener);
	}//add action listener to okButton and cancelButton
	
	/* Below are getter-methods */
	public JButton getOkButton() {
		return this.okButton;
	}
	
	public JButton getCancelButton() {
		return this.cancelButton;
	}
	
	public String getEnteredID() {
		return this.ID_textField.getText();
	}
	
	public String getEnteredPassword() {
		return this.Password_textField.getText();
	}
	/* Finish implementing getter-methods */
}
