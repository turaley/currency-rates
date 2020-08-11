package com.ibm.ix.currencyrates.entity;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "cbr_currency")
public class CentralBankCurrency {

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "currency_code")
    private String currencyCode;

    @Column(name = "currency_num_code")
    private String currencyNumCode;

    @Column(name = "currency_name")
    private String currencyName;

}
