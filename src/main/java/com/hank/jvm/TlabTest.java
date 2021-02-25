package com.hank.jvm;

import java.util.ArrayList;
import java.util.List;

public class TlabTest {

    public static void allocate() {
        List<String> list = new ArrayList<>(2);
    }

    public static void main(String[] args) {
        long sum = 0;
        for (int c = 0; c < 10; c++) {
            // TLAB分配 TLABSize=字节
            // 参数：-XX:+UseTLAB -XX:TLABSize=102400 -XX:TLABRefillWasteFraction=100 -XX:-DoEscapeAnalysis
            // 不使用参数：-XX:-UseTLAB -XX:TLABSize=102400 -XX:TLABRefillWasteFraction=100 -XX:-DoEscapeAnalysis
            long start = System.currentTimeMillis();
            for (int i = 0; i < 10000000; i++) {
                allocate();
            }

            long cost = System.currentTimeMillis() - start;
            System.out.println(cost);
            sum += cost;
        }
        System.out.println("sum:" + sum);
    }
}
