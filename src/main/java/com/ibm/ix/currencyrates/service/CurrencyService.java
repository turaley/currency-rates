package com.ibm.ix.currencyrates.service;

import com.ibm.ix.currencyrates.entity.CurrencyPair;
import com.ibm.ix.currencyrates.model.CurrencyDTO;
import com.ibm.ix.currencyrates.model.CurrencyRateDTO;

import java.util.List;

public interface CurrencyService {

    List<CurrencyDTO> getCurrencyList();
    List<CurrencyRateDTO> getCurrencyRateList();

    List<CurrencyPair> getCurrencyPair();

    CurrencyPair saveCurrencyPair();
    //  ConversionDTO convertCurrency(String currencyFrom, String currencyTo, BigDecimal amount);
}
