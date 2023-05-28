package com.leo.structural.bridge.demo1.payModelImpl;

import com.leo.structural.bridge.demo1.IPayModel;
import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;

/**
 * @Auther: Leo
 * @Date: 2023/5/28 15:42
 * @Description:
 */

public class PayFaceMode implements IPayModel {
    protected Logger log = LoggerFactory.getLogger(PayFaceMode.class);
    @Override
    public boolean security(String uid) {
        log.debug("人脸支付，风控校验脸部识别");
        return true;
    }
}
