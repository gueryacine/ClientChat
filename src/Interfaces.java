import javax.swing.*;
import java.awt.*;


public class Interfaces extends JFrame {


	public static TextField textField;
	public static TextArea textArea;
	

	public Interfaces(ClientsSocketThread clint) {
		setBounds(100, 100, 450, 300);
		
		Panel panel = new Panel();
		getContentPane().add(panel, BorderLayout.SOUTH);
		
		textField = new TextField();
		textField.setColumns(30);
		panel.add(textField);
		
		Button button = new Button("Envoyer");
		button.addActionListener(new GestionEvent(this,clint));
		panel.add(button);
		setDefaultCloseOperation(EXIT_ON_CLOSE) ;
		Panel panel_1 = new Panel();
		getContentPane().add(panel_1, BorderLayout.NORTH);
		
		Label label = new Label("CHAT v 0.1");
		panel_1.add(label);
		
		textArea = new TextArea();
		textArea.setEnabled(false);
		textArea.setEditable(false);
		getContentPane().add(textArea, BorderLayout.CENTER);

	}

	public String getTextField() {
		
		return textField.getText();
	}


	public void setTextArea(String string) {
		// TODO Auto-generated method stub
		Interfaces.textArea.append(string + "\n");
	}



	

}
