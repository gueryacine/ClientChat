import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.Label;
import java.awt.TextField;

public class Connect extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JLabel lblNewLabel;
	private JPanel panel;
	private JLabel lblNewLabel_1;
	private Label label;
	private TextField IPadd;
	private TextField portnb;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public Connect() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 105);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JButton btnNewButton = new JButton("se connecter");
		btnNewButton.addActionListener(new GestionEvent2(this));
		contentPane.add(btnNewButton, BorderLayout.EAST);

		textField = new JTextField();
		contentPane.add(textField, BorderLayout.CENTER);
		textField.setColumns(10);

		lblNewLabel = new JLabel("Pseudo");
		contentPane.add(lblNewLabel, BorderLayout.WEST);

		panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);

		lblNewLabel_1 = new JLabel("Adresse IP");
		panel.add(lblNewLabel_1);

		IPadd = new TextField();
		IPadd.setColumns(15);
		panel.add(IPadd);

		label = new Label("Port");
		panel.add(label);

		portnb = new TextField();
		portnb.setColumns(15);
		panel.add(portnb);
	}

	public String getTextField() {
		return textField.getText();
	}

	public void setTextField(JTextField textField) {
		this.textField = textField;
	}
	public String getTextField1() {
		return textField.getText();
	}

	public void setTextField1(JTextField textField) {
		this.textField = textField;
	}
	public String getTextField2() {
		return textField.getText();
	}

	public void setTextField2(JTextField textField) {
		this.textField = textField;
	}

}
