package com.oldfo.util.beat.random;

import java.util.Random;

/**
 * Created by HuBin on 2015-04-20.
 */
public class Calc {

    public static void main(String[] args) { //System.out.println("ddd");
        for (int i = 0; i < 100; i++) {
            calcOnce();
        }
    }

    public static int[] makeRandomRsArray(int length) {
        int[] rs = new int[length];
        Random r = new Random();
        for (int i = 0; i < length; i++) {
            rs[i] = r.nextInt(10) % 2;
        }
        return rs;
    }


    private static void calcOnce() {
        int[] betRsArr = makeRandomRsArray(1000000);
        int calcLen = 30;
        int diff = 22;

        for (int i = 0; i < betRsArr.length - calcLen; i++) {
            int[] tmp = new int[2];
            for (int j = 0; j < calcLen; j++) {
                tmp[betRsArr[i + j]]++;
            }
            if (Math.abs(tmp[0] - tmp[1]) >= diff) {
                System.out.println("found:" + Math.abs(tmp[0] - tmp[1]));
            } //            System.out.print(rs[i]+" ");
            // }
        }
    }
}