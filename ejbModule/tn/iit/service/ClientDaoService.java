package tn.iit.service;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import tn.iit.ado.ClientDaoLocal;
import tn.iit.ado.CompteBancaireDaoLocal;
import tn.iit.entity.Client;
import tn.iit.entity.CompteBancaire;

@Stateless
public class ClientDaoService implements ClientDaoLocalService {
	@EJB
	private ClientDaoLocal dao;
	

	@Override
	public boolean ajouter(Client c) {
		dao.ajouter(c);
		return false;
	}

	@Override
	public List<Client> afficher() {
		
		return dao.afficher();
	}

	@Override
	public CompteBancaire modifier(Client c) {
		dao.modifier(c);
		return null;
	}

	@Override
	public void supprimer(Client c) {
		dao.supprimer(c);
		
	}

	@Override
	public Client getByCin(long cin) {
		
		return dao.getByCin(cin);
	}

	
}
