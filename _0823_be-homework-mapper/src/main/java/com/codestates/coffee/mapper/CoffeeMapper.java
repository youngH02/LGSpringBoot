package com.codestates.coffee.mapper;

import com.codestates.coffee.CoffeePatchDto;
import com.codestates.coffee.CoffeePostDto;
import com.codestates.coffee.CoffeeResponseDto;
import com.codestates.coffee.service.Coffee;
import org.mapstruct.Mapper;

import java.awt.*;

@Mapper(componentModel="spring")
public interface CoffeeMapper {

    //dto -> entity
    public Coffee coffeePostDtotoCoffee(CoffeePostDto coffeePostDto);
    public Coffee coffeePatchDtotoCoffee(CoffeePatchDto coffeePatchDto);
    //entity -> dto
    public CoffeeResponseDto coffeeToCoffeeResponseDto(Coffee coffee);
}
