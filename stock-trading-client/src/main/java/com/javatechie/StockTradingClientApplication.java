package com.javatechie;

import com.javatechie.service.StockClientService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StockTradingClientApplication implements CommandLineRunner {

    private StockClientService stockClientService;

    public StockTradingClientApplication(StockClientService stockClientService) {
        this.stockClientService = stockClientService;
    }

    public static void main(String[] args) {
        SpringApplication.run(StockTradingClientApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
       // stockClientService.subscribeStockPrice("AMZN");
        stockClientService.startLiveTrading();
    }
}
