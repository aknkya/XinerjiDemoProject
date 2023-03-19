package com.example.demo.service;


import com.example.demo.entity.CurrencyEntity;
import com.example.demo.model.Tarih_Date;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXB;
import java.io.StringReader;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Service
public class CurrencyApiService {

    private final HttpClient httpClient;
    private final ModelConverterService modelConverterService;
    private final CurrencyService currencyService;


    public CurrencyApiService(HttpClient httpClient, ModelConverterService modelConverterService, CurrencyService currencyService) {
        this.httpClient = httpClient;
        this.modelConverterService = modelConverterService;
        this.currencyService = currencyService;
    }


    public List<CurrencyEntity> getCurrencyDataFromSystem(String date) throws Exception {
         date=reverseString(date).replace("-","");
        var currencyList = currencyService.findByDate(date);
        if(!currencyList.isEmpty()){
            return currencyList;
        }
        HttpRequest request = HttpRequest.newBuilder().GET().uri(URI.create("https://www.tcmb.gov.tr/kurlar/"+formatString(date)+"/"+date+".xml")).build();
        HttpResponse response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
        if (response.statusCode() != 200) {
            throw new Exception();
        }

        Tarih_Date currencyXmlModel = JAXB.unmarshal(new StringReader(response.body().toString()), Tarih_Date.class);
        List<CurrencyEntity> currencyEntityList = modelConverterService.currencyXmlToEntity(currencyXmlModel,date);
        return currencyService.saveAll(currencyEntityList);

    }

    private String formatString(String string){
        return string.substring(4,8)+string.substring(2,4);
    }

    public static String reverseString(String dateString) {
        LocalDate date = LocalDate.parse(dateString);

        // Define the desired output format
        DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        // Format the date as a string in the desired output format
        String formattedDate = date.format(outputFormatter);

        return formattedDate;
    }


}
