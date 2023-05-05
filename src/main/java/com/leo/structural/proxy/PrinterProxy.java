package com.leo.structural.proxy;

/**
 * 实现了printable接口，构造函数中设置打印机的名，但此时还没有生成“本人”
 * 不论setPrinterName还是getPrinterName方法被调用了多少次，都不会生成Printer类的实例。
 *
 * @author Leo
 * @date 2023/4/28 9:20
 */
public class PrinterProxy implements Printable {
    private String name;        // 名字
    private Printer real;       // 本人

    public PrinterProxy(){

    }
    public PrinterProxy(String name){
        this.name = name;
    }

    public synchronized void setPrinterName(String name){
        // 不为null也就是生成了本人
        if(real != null){
            real.setPrinterName(name);
        }
        // 为null则还没有生成本人
        this.name = name;
    }

    @Override
    public String getPrinterName() {
        return name;
    }

    @Override
    public void print(String string) {
        // 超出了代理人工作范围，因此会调用realize方法生成本人
        realize();
        real.print(string);
    }

    private synchronized void realize(){
        if(real == null){
            real = new Printer(name);
        }
    }
}
