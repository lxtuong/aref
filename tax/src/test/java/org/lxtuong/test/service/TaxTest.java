package org.lxtuong.test.service;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lxtuong.service.FRTaxRatePolicy2012;
import org.lxtuong.service.TaxService;
import org.lxtuong.service.TaxServiceImpl;

public class TaxTest {
  private static final double DELTA = 0.5;

  @Test
  public void frPolicy2012() {
    TaxService taxService = new TaxServiceImpl();
    double taxIncome = taxService.calculate(32019, new FRTaxRatePolicy2012());
    assertEquals(4039, taxIncome, DELTA);
  }
}
