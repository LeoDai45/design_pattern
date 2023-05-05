package com.leo.structural.facade;

import java.io.IOException;
import java.io.Writer;

/**
 * 用于编写简单的web页面，在生成HtmlWriter类的实例时赋予其Writer，然后使用该writer输出html
 * @author Leo
 * @date 2023/5/5 15:23
 */
public class HtmlWriter {
    private Writer writer;

    public HtmlWriter(Writer writer){           // 构造函数
        this.writer = writer;
    }

    public void title(String title) throws IOException {        //  输出标题
        writer.write("<html>");
        writer.write("<head>");
        writer.write("<title>" + title + "</title>");
        writer.write("</head>");
        writer.write("<body>\n");
        writer.write("<h1>" + title + "</h1>\n");
    }

    public void paragraph(String msg) throws IOException {      //  输出段落
        writer.write("<p>" + msg + "</p>\n");
    }

    public void link(String href,String  caption) throws IOException {      //  输出 超链接
        paragraph("<a href=\"" + href + "\">" + caption + "</a>");
    }

    public void mailto(String mailaddr,String username) throws IOException {      //  输出邮件地址
        link("mailto:" + mailaddr , username);
    }

    public void close() throws IOException{         // 结果输出
        writer.write("</body>");
        writer.write("</html>\n");
        writer.close();
    }
}
