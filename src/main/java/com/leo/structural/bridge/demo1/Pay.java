package com.leo.structural.bridge.demo1;

import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;

import java.math.BigDecimal;

/**
 * @Auther: Leo
 * @Date: 2023/5/28 15:39
 * @Description:
 */
public abstract class Pay {
    protected Logger log = LoggerFactory.getLogger(Pay.class);
    public IPayModel payModel;

    public Pay(IPayModel payModel){
        this.payModel = payModel;
    }

    public abstract String transfer(String uid, String traceId, BigDecimal amount);
}
