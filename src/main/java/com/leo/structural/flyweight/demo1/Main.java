package com.leo.structural.flyweight.demo1;

/**
 * @author Leo
 * @date 2023/6/14 16:11
 */
public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Usage： java Main digits");
            System.out.println("Example： java Main 20230614");
            System.exit(0);
        }
        BigString bs = new BigString(args[0]);
        bs.print();

    }
}
