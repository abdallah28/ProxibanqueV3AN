package model;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Class Client contient les Attributes des Clients incluant ses CoordonnÃ©es, avec les methodes d'avoic l'accÃ¨s Ã  ces Information.
 * Un client peut avoir les Comptes Bancaire et Il dÃ©pend sur le Conseiller CLient pour les dÃ©marches comme virement etc.. 
 */
import model.Compte;
import model.CompteCourant;
import model.CompteEpargne;

/**
 * @author AB_NC: Classe Client est une classe qui regroupe les cordonnées des
 *         clients. Elle contient les annotations necessaires pour être
 *         persister par JPA elle contient deux relations; la premiére est
 *         OneToMany avec la classe Compte. Car un client peut avoir plusieus
 *         comptes. La seconde est ManyToOne avec la classe Conseiller. De façon
 *         a ce que plusieurs clients peuvent avoir le même conseiller.
 */
@Entity
public class Client {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer iDClient;
	private String nomClient;
	private String prenomClient;
	private String adresseClient;
	private String emailClient;

	@OneToMany(mappedBy = "client", fetch=FetchType.LAZY,   cascade = { CascadeType.PERSIST })
	private Collection<Compte> listCompte = new ArrayList<>();

	public Client() {
		super();
	}

	public Client(Integer iDClient, String nomClient, String prenomClient, String adresseClient, String emailClient,
			Collection<Compte> listCompte) {
		super();
		this.iDClient = iDClient;
		this.nomClient = nomClient;
		this.prenomClient = prenomClient;
		this.adresseClient = adresseClient;
		this.emailClient = emailClient;
		this.listCompte = listCompte;
	}

	public void addCompte(Compte c) {
	c.setClient(this);
	listCompte.add(c);

	}

	public Integer getiDClient() {
		return iDClient;
	}

	public void setiDClient(Integer iDClient) {
		this.iDClient = iDClient;
	}

	public String getNomClient() {
		return nomClient;
	}

	public void setNomClient(String nomClient) {
		this.nomClient = nomClient;
	}

	public String getPrenomClient() {
		return prenomClient;
	}

	public void setPrenomClient(String prenomClient) {
		this.prenomClient = prenomClient;
	}

	public String getAdresseClient() {
		return adresseClient;
	}

	public void setAdresseClient(String adresseClient) {
		this.adresseClient = adresseClient;
	}

	public String getEmailClient() {
		return emailClient;
	}

	public void setEmailClient(String emailClient) {
		this.emailClient = emailClient;
	}

	public Collection<Compte> getListCompte() {
		return listCompte;
	}

	public void setListCompte(Collection<Compte> listCompte) {
		this.listCompte = listCompte;
	}

}
