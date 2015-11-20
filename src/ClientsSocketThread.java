import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;


/**
 * @author gueryacine
 *
 */
public class ClientsSocketThread extends Thread implements Msgrecu {

	Socket socket;
	private PrintWriter out;
	private BufferedReader in;
	String login;
	int port;
	String address;
	private Interfaces fram;

	/**
	 * 
	 * @param IPaddress
	 *            adresse ip entrer
	 * @param NBport
	 *            nombre de port choisi
	 * @param login
	 *            le login choisi
	 */

	public ClientsSocketThread(String IPaddress, int NBport, String login) {
		address = IPaddress;
		port = NBport;
		this.login = login;
	}

	public void run() {

		try {

			// creation d'un socket de connexion avec l'address ip du serveur et
			// le port de connexion
			socket = new Socket(address, port);

			// ouvrire le flux de sortie
			out = new PrintWriter(socket.getOutputStream());

			// ouvrire de le flux d'entré
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

			// envoie du login au serveur
			envoieDataServeur(login);
			System.out.println("connexion reussi");
			while (true) {

				String message = in.readLine();
				fram.setTextArea(message + "\n");
			}

		} catch (IOException e) {
			System.out.println("impossible de se connecter a cette adresse ou a se port");
		}
	}

	/**
	 * 
	 * @param message
	 *            envoie d'un message au serveur
	 */
	public void envoieDataServeur(String message) {
		out.println(message);
		out.flush();
	}


	@Override
	public void signalMessage(String string) {
		// TODO Auto-generated method stub

	}

	public void setview(Interfaces frame) {
		// TODO Auto-generated method stub
		this.fram = frame;

	}
}
