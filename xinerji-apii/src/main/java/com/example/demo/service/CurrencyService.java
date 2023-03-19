package com.example.demo.service;

import com.example.demo.dao.CurrencyDAO;
import com.example.demo.entity.CurrencyEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CurrencyService {

    private final CurrencyDAO currencyDAO;

    public CurrencyService(CurrencyDAO currencyDAO) {
        this.currencyDAO = currencyDAO;
    }

    public  List<CurrencyEntity> saveAll(List<CurrencyEntity> currencyEntityList){
        return currencyDAO.saveAll(currencyEntityList);
    }


    public  List<CurrencyEntity> findByDate(String currencyDate){
        return currencyDAO.findAllByCurrencyDate(currencyDate);
    }
}
