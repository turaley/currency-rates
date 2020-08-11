package com.ibm.ix.currencyrates.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "currency_pair")
public class CurrencyPair {

    @Id
    private Long currencyPairId;

    @ManyToOne
    @JoinColumn(name = "currency_from_id")
    private CentralBankCurrency currencyFrom;

    private Integer currencyFromMultiplicator = 1;

    @ManyToOne
    @JoinColumn(name = "currency_to_id")
    private CentralBankCurrency currencyTo;

    private Integer currencyToMultiplicator = 1;

    @ManyToOne
    @JoinColumn(name = "main_currency_id")
    private CentralBankCurrency mainCurrencyCode;

    @OneToMany(mappedBy = "currencyPair")
    private List<CurrencyRate> currencyRates;



}
