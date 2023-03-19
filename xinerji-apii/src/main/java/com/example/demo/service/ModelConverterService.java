package com.example.demo.service;

import com.example.demo.entity.CurrencyEntity;
import com.example.demo.model.Tarih_Date;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class ModelConverterService {
    public  List<CurrencyEntity> currencyXmlToEntity(Tarih_Date tarihDate,String currencyDAte){
        List<CurrencyEntity> currencyEntityList=new ArrayList<>();

        for (Tarih_Date.Currency currency :tarihDate.Currency) {
            CurrencyEntity currencyEntity=new CurrencyEntity();

            currencyEntity.setName(currency.Isim);
            currencyEntity.setUnit(String.valueOf(currency.Unit));
            currencyEntity.setCurrencyName(currency.CurrencyName);
            currencyEntity.setBanknoteBuying((currency.BanknoteBuying));
            currencyEntity.setBanknoteSelling((currency.BanknoteSelling));
            currencyEntity.setForexBuying((currency.ForexBuying));
            currencyEntity.setForexSelling((currency.ForexSelling));
            currencyEntity.setCrossRateUSD((currency.CrossRateUSD));
            currencyEntity.setCrossRateOther((currency.CrossRateOther));
            currencyEntity.setCurrencyDate(currencyDAte);
            currencyEntityList.add(currencyEntity);

        }
        return currencyEntityList;
    }
}
