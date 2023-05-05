package com.leo.structural.facade;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/**
 * 使用Database类和HtmlWriter类来生成指定用户的web页面
 * @author Leo
 * @date 2023/5/5 16:19
 */
public class PageMaker {
    private PageMaker(){}           // 防止外部new出PageMaker的实例，所以声明为private
    public static void makeWelcomPage(String mailaddr, String filename){
        try {
            Properties mailprop = Database.getProperties("maildata");
            String username = mailprop.getProperty(mailaddr);
            HtmlWriter writer = new HtmlWriter(new FileWriter(filename));
            writer.title("Welcome to "+ username + " `s page!");
            writer.paragraph(username + "欢迎来到" + username + "的主页。");
            writer.paragraph( "等着你的邮件哦");
            writer.mailto(mailaddr,username);
            writer.close();
            System.out.println(filename + " is created for " + mailaddr + "{" + username+ "}");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
