package tn.iit.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name = "list", query = "select OBJECT(b) from CompteBancaire b")

public class CompteBancaire {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long rib;
	
	private double soldecompte;
   @ManyToOne(cascade = CascadeType.REMOVE)
	private Client client;
	public CompteBancaire() {
	}

	public double getSoldecompte() {
		return soldecompte;
	}
	public void setSoldecompte(double soldecompte) {
		this.soldecompte = soldecompte;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((client == null) ? 0 : client.hashCode());
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
		if (client == null) {
			if (other.client != null)
				return false;
		} else if (!client.equals(other.client))
			return false;
		if (rib != other.rib)
			return false;
		if (Double.doubleToLongBits(soldecompte) != Double.doubleToLongBits(other.soldecompte))
			return false;
		return true;
	}

	public CompteBancaire(double soldecompte,Client client) {
		super();
		this.soldecompte = soldecompte;
		this.client=client;
	}

	public long getRib() {
		return rib;
	}

	public void setRib(long rib) {
		this.rib = rib;
	}
	


}
