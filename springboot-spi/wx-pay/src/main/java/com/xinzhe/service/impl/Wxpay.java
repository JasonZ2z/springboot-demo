package com.xinzhe.service.impl;

import com.xinzhe.spi.service.PayService;

public class Wxpay implements PayService {
    @Override
    public void pay() {
        System.out.println("Wx Pay");
    }
}