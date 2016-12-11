package tn.iit.service;

import java.util.List;

import javax.ejb.Local;

import tn.iit.entity.CompteBancaire;

@Local
public interface CompteBancaireServiceLocal {
	boolean ajouter(CompteBancaire cb);

	List<CompteBancaire> getAll();

	CompteBancaire modifier(CompteBancaire cb);

	void supprimer(CompteBancaire cb);
	CompteBancaire getByRib(long rib);


}
