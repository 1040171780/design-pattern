package com.study.designpattern.strategy.test;

import com.study.designpattern.strategy.factory.PackDataHandlerFactory;
import com.study.designpattern.strategy.interface1.IPackDataHandler;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Client {

    @Autowired
    private PackDataHandlerFactory packDataHandlerFactory;

    private static Map<String, Object> request;

    static {
        request = new HashMap<>();
        request.put("tableName", "material");
    }

    @Test
    public void test() throws Exception {
        String type = (String)request.get("tableName");

        if ("fitting".equals(type)){
            System.out.println("Fitting data handler...");
        } else if ("material".equals(type)){
            System.out.println("Material data handler...");
        }

        /*
         * 用下面的代码代替 if else
         *
         * 此处if else 代码量少，所以感觉没有什么区别，甚至使用策略模式代码更加繁琐
         * 但是当 if else 的处理逻辑非常复杂的时候，使用策略模式就可以通过新增一个类来实现新增的逻辑处理，
         * 不用在原有的代码上修改，这也符合软件设计的对新增开放，对修改关闭的原则
         */
        IPackDataHandler handler = packDataHandlerFactory.getPackDataHandler(type);
        handler.handle(request);

    }

}
