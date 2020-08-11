package com.ibm.ix.currencyrates.repository;

import com.ibm.ix.currencyrates.entity.CurrencyRate;
import com.ibm.ix.currencyrates.model.CurrencyRateDTO;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CurrencyRateRepository extends CrudRepository<CurrencyRate, Long> {

    List<CurrencyRate> findAll();

}
