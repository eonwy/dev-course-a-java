package com.grepp.coffeemanager.domain.coffee;

import java.time.LocalDate;
import java.time.Month;

public class SeasonCoffee extends Coffee {
    private Month[] seasons;

    public SeasonCoffee(String name, int price, int purchasePrice, int stock, int safetyStock,
        Month[] seasons) {
        super(name, price, purchasePrice, stock, safetyStock);
        this.seasons = seasons;
    }

    public boolean notSeason() {
        Month now = LocalDate.now().getMonth();
        for(Month month : seasons) {
            if(month.equals(now)) return false;
        }
        return true;
    }
}
