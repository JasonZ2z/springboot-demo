package com.xinzhe.service.impl;

import com.xinzhe.spi.service.PayService;

public class Alipay implements PayService{

    @Override
    public void pay() {
        System.out.println("Ali Pay");
    }
}