package github;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BuilderRandom {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BuilderRandom window = new BuilderRandom();
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
	public BuilderRandom() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(53, 68, 96, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(228, 68, 142, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnAdivina = new JButton("Adivina");
		
		int rand = (int) (Math.random()*100+1);
		
		btnAdivina.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String resultado="";
				int x=Integer.parseInt(textField.getText());
				
				if (x==rand) {
					resultado="acertaste";
				} else if (x<rand) {
					
					resultado="Menor al buscado";
					textField.setText("");
				} else{
					
					resultado="Mayor al buscado";
					textField.setText("");
				}
				textField_1.setText(resultado);
				
			
			}
		});
		btnAdivina.setBounds(156, 157, 89, 23);
		frame.getContentPane().add(btnAdivina);
	}

}
