package com.ibm.ix.currencyrates.mapper;


import com.ibm.ix.currencyrates.entity.CurrencyPair;
import com.ibm.ix.currencyrates.entity.CurrencyRate;
import com.ibm.ix.currencyrates.model.CurrencyDTO;
import com.ibm.ix.currencyrates.model.CurrencyRateDTO;
import org.mapstruct.Mapper;

import javax.persistence.ManyToOne;
import java.math.BigDecimal;
import java.util.Date;

@Mapper
public interface CurrencyRateMapper {


    public CurrencyRateDTO toDTO(CurrencyRate currencyRate);

// CurrencyRate
//    private Long currencyRateId;
//    private Date rateDate;
//    private BigDecimal currencyRate;
//    private CurrencyPair currencyPair;


//    private CurrencyDTO from;
//    private CurrencyDTO to;
//    private Integer fromMultiplication = 1;
//    private Integer toMultiplication = 1;
//    private BigDecimal conversionRate;
}
