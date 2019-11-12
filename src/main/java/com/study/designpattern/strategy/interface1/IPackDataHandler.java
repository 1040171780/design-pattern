package com.study.designpattern.strategy.interface1;

import java.util.Map;

public interface IPackDataHandler {

    void handle(Map<String, Object> request);

    String getType();

}