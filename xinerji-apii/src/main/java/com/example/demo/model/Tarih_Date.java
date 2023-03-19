package com.example.demo.model;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;
import java.util.List;


@XmlRootElement
public  class Tarih_Date {
    public List<Currency> Currency;
    public Date Tarih;
    public Date Date;
    public String Bulten_No;
    public String text;

    public static class Currency {
        public int Unit;
        public String Isim;
        public String CurrencyName;
        public double ForexBuying;
        public double ForexSelling;
        public double BanknoteBuying;
        public double BanknoteSelling;
        public double CrossRateUSD;
        public double CrossRateOther;
        public int CrossOrder;
        public String Kod;
        public String CurrencyCode;
        public String text;

    }
}






