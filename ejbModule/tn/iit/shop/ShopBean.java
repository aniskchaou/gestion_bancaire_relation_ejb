package tn.iit.shop;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateful;

import tn.iit.service.CalculatriceBeanRemote;

/**
 * Session Bean implementation class ShopBean
 */
@Stateful
@LocalBean
public class ShopBean implements  ShopBeanLocal, Serializable {
	private static final long serialVersionUID = 1L;

	private List<ProduitDto> listProduit = new ArrayList<>();

	private double total;
	/**
	 * Default constructor.
	 */
	@EJB
	CalculatriceBeanRemote cal;

	public ShopBean() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void achatProduit(String nom, int quantite, double prix) {
		listProduit.add(new ProduitDto(nom, quantite, prix));

	}

	@Override
	public List<ProduitDto> listProduitAchete() {
		return listProduit;
	}

	@Override
	public boolean suppressionProduit(String produit, int quantite) {

		/*
		 * if (listProduit.equals(produit)) { int
		 * index=listProduit.indexOf(produit); listProduit.remove(index); if
		 * (listQuantite.get(index)==quantite) { listQuantite.remove(index);
		 * listPrix.remove(index); listProduit.remove(produit); return true; }
		 * else if (listQuantite.get(index)>quantite) {
		 * listQuantite.set(index,listQuantite.get(index)-quantite); return
		 * true; } }
		 */
		return false;

	}

	@Override
	public double getTotal() {
		total = 0;
		for (int i = 0; i < listProduit.size(); i++) {
			// somme+=listQuantite.get(i)*listPrix.get(i);
			total += cal.mult(listProduit.get(i).getPrix(), listProduit.get(i).getQte());
		}
		return total;
	}

	@Override
	public void payement(long rib) {
		// TODO Auto-generated method stub

	}

}