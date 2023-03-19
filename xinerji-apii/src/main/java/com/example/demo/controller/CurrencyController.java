package com.example.demo.controller;

import com.example.demo.entity.CurrencyEntity;
import com.example.demo.service.CurrencyApiService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@Api(value = "Currency Rest Controller", description = "REST API for Currency")
@RequestMapping("/api")
@RestController
public class CurrencyController {

    private final CurrencyApiService currencyApiService;

    public CurrencyController(CurrencyApiService currencyApiService) {
        this.currencyApiService = currencyApiService;
    }

    @ApiOperation(value = "Get Currency By Date ", response = Iterable.class, tags = "getCurrency")
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/currency")
    public List<CurrencyEntity> getCurrency(@ApiParam(value = "Date Format Should be YYYY-MM-DD as string")@RequestParam String date) throws Exception {

     return   currencyApiService.getCurrencyDataFromSystem(date);
    }



}
