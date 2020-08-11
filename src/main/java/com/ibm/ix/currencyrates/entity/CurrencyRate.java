package com.ibm.ix.currencyrates.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;
import java.util.Date;

@Data
@Entity

public class CurrencyRate {

    @Id
    private Long currencyRateId;

    private Date rateDate;

    private BigDecimal currencyRate;

    @ManyToOne
    @JoinColumn(name = "currency_pair_id")
    private CurrencyPair currencyPair;
}
