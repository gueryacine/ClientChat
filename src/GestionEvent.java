import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GestionEvent implements ActionListener {
	String newLine = System.getProperty("line.separator");
	private Interfaces inter;
	private ClientsSocketThread client;
	public GestionEvent(Interfaces interfaces,ClientsSocketThread client) {
		this.inter = interfaces;
		this.client = client;
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		
		String message = inter.getTextField();
		client.envoieDataServeur(message);
		System.err.println(message);
	}
}
