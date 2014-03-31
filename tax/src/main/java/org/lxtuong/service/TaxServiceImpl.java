package org.lxtuong.service;


public class TaxServiceImpl implements TaxService {

  @Override
  public double calculate(double income, TaxRatePolicy policy) {    
    
    double taxIncome = 0;    
    for (TaxRate taxRate : policy.getTaxRates()) {
      if (income <= taxRate.getMaxIncome()) {
        taxIncome += (income - taxRate.getMinIncome()) * taxRate.getRate();
        break; // stop in this rate
      }

      taxIncome += (taxRate.getMaxIncome() - taxRate.getMinIncome()) * taxRate.getRate();
    }
    return taxIncome;    
  }
}
