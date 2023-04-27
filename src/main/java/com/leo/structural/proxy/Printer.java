package com.leo.structural.proxy;

/**
 * @author Leo
 * @date 2023/4/27 16:50
 */
public class Printer implements Printable {
    private String name;

    public Printer(){
        heavyJob("正在生成Printer的实例");
    }
    public Printer(String name) {
        this.name = name;
        heavyJob("正在生成Printer的实例（" + name + ")");
    }

    @Override
    public void setPrinterName(String name) {                   //  设置名字
        this.name = name;
    }

    @Override
    public String getPrinterName() {                            //  获取名字
        return name;
    }

    @Override
    public void print(String string) {                          //  显示打印机名字的文字
        System.out.println("====" + name + "===");
        System.out.println(string);
    }

    private void heavyJob(String msg){
        System.out.println(msg);
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            System.out.println(".");
        }
        System.out.println("结束。");
    }
}
