package com.ibm.ix.currencyrates.controller;

import com.ibm.ix.currencyrates.entity.CurrencyPair;
import com.ibm.ix.currencyrates.service.CurrencyService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/currencies")
public class CurrencyController {

    private final CurrencyService currencyService;

    public CurrencyController(CurrencyService currencyService) {
        this.currencyService = currencyService;
    }

    @GetMapping
    public List<CurrencyPair> getCurrencyPair() {
        return currencyService.getCurrencyPair();
    }

    @PostMapping
    public CurrencyPair saveCurrencyPair() {
        return currencyService.saveCurrencyPair();
    }




}
