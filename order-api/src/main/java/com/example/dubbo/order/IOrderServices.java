package com.example.dubbo.order;

public interface IOrderServices {


    /**
     * 下单操作
     */
    DoOrderResponse doOrder(DoOrderRequest request);


}
