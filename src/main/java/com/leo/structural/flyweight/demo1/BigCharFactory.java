package com.leo.structural.flyweight.demo1;

import java.util.HashMap;

/**
 * @author Leo
 * @date 2023/6/14 15:43
 */
public class BigCharFactory {
    // 管理已经生成的BigChar 的实例
    private HashMap pool = new HashMap();
    // singleton 模式
    private static BigCharFactory singleton = new BigCharFactory();
    // 构造函数
    private BigCharFactory(){
    }
    // 获取唯一的实例
    public static BigCharFactory getInstance(){
        return singleton;
    }
    // 生成（共享）BigChar类的实例
    public synchronized BigChar getBigChar(char charname){
        BigChar bc = (BigChar) pool.get("" + charname);
        if(bc ==null){
            bc = new BigChar(charname);
            pool.put("" + charname,bc);
        }
        return bc;
    }

}
