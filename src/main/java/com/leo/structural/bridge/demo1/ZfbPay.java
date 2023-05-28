package com.leo.structural.bridge.demo1;

import com.leo.structural.bridge.demo1.IPayModel;
import com.leo.structural.bridge.demo1.Pay;

import java.math.BigDecimal;

/**
 * @Auther: Leo
 * @Date: 2023/5/28 15:51
 * @Description:
 */
public class ZfbPay extends Pay {
    public ZfbPay(IPayModel payModel) {
        super(payModel);
    }

    @Override
    public String transfer(String uid, String traceId, BigDecimal amount) {
        log.debug("模拟渠道支付划账开始，uid：{} traceId：{} amount：{}",uid,traceId,amount);
        boolean security = payModel.security(uid);
        log.debug("模拟支付宝渠道支付风险校验，uid：{} traceId：{} amount：{}",uid,traceId,security);
        if(!security){
            log.debug("模拟支付宝渠道支付划账拦截，uid：{} traceId：{} amount：{}",uid,traceId,amount);
            return "0001";
        }
        log.debug("模拟支付宝渠道支付划账成功，uid：{} traceId：{} amount：{}",uid,traceId,amount);
        return "0000";
    }
}
