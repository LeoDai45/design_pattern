package com.leo.structural.decorator;

/**
 * @author Leo
 * @date 2023/4/24 16:17
 */
public class FullBorder extends Border {
    public FullBorder(Display display) {
        super(display);
    }

    // 字符数为被装饰物的字符数加上两侧边框的字符数
    @Override
    public int getColumns() {
        return 1 + display.getColumns() + 1;
    }

    // 行数为被装饰物的行数加上上下边框的行数
    @Override
    public int getRows() {
        return 1 + display.getRows() + 1;
    }

    // 指定的哪一行的字符串
    @Override
    public String getRowText(int row) {
        if(row == 0){ // 下边框
            return "+" + makeLine('-',display.getColumns()) + "+";
        }else if ( row == display.getRows() + 1){   // 上边框
            return  "+" + makeLine('-',display.getColumns()) + "+";
        }else{ // 其他边框
            return "|" + display.getRowText(row-1) + "|";
        }
    }

    //生成一个重复count次字符ch的字符串
    private String makeLine(char ch , int count){
        StringBuffer buf = new StringBuffer();
        for (int i = 0; i < count; i++) {
            buf.append(ch);
        }
        return buf.toString();
    }
}
