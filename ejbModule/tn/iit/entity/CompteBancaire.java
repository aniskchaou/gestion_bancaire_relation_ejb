package tn.iit.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name = "list", query = "select OBJECT(b) from CompteBancaire b")

public class CompteBancaire {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long rib;
	private String nomclient;
	private double soldecompte;

	public CompteBancaire() {
	}

	public CompteBancaire(String nomclient, double soldecompte) {
		super();

		this.nomclient = nomclient;
		this.soldecompte = soldecompte;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nomclient == null) ? 0 : nomclient.hashCode());
		result = prime * result + (int) (rib ^ (rib >>> 32));
		long temp;
		temp = Double.doubleToLongBits(soldecompte);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		CompteBancaire other = (CompteBancaire) obj;
		if (nomclient == null) {
			if (other.nomclient != null)
				return false;
		} else if (!nomclient.equals(other.nomclient))
			return false;
		if (rib != other.rib)
			return false;
		if (Double.doubleToLongBits(soldecompte) != Double.doubleToLongBits(other.soldecompte))
			return false;
		return true;
	}

	public long getRib() {
		return rib;
	}

	public void setRib(long rib) {
		this.rib = rib;
	}

	public String getNomclient() {
		return nomclient;
	}

	public void setNomclient(String nomclient) {
		this.nomclient = nomclient;
	}

	public double getSoldecompte() {
		return soldecompte;
	}

	public void setSoldecompte(double soldecompte) {
		this.soldecompte = soldecompte;
	}

}
