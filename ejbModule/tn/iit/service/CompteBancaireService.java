package tn.iit.service;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import tn.iit.ado.CompteBancaireDaoLocal;
import tn.iit.entity.CompteBancaire;

@Stateless
public class CompteBancaireService implements CompteBancaireServiceLocal {

	@EJB
	private CompteBancaireDaoLocal dao;

	public boolean ajouter(CompteBancaire cb) {
		dao.ajouter(cb);
		return true;
	}

	public List<CompteBancaire> getAll() {

		return dao.afficher();
	}

	public CompteBancaire modifier(CompteBancaire cb) {
		return dao.modifier(cb);
	}

	public void supprimer(CompteBancaire cb) {
		dao.supprimer(cb);
	}

	@Override
	public CompteBancaire getByRib(long rib) {
		return dao.getByRib(rib);
	}




}
