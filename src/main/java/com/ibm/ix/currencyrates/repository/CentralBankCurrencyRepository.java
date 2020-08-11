package com.ibm.ix.currencyrates.repository;

import com.ibm.ix.currencyrates.entity.CentralBankCurrency;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CentralBankCurrencyRepository extends CrudRepository<CentralBankCurrency, Long> {

    List<CentralBankCurrency> findAll();
}

