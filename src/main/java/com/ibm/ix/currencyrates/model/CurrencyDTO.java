package com.ibm.ix.currencyrates.model;

import lombok.Data;

import javax.persistence.Entity;

@Data
public class CurrencyDTO {

    private String code;
    private String name;
}
