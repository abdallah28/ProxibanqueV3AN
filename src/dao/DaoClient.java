package dao;

import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import model.Client;
import model.CompteCourant;
import model.CompteEpargne;

/**
 * @author AB_NC: Classe DaoClient est une classe qui implemente l'interface
 *         Idao. Cette classe joue l'interfce entre le monde objet et le monde
 *         relationnel
 *
 */
@Stateful
public class DaoClient implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@PersistenceUnit
	private EntityManagerFactory emf;
	

	public boolean create(Object el) {
		// TODO Auto-generated method stub
		return false;
	}


	public boolean delete(Object el) {
		// TODO Auto-generated method stub
		return false;
	}


	public Object update(Object el) {
		// TODO Auto-generated method stub
		return null;
	}


	public Collection<Client> getAll() {
		EntityManager em = emf.createEntityManager();
		CompteCourant c1 = new CompteCourant();
		CompteEpargne c2 = new CompteEpargne();
		c1.setSolde(101.1);
		c2.setSolde(202.2);
		System.out.println("solde : " + c1.getSolde());
		Client cl1 = new Client();
		Client cl2 = new Client();
		cl1.setNomClient("bob");
		cl2.setNomClient("john");
		cl1.addCompte(c1);
		cl1.addCompte(c2);
		System.out.println(cl1 + "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
		System.out.println(c1);
		System.out.println(c2);
		System.out.println("emf : " + emf);
		
		
		em.persist(cl1);em.persist(cl2);

		Collection<Client> cls;
		
		TypedQuery<Client> query = em.createQuery("from Client", Client.class); // !!
		System.out.println("nom du client lu dans la BDD : "+query.getResultList().get(0).getNomClient()+"  "+query.getResultList().get(0).getListCompte());
		
		cls  = query.getResultList();
		// System.out.println(cls);

		return cls;
		
	}


	public Object getById(long id) {

		return null;
	}

}
