package com.ibm.ix.currencyrates.model;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class CurrencyRateDTO {
    private CurrencyDTO from;
    private CurrencyDTO to;

    private Integer fromMultiplication = 1;
    private Integer toMultiplication = 1;

    private BigDecimal conversionRate;
}
