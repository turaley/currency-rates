package com.ibm.ix.currencyrates.mapper;

import com.ibm.ix.currencyrates.entity.CentralBankCurrency;
import com.ibm.ix.currencyrates.model.CurrencyDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;


@Mapper(componentModel = "spring")
//@Mapper
public interface CurrencyMapper {

    @Mapping( target = "code", source = "currencyCode")
    @Mapping(target = "name" , source = "currencyName")
    CurrencyDTO toDTO(CentralBankCurrency centralBankCurrency);
}
