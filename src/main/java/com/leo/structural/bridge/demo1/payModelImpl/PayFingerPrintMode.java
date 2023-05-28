package com.leo.structural.bridge.demo1.payModelImpl;

import com.leo.structural.bridge.demo1.IPayModel;
import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;

/**
 * @Auther: Leo
 * @Date: 2023/5/28 15:42
 * @Description:
 */

public class PayFingerPrintMode implements IPayModel {
    protected Logger log = LoggerFactory.getLogger(PayFingerPrintMode.class);
    @Override
    public boolean security(String uid) {
        log.debug("指纹支付，风控校验脸部识别");
        return true;
    }
}
