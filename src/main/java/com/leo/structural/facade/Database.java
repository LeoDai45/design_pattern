package com.leo.structural.facade;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * 获取指定数据库名所对应的properties实例。无法生成该类的任何实例，只能通过getProperties静态方法获取properties的实例。
 * @author Leo
 * @date 2023/5/5 15:15
 */
public class Database {
    private Database(){}         // 防止外部new 出database的实例，所以声明为private

    public static Properties getProperties(String dbName){
        String filename = dbName + ".txt";
        Properties prop = new Properties();
        try {
            prop.load(new FileInputStream("E:/leoWorkSpace/design_pattern/src/main/java/com/leo/structural/facade/"+ filename));
        } catch (IOException e) {
            System.out.println("Warning:" + filename + " is not found.");
        }
        return prop;
    }
}
