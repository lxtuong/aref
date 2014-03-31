package org.lxtuong.service;


public class TaxServiceMax1000 implements TaxService {
  private final double MAX_INCOME = 1000;
  
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
    if (taxIncome >= MAX_INCOME){
      taxIncome = MAX_INCOME;
    }
    return taxIncome;    
  }

}
