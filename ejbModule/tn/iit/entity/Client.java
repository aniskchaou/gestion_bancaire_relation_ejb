package tn.iit.entity;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
@Entity

public class Client {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	long cin;
	String nom;
	String prenom;
	String adresse;
	@OneToMany(mappedBy="client",fetch = FetchType.EAGER,cascade = CascadeType.ALL)
   private  Collection<CompteBancaire> comptes;
	
	
	
	public Client() {
		// TODO Auto-generated constructor stub
	}
	public long getCin() {
		return cin;
	}
	public void setCin(long cin) {
		this.cin = cin;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public Collection<CompteBancaire> getComptes() {
		return comptes;
	}
	public void setComptes(Collection<CompteBancaire> comptes) {
		this.comptes = comptes;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((adresse == null) ? 0 : adresse.hashCode());
		result = prime * result + (int) (cin ^ (cin >>> 32));
		result = prime * result + ((comptes == null) ? 0 : comptes.hashCode());
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		result = prime * result + ((prenom == null) ? 0 : prenom.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Client other = (Client) obj;
		if (adresse == null) {
			if (other.adresse != null)
				return false;
		} else if (!adresse.equals(other.adresse))
			return false;
		if (cin != other.cin)
			return false;
		if (comptes == null) {
			if (other.comptes != null)
				return false;
		} else if (!comptes.equals(other.comptes))
			return false;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		if (prenom == null) {
			if (other.prenom != null)
				return false;
		} else if (!prenom.equals(other.prenom))
			return false;
		return true;
	}
	public Client( String nom, String prenom, String adresse) {
		super();
		
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		
	}

	

}
