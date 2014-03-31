package org.lxtuong.service;

import java.util.LinkedList;
import java.util.List;

public class FRTaxRatePolicy2012 implements TaxRatePolicy {

  @Override
  public List<TaxRate> getTaxRates() {
    List<TaxRate> taxRates = new LinkedList<TaxRate>();
    taxRates.add(new TaxRate(0, 5963, 0));
    taxRates.add(new TaxRate(5964, 11896, 0.055));
    taxRates.add(new TaxRate(11897, 26420, 0.14));
    taxRates.add(new TaxRate(26421, 70830, 0.30));
    taxRates.add(new TaxRate(70831, Double.POSITIVE_INFINITY, 0.41));
    return taxRates;
  }

}
