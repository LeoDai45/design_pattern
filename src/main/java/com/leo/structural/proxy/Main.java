package com.leo.structural.proxy;

/**
 * Main类通过printerProxy类使用Printer类。Main类实现会生成PrinterProxy，
 * 后调用getPrinterName方法获取打印机名并显示它。之后通过setPrinterName方法重新设置
 * 最后调用print方法输出”Hello.world.“
 *
 * @author Leo
 * @date 2023/4/28 10:00
 */
public class Main {
    public static void main(String[] args) {
        Printable p = new PrinterProxy("Alice");
        System.out.println("现在的名字是：" + p.getPrinterName() + "。");
        p.setPrinterName("Bob");
        System.out.println("现在的名字是：" + p.getPrinterName() + "。");
        p.print("Hello,world.");
    }
 }
