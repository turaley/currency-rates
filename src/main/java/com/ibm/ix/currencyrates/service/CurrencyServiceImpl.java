package com.ibm.ix.currencyrates.service;

import com.ibm.ix.currencyrates.entity.CurrencyPair;
import com.ibm.ix.currencyrates.mapper.CurrencyMapper;
import com.ibm.ix.currencyrates.mapper.CurrencyRateMapper;
import com.ibm.ix.currencyrates.model.CurrencyDTO;
import com.ibm.ix.currencyrates.model.CurrencyRateDTO;
import com.ibm.ix.currencyrates.repository.CentralBankCurrencyRepository;
import com.ibm.ix.currencyrates.repository.CurrencyPairRepository;
import com.ibm.ix.currencyrates.repository.CurrencyRateRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CurrencyServiceImpl implements CurrencyService {

    private CentralBankCurrencyRepository centralBankCurrencyRepository;
    private CurrencyMapper currencyMapper;

    private CurrencyRateRepository currencyRateRepository;
    private CurrencyRateMapper currencyRateMapper;
    private final CurrencyPairRepository currencyPairRepository;

    public CurrencyServiceImpl(CentralBankCurrencyRepository centralBankCurrencyRepository, CurrencyMapper currencyMapper, CurrencyRateRepository currencyRateRepository, CurrencyPairRepository currencyPairRepository) {
        this.centralBankCurrencyRepository = centralBankCurrencyRepository;
        this.currencyMapper = currencyMapper;
        this.currencyRateRepository = currencyRateRepository;
        this.currencyPairRepository = currencyPairRepository;
    }

    @Override
    public List<CurrencyDTO> getCurrencyList() {

        List<CurrencyDTO> currDTOList = centralBankCurrencyRepository.findAll().stream()
                                                                      .map(currencyMapper::toDTO)
                                                                      .collect(Collectors.toList());
        return currDTOList;
    }

    @Override
    public List<CurrencyRateDTO> getCurrencyRateList() {
        List<CurrencyRateDTO> rateDTOList = currencyRateRepository.findAll().stream()
                                                            .map(currencyRateMapper::toDTO)
                                                            .collect(Collectors.toList());


        return rateDTOList;
    }

    @Override
    public List<CurrencyPair> getCurrencyPair() {

        return currencyPairRepository.findAll();
    }

    @Override
    public CurrencyPair saveCurrencyPair() {
        CurrencyPair currencyPair = new CurrencyPair();
        currencyPair.setCurrencyPairId(123L);
        return currencyPairRepository.save(currencyPair);
    }

/*    @Override
    public ConversionDTO convertCurrency(String currencyFrom, String currencyTo, BigDecimal amount) {
        return null;
    }*/
}
