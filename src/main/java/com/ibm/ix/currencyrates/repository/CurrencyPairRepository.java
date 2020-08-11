package com.ibm.ix.currencyrates.repository;

import com.ibm.ix.currencyrates.entity.CurrencyPair;
import org.springframework.data.domain.Page;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CurrencyPairRepository extends CrudRepository<CurrencyPair, Long> {

    List<CurrencyPair> findAll();



}
