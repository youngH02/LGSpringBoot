package com.codestates.coffee.service;

import com.codestates.member.entity.Member;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoffeeService {


    public Coffee createCoffee(Coffee coffee) {

        return coffee;
    }

    public Coffee updateCoffee(Coffee coffee) {
        return coffee;
    }

    public Coffee findCoffee(long coffeeId) {
        return new Coffee(coffeeId,"아메리카노","Americano",2500);
    }

    public List<Coffee> findCoffees() {
        List<Coffee> coffees = List.of(
                new Coffee(1L, "아메리카노","Americano",2500),
                new Coffee(2L, "캐러멜 라뗴", "Carmel Latte", 5000)
        );
        return coffees;
    }

    public void deleteCoffee(long coffeeId){

    }



}
