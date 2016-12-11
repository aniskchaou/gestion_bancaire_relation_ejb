package tn.iit.service;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class CalculatriceBean
 */
@Stateless
@LocalBean
public class CalculatriceBean implements CalculatriceBeanRemote, CalculatriceBeanLocal {

    /**
     * Default constructor. 
     */
    public CalculatriceBean() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public int sm(int a, int b) {
		
		return a+b;
	}

	@Override
	public int sous(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	public int mult(int a, int b) {
		// TODO Auto-generated method stub
		return a*b;
	}

	@Override
	public double mult(double x,double y) {
		return x * y;
	}

}
