package tn.iit.service;

import javax.ejb.Local;

@Local
public interface CalculatriceBeanLocal {
	int sm(int a,int b);
	int sous(int a,int b);
	int mult(int a,int b);
}
