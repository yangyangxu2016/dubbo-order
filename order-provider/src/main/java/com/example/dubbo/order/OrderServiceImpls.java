package com.example.dubbo.order;

public class OrderServiceImpls implements IOrderServices {
    @Override
    public DoOrderResponse doOrder(DoOrderRequest request) {
        System.out.println("曾经来过ing"+request.toString());
        DoOrderResponse response = new DoOrderResponse();
        response.setCode("2000");
        response.setMemo("处理成功");

        return response;
    }
}
