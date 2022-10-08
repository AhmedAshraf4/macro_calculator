package org.eclipse.wb.swt;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class Cutting {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void ShowCutting() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cutting window = new Cutting();
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
	public Cutting() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
