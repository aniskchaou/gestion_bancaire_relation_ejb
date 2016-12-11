package tn.iit.shop;

import java.util.List;

import javax.ejb.Local;

@Local
public interface ShopBeanLocal {
	 void achatProduit(String produit, int quantite, double prix);
	 List<ProduitDto> listProduitAchete();
	 boolean suppressionProduit(String produit, int quantite);
	 double getTotal();
	 void payement(long rib);
}
