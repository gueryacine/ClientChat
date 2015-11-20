import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GestionEvent2 implements ActionListener {
	String newLine = System.getProperty("line.separator");
	private Connect conn;

	public GestionEvent2(Connect connect) {
		this.conn = connect;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		// fermer la fenetre de connexion
		conn.setVisible(false);

		// recup du login
		String login = conn.getTextField();

		// creation d'un thread qui va gerer le socket du client
		
		
		// TODO recuperer l'ip et le port depuis l'IHM
		ClientsSocketThread clint = new ClientsSocketThread("10.131.128.209",5000, login);
		clint.start();
		
		
		
		// creation et affichage de la fenetre chat
		Interfaces frame = new Interfaces(clint);
		clint.setview(frame);
		frame.setVisible(true);
	}

}
