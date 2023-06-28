package com.leo.structural.flyweight.demo1;

/**
 * @author Leo
 * @date 2023/6/14 15:58
 */
public class BigString {
    // “大型字符"的数组
    private BigChar[] bigChars;
    // 构造函数
    public BigString(String string) {
        bigChars = new BigChar[string.length()];
        BigCharFactory factory = BigCharFactory.getInstance();
        for(int i = 0;i < bigChars.length; i++){
            bigChars[i] = factory.getBigChar(string.charAt(i));
        }
    }
    // 显示
    public void print(){
        for(int i =0 ; i < bigChars.length ; i++){
            bigChars[i].print();
        }
    }

}
