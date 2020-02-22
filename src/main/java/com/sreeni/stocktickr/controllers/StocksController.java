package com.sreeni.stocktickr.controllers;

import com.sreeni.stocktickr.models.Stock;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StocksController {

    @GetMapping("/api/stocks/{code}")
    public ResponseEntity<Stock> getStockPriceByCode(@PathVariable String code) {

        System.out.println(code);

        if(code.equals("aapl")) {
            Stock stock = new Stock();
            stock.setCode("AAPL");
            stock.setPrice("25.05");
            return new ResponseEntity<>(stock, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

    }

    @GetMapping("/api/stocks/")
    public List<Stock> getStocks() {

        List<Stock> stocks = new ArrayList<>();

        Stock stock = new Stock();
        stock.setCode("AAPL");
        stock.setPrice("25.05");

        Stock stock2 = new Stock();
        stock2.setCode("GOGL");
        stock2.setPrice("99.05");

        stocks.add(stock);
        stocks.add(stock2);

        return stocks;
    }
}
