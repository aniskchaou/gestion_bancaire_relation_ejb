package tn.iit.ado;

import java.util.List;

import javax.ejb.Local;

import tn.iit.entity.CompteBancaire;

@Local
public interface CompteBancaireDaoLocal {
	boolean ajouter(CompteBancaire c);

	List<CompteBancaire> afficher();

	CompteBancaire modifier(CompteBancaire c);

	void supprimer(CompteBancaire c);
	CompteBancaire getByRib(long rib);
}
