import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Quiz2 {

	private JFrame frame;
	private JTextField textFieldNumber1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Quiz2 window = new Quiz2();
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
	public Quiz2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 369, 221);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textFieldNumber1 = new JTextField();
		textFieldNumber1.setBounds(189, 56, 151, 55);
		frame.getContentPane().add(textFieldNumber1);
		textFieldNumber1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("My Weight (kg):");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setBounds(25, 59, 154, 46);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("How much water should I drink?");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setBounds(25, 11, 222, 37);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Tell me");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double weight;
				double water;
				try {
					weight=Double.parseDouble(textFieldNumber1.getText());
					water=weight *0.033;
					JOptionPane.showMessageDialog(null, "Buddy, you should drink " + water + " L of water in a day!!!!!");
				}catch (Exception e) {
					
					JOptionPane.showMessageDialog(null, "Please Enter Valid Number");
				}
			}
		});
		btnNewButton.setBounds(118, 122, 98, 33);
		frame.getContentPane().add(btnNewButton);
	}

}
