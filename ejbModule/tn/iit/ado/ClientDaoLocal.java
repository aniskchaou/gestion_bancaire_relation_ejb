package tn.iit.ado;

import java.util.List;

import javax.ejb.Local;

import tn.iit.entity.Client;
import tn.iit.entity.CompteBancaire;
@Local
public interface ClientDaoLocal {
	boolean ajouter(Client c);

	List<Client> afficher();

	Client modifier(Client c);

	void supprimer(Client c);
	Client getByCin(long cin);
}
