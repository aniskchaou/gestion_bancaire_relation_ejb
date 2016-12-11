package tn.iit.ado;

import java.util.List;

import javax.ejb.Singleton;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import tn.iit.entity.CompteBancaire;

@Singleton
public class CompteBancaireDao implements CompteBancaireDaoLocal {
	@PersistenceContext
	private EntityManager em;

	public boolean ajouter(CompteBancaire c) {
		em.persist(c);
		return true;
	}

	public List<CompteBancaire> afficher() {

		return em.createQuery("from CompteBancaire b", CompteBancaire.class ).getResultList();
	}

	public CompteBancaire modifier(CompteBancaire c) {
		return em.merge(c);
	}

	public void supprimer(CompteBancaire c) {
		//em.remove(c);
		em.remove(em.contains(c) ? c : em.merge(c));
	}

	@Override
	public CompteBancaire getByRib(long rib) {
		return em.find(CompteBancaire.class, rib);
	}

	

}
