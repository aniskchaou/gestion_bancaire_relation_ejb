package tn.iit.service;

import java.util.List;

import javax.ejb.Local;

import tn.iit.entity.Client;
import tn.iit.entity.CompteBancaire;

@Local
public interface ClientDaoLocalService {
	boolean ajouter(Client c);

	List<Client> afficher();

	CompteBancaire modifier(Client c);

	void supprimer(Client c);
	Client getByCin(long cin);
}
