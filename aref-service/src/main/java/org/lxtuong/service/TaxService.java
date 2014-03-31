package org.lxtuong.service;

public interface TaxService {
  public double calculate(double income, TaxRatePolicy policy);
}
