package com.study.designpattern.strategy.factory;

import com.study.designpattern.strategy.interface1.IPackDataHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
/**
 * 一个数据包的解析，根据不同的 type，返回不同的 handler
 */
public class PackDataHandlerFactory {

    @Autowired
    private List<IPackDataHandler> iPackDataHandlers;

    public IPackDataHandler getPackDataHandler(String type){
        IPackDataHandler retHandler = null;
        for (IPackDataHandler handler : iPackDataHandlers){
            if (handler.getType().equals(type)){
                retHandler = handler;
                break;
            }
        }
        return retHandler;
    }
}
