package tn.iit.ado;

import java.util.List;

import javax.ejb.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import tn.iit.entity.Client;
import tn.iit.entity.CompteBancaire;
@Singleton
public class ClientDao implements ClientDaoLocal {
	@PersistenceContext
	private EntityManager em;
	public ClientDao() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean ajouter(Client c) {
		em.persist(c);
		return false;
	}

	@Override
	public List<Client> afficher() {
		return em.createQuery("from Client b", Client.class ).getResultList();
		
	}

	@Override
	public Client modifier(Client c) {
		return em.merge(c);
	}

	@Override
	public void supprimer(Client c) {
		em.remove(em.contains(c) ? c : em.merge(c));
		
	}

	@Override
	public Client getByCin(long cin) {
		// TODO Auto-generated method stub
		return em.find(Client.class, cin);
	}

	
}
