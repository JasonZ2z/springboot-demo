package com.xinzhe.spi.test;

import com.xinzhe.service.impl.Alipay;
import com.xinzhe.spi.service.PayService;

import java.util.ServiceLoader;

public class TestService {

    public static void main(String[] args) {
        ServiceLoader<PayService> load = ServiceLoader.load(PayService.class, Alipay.class.getClassLoader());
        for (PayService payService : load) {
            payService.pay();
        }
    }
}