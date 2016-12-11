package tn.iit.service;

import javax.ejb.Remote;

@Remote
public interface CalculatriceBeanRemote {
int sm(int a,int b);
int sous(int a,int b);
double mult(double x,double y);
}
