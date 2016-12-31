package com.bakerbeach.market.tax.api.service;

import java.math.BigDecimal;

import com.bakerbeach.market.core.api.model.TaxCode;

public interface TaxService {

	public static final String DEFAULT_CUSTOMER_TAX_CODE = "NORMAL";

	BigDecimal getTaxRate(TaxCode productTaxCode, TaxCode customerTaxCode, String key);

}
