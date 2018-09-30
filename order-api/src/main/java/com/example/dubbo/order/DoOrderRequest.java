package com.example.dubbo.order;

import java.io.Serializable;

/**
 * 请求
 * @author uinnova
 */
public class DoOrderRequest implements Serializable {
    private static final long serialVersionUID = -1479490038212402322L;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "DoOrderRequest{" +
                "name='" + name + '\'' +
                '}';
    }
}
