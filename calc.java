package org.eclipse.wb.swt;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class calc {

	private JFrame frmMacrosCalculator;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calc window = new calc();
					window.frmMacrosCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public calc() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMacrosCalculator = new JFrame();
		frmMacrosCalculator.setTitle("Macros calculator");
		frmMacrosCalculator.setBounds(100, 100, 530, 365);
		frmMacrosCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMacrosCalculator.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("My Macros Calculator");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 29));
		lblNewLabel.setBounds(10, 11, 493, 39);
		frmMacrosCalculator.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Choose your goal:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(114, 102, 111, 16);
		frmMacrosCalculator.getContentPane().add(lblNewLabel_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Bulking", "Cutting"}));
		comboBox.setBounds(114, 124, 250, 22);
		frmMacrosCalculator.getContentPane().add(comboBox);
		
		JButton btnNewButton = new JButton("Let's go");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String val = comboBox.getSelectedItem().toString();
				if(val=="Bulking") {
					Bulking nw = new Bulking();
					nw.ShowBulking();	
				}
				else {
					Cutting nww = new Cutting();
					nww.ShowCutting();
				}
			
					
			}
		});
		btnNewButton.setBounds(355, 227, 102, 32);
		frmMacrosCalculator.getContentPane().add(btnNewButton);
	}
}
