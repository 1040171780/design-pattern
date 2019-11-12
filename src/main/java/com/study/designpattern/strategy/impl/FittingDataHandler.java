package com.study.designpattern.strategy.impl;

import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class FittingDataHandler extends AbstractPackDataHandler {

    @Override
    public String getType() {
        return "fitting";
    }

    @Override
    public void handle(Map<String, Object> request){
        System.out.println(request);
        System.out.println("Fitting data handler...");
    }

}