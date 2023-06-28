package com.leo.structural.flyweight.demo1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Leo
 * @date 2023/6/14 15:16
 */
public class BigChar {
    // 字符名称
    private char charname;
    // 大型字符对应的字符串（由'#' '.' '\n'组成）
    private String fontdata;

    public BigChar(char charname) {
        this.charname = charname;
        try {
            BufferedReader reader = new BufferedReader(new FileReader("big" + charname + ".txt"));
            String line;
            StringBuffer buf = new StringBuffer();
            while((line = reader.readLine()) != null){
                buf.append(line);
                buf.append("\n");
            }
            reader.close();
            this.fontdata = buf.toString();
        }catch (IOException e){
            this.fontdata = charname + "?";
        }
    }

    public void print(){
        System.out.println(fontdata);
    }
}
