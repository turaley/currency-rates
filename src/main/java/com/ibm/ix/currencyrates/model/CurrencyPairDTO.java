package com.ibm.ix.currencyrates.model;


import com.ibm.ix.currencyrates.entity.CentralBankCurrency;
import lombok.Data;

@Data
public class CurrencyPairDTO {
    private CentralBankCurrency currencyFrom;
    private Integer currencyFromMultiplicator;
    private CentralBankCurrency currencyTo;
    private Integer currencyToMultiplicator;
}
