package com.leo.structural.bridge.demo1;

import com.leo.structural.bridge.demo1.payModelImpl.PayFaceMode;
import com.leo.structural.bridge.demo1.payModelImpl.PayFingerPrintMode;

import java.math.BigDecimal;

/**
 * @Auther: Leo
 * @Date: 2023/5/28 16:06
 * @Description:
 */
public class test_pay {
    public static void main(String[] args) {
        System.out.println("模拟测试场景：微信支付、人脸支付。");
        Pay wxPay = new WxPay(new PayFaceMode());
        wxPay.transfer("wexin_20230528","202305281608",new BigDecimal(1638));
        System.out.println("模拟测试场景：支付宝支付、指纹支付。");
        Pay zfbPay = new WxPay(new PayFingerPrintMode());
        zfbPay.transfer("zfb_20230528","202305281611",new BigDecimal(181));
    }
}
