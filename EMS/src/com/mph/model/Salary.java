package com.mph.model;

import java.io.Serializable;

public class Salary implements Serializable {
	private double basic;
	private double da;
	private double hra;
	private double pf;
	private double gross;
	private double net;
	
	public Salary() {
		super();
	}
	
	public Salary(double basic) {
		super();
		this.basic =basic;
		setDa(basic);
		setHra(basic);
		setPf(basic);
		
		this.da =getDa();
		this.hra =getHra();
		this.pf =getPf();

		setGross(this.basic, this.da, this.hra);
		setNet(this.gross,this.pf);
	}

	public double getBasic() {
		return basic;
	}

	public void setBasic(double basic) {
		this.basic = basic;
	}

	public double getDa() {
		return da;
	}

	public void setDa(double basic) {
		this.da = .3 * basic;
	}

	public double getHra() {
		return hra;
	}

	public void setHra(double basic) {
		this.hra = .4* basic;
	}

	public double getGross() {
		return gross;
	}

	public void setGross(double basic, double da, double hra) {
		this.gross = basic+da+hra;
	}

	public double getPf() {
		return pf;
	}

	public void setPf(double basic) {
		this.pf = .3 * basic;
	}
	
	public double getNet() {
		return net;
	}

	public void setNet(double da,double pf) {
		this.net = da-pf;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return " [basic=" + basic + ", da=" + da + ", hra=" + hra + ", gross=" + gross + ", net=" + net + "]";
	}
	
	

}
