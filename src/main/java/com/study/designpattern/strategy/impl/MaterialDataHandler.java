package com.study.designpattern.strategy.impl;

import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class MaterialDataHandler extends AbstractPackDataHandler {

    @Override
    public String getType() {
        return "material";
    }

    @Override
    public void handle(Map<String, Object> request) {
        System.out.println(request);
        System.out.println("Material data handler...");
    }
}