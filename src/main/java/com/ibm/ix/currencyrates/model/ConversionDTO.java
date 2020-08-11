package com.ibm.ix.currencyrates.model;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class ConversionDTO {
    private CurrencyDTO from;
    private CurrencyDTO to;
    private BigDecimal conversionRate;
    private BigDecimal fromAmount;
    private BigDecimal toAmount;

}
