package com.ibm.ix.currencyrates.mapper;


import com.ibm.ix.currencyrates.entity.CurrencyPair;
import com.ibm.ix.currencyrates.model.CurrencyPairDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CurrencyPairMapper {

    public CurrencyPairDTO toDTO(CurrencyPair currencyPair);
}
