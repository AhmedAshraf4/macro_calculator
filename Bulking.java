package org.eclipse.wb.swt;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Color;

public class Bulking {

	private JFrame frame;
	private JTextField cals;
	private JTextField wht;
	private JButton btnNewButton;
	private JLabel lblNewLabel_1_2;
	private JTextField ft;
	private JLabel lblNewLabel_1_3;
	private JLabel lblNewLabel_1_4;
	private JLabel lblNewLabel_1_5;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField textField;
	private JTextField textField_3;
	private JTextField textField_4;
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private final ButtonGroup buttonGroup_2 = new ButtonGroup();
	private JTextField sur;

	/**
	 * Launch the application.
	 */
	public static void ShowBulking() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bulking window = new Bulking();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Bulking() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 659, 574);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome to your Bulking calculator");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel.setBounds(10, 11, 663, 35);
		frame.getContentPane().add(lblNewLabel);
		
		cals = new JTextField();
		cals.setBounds(131, 78, 96, 21);
		frame.getContentPane().add(cals);
		cals.setColumns(10);
		
		
		JLabel lblNewLabel_1 = new JLabel("Enter your weight:");
		lblNewLabel_1.setBounds(10, 110, 111, 21);
		frame.getContentPane().add(lblNewLabel_1);
		
		wht = new JTextField();
		wht.setColumns(10);
		wht.setBounds(131, 110, 96, 21);
		frame.getContentPane().add(wht);
		
		JLabel lblNewLabel_1_1 = new JLabel("Enter your calories:");
		lblNewLabel_1_1.setBounds(10, 78, 111, 21);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		btnNewButton = new JButton("Calculate");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			if (Integer.parseInt(sur.getText())>500 || Integer.parseInt(sur.getText())<200) {
				JOptionPane.showMessageDialog(null, "ALERT MESSAGE", "TITLE", JOptionPane.ERROR_MESSAGE);
			}
			else {
				double calories = Float.parseFloat(cals.getText());
				double lbm = Float.parseFloat(wht.getText()) - (Float.parseFloat(wht.getText()) * Float.parseFloat(ft.getText()) * 0.01);
				double neededcalories = Float.parseFloat(sur.getText()) + calories;
				double protien = (lbm * 2.2) * Float.parseFloat(buttonGroup.getSelection().getActionCommand());
				int protienount = (int)protien;
				double fats = (Float.parseFloat(buttonGroup_1.getSelection().getActionCommand()) * neededcalories)/9;
				int fatsount = (int)fats;
				textField_3.setText(String.valueOf(fatsount));
				textField.setText(String.valueOf(protienount));
				System.out.println(buttonGroup_1.getSelection().getActionCommand());
				}
		}});
		
		btnNewButton.setBounds(451, 288, 128, 44);
		frame.getContentPane().add(btnNewButton);
		
		lblNewLabel_1_2 = new JLabel("Enter your body fat:");
		lblNewLabel_1_2.setBounds(323, 78, 117, 21);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		ft = new JTextField();
		ft.setColumns(10);
		ft.setBounds(438, 78, 48, 21);
		frame.getContentPane().add(ft);
		
		lblNewLabel_1_3 = new JLabel("%");
		lblNewLabel_1_3.setBounds(491, 78, 44, 21);
		frame.getContentPane().add(lblNewLabel_1_3);
		
		lblNewLabel_1_4 = new JLabel("cal");
		lblNewLabel_1_4.setBounds(232, 81, 44, 21);
		frame.getContentPane().add(lblNewLabel_1_4);
		
		lblNewLabel_1_5 = new JLabel("kg");
		lblNewLabel_1_5.setBounds(232, 110, 44, 21);
		frame.getContentPane().add(lblNewLabel_1_5);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Choose Your Level", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(10, 153, 565, 45);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JRadioButton but1 = new JRadioButton("Begginer");
		but1.setBounds(6, 16, 109, 23);
		panel.add(but1);
		buttonGroup.add(but1);
		but1.setActionCommand("1.6");
		
		JRadioButton but2 = new JRadioButton("Amateur");
		but2.setBounds(118, 16, 109, 23);
		panel.add(but2);
		buttonGroup.add(but2);
		but2.setActionCommand("1.5");
		
		JRadioButton but3 = new JRadioButton("Semi pro");
		but3.setBounds(228, 16, 109, 23);
		panel.add(but3);
		buttonGroup.add(but3);
		but3.setActionCommand("1.4");
		
		JRadioButton but4 = new JRadioButton("Professional");
		but4.setBounds(339, 16, 109, 23);
		panel.add(but4);
		buttonGroup.add(but4);
		but4.setActionCommand("1.3");
		
		JRadioButton but5 = new JRadioButton("World Class");
		but5.setBounds(450, 16, 109, 23);
		panel.add(but5);
		buttonGroup.add(but5);
		but5.setActionCommand("1.2");
		
		JLabel lblNewLabel_3 = new JLabel("Protiens");
		lblNewLabel_3.setFont(new Font("Unispace", Font.BOLD, 17));
		lblNewLabel_3.setBounds(75, 382, 86, 28);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("Fats");
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1.setFont(new Font("Unispace", Font.BOLD, 17));
		lblNewLabel_3_1.setBounds(251, 382, 86, 28);
		frame.getContentPane().add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Carbs");
		lblNewLabel_3_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1_1.setFont(new Font("Unispace", Font.BOLD, 17));
		lblNewLabel_3_1_1.setBounds(438, 382, 86, 28);
		frame.getContentPane().add(lblNewLabel_3_1_1);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(75, 421, 86, 35);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBounds(251, 421, 86, 35);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		textField_4.setBounds(438, 421, 86, 35);
		frame.getContentPane().add(textField_4);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Choose Your desired fat intake", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.setBounds(10, 209, 214, 45);
		frame.getContentPane().add(panel_1);
		
		JRadioButton but1_1 = new JRadioButton("20%");
		buttonGroup_1.add(but1_1);
		but1_1.setBounds(7, 16, 109, 23);
		panel_1.add(but1_1);
		but1_1.setActionCommand("0.2");
		
		JRadioButton but2_1 = new JRadioButton("30%");
		buttonGroup_1.add(but2_1);
		but2_1.setBounds(118, 16, 90, 23);
		panel_1.add(but2_1);
		but2_1.setActionCommand("0.3");
		
		JLabel lblNewLabel_2 = new JLabel("Choose your surplus calories");
		lblNewLabel_2.setBounds(318, 225, 168, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		sur = new JTextField();
		sur.setBounds(489, 223, 86, 20);
		frame.getContentPane().add(sur);
		sur.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("g");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_4.setBounds(171, 421, 56, 35);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("g");
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_4_1.setBounds(347, 421, 56, 35);
		frame.getContentPane().add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4_2 = new JLabel("g");
		lblNewLabel_4_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_4_2.setBounds(534, 421, 56, 35);
		frame.getContentPane().add(lblNewLabel_4_2);
		
		
	}
}
