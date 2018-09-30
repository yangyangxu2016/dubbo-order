package com.example.dubbo.user;

import com.example.dubbo.order.DoOrderRequest;
import com.example.dubbo.order.DoOrderResponse;
import com.example.dubbo.order.IOrderServices;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class AppConsumer {


    public static void main(String[] args) {

        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("order-consumer.xml");

        //用户下单过过程
        IOrderServices iOrderServices = (IOrderServices) applicationContext.getBean("orderServices");

        DoOrderRequest request = new DoOrderRequest();
        request.setName("xuyy");
        DoOrderResponse response = iOrderServices.doOrder(request);
        System.out.println(response);

    }
}
