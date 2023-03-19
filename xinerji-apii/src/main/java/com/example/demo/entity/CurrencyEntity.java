package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "currency")
public class CurrencyEntity extends BaseEntity {
    @Column(name = "unit")
    private String unit;

    @Column(name = "name")
    private String name;
    @Column(name = "currencyName")
    private String currencyName;

    @Column(name = "forexBuying")
    private Double forexBuying;
    @Column(name = "forexSelling")
    private Double forexSelling;
    @Column(name = "banknoteBuying")
    private Double banknoteBuying;
    @Column(name = "banknoteSelling")
    private Double banknoteSelling;
    @Column(name = "crossRateUSD")
    private Double crossRateUSD;
    @Column(name = "crossRateOther")
    private Double crossRateOther;

    @Column(name="currencyDate")
    private String currencyDate;


    public String getCurrencyDate() {
        return currencyDate;
    }

    public CurrencyEntity setCurrencyDate(String currencyDate) {
        this.currencyDate = currencyDate;
        return this;
    }

    public CurrencyEntity() {
    }



    public String getUnit() {
        return unit;
    }

    public CurrencyEntity setUnit(String unit) {
        this.unit = unit;
        return this;
    }

    public String getName() {
        return name;
    }

    public CurrencyEntity setName(String name) {
        this.name = name;
        return this;
    }

    public String getCurrencyName() {
        return currencyName;
    }

    public CurrencyEntity setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
        return this;
    }

    public Double getForexBuying() {
        return forexBuying;
    }

    public CurrencyEntity setForexBuying(Double forexBuying) {
        this.forexBuying = forexBuying;
        return this;
    }

    public Double getForexSelling() {
        return forexSelling;
    }

    public CurrencyEntity setForexSelling(Double forexSelling) {
        this.forexSelling = forexSelling;
        return this;
    }

    public Double getBanknoteBuying() {
        return banknoteBuying;
    }

    public CurrencyEntity setBanknoteBuying(Double banknoteBuying) {
        this.banknoteBuying = banknoteBuying;
        return this;
    }

    public Double getBanknoteSelling() {
        return banknoteSelling;
    }

    public CurrencyEntity setBanknoteSelling(Double banknoteSelling) {
        this.banknoteSelling = banknoteSelling;
        return this;
    }

    public Double getCrossRateUSD() {
        return crossRateUSD;
    }

    public CurrencyEntity setCrossRateUSD(Double crossRateUSD) {
        this.crossRateUSD = crossRateUSD;
        return this;
    }

    public Double getCrossRateOther() {
        return crossRateOther;
    }

    public CurrencyEntity setCrossRateOther(Double crossRateOther) {
        this.crossRateOther = crossRateOther;
        return this;
    }
}
