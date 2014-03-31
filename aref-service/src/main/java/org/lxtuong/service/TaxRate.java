package org.lxtuong.service;

public class TaxRate {
	private double minIncome;
	private double maxIncome;
	private double rate;
	
	public TaxRate(double min, double max, double rate){
		this.minIncome = min;
		this.maxIncome = max;
		this.rate = rate;
	}
	
	public double getMinIncome() {
		return minIncome;
	}

	public void setMinIncome(double minIncome) {
		this.minIncome = minIncome;
	}

	public double getMaxIncome() {
		return maxIncome;
	}

	public void setMaxIncome(double maxIncome) {
		this.maxIncome = maxIncome;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}
}
