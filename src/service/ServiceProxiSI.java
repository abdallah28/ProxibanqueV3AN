package service;

import java.util.ArrayList;

import javax.ejb.Stateful;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;

import dao.DaoClient;
import model.Client;
import model.Compte;
import model.CompteCourant;
import model.CompteEpargne;

/**
 * @author AB_NC: une classe services qui permet de réaliser les méthodes du
 *         CRUDE, Grâce à l'interface Idao et la classe qu'on instancié la
 *         classe Daoclient
 *
 */
@Stateful
public class ServiceProxiSI {

	ArrayList<Client> listClients = null;

	public ServiceProxiSI() {
		super();
	}

	public Client getClientById(int i) {
		return null;
	}

	/**
	 * @return un rapport (String) resumant le statut des soldes comptes clients
	 */
	public String auditSI() {
		return "nnn";
	}

	/**
	 * ajoute un client Ã  la liste de Clients, lui attribue un compte courant
	 * 
	 * @param c
	 */
	public void addClient(Client c) {

	}

	/**
	 * methode de service cRud
	 * 
	 * @return les informations de bas de notre liste Clients sous forme de chaine
	 *         de caractÃ¨res
	 */

	public ArrayList<Client> getListeClient() {
		
		
		
		DaoClient dao = new DaoClient();
	//	listClients=(ArrayList<Client>) dao.getAll();
		return listClients;
	}

}
