package com.oldfo.util.beat.random;

import java.util.Random;

/**
 * Created by Administrator on 2015-04-17.
 */
public class Demo80 {
    public static void main(String[] args) {
        //System.out.println("ddd");
        //  for(int i=30;i<100;i++){
        calcOnce();
        //   }


    }

    private static void calcOnce() {
        int[] betRsArr = makeRandomRsArray(10000);
        //   int calcLen = 60;
        // int diff = 28;
        //     boolean run = true;

        int maxDiff = 0;
        int total = 0;
        for (int calcLen = 5; calcLen < 100; calcLen++) {
            maxDiff = 0;
            for(int i=0;i<betRsArr.length-calcLen;i++){
                total = 0;
                for(int j=0;j<calcLen;j++){
                    total+=betRsArr[i+j];
                }
                maxDiff = Math.abs(total - calcLen*810)>maxDiff?Math.abs(total - calcLen*810):maxDiff;
            }
            System.out.println(" ["+calcLen+"] qi diff max is ["+maxDiff+"]!");
        }

    }


    public static int[] makeRandomRsArray(int length) {
        int[] rs = new int[length];
        for (int i = 0; i < rs.length; i++) {
            rs[i] = genKenoRs();
        }
        return rs;
    }

    private static int genKenoRs() {
        Random r = new Random();
        int[] keno = new int[20];
        for (int i = 0; i < 20; i++) {
            keno[i] = r.nextInt(80) + 1;
        }
        int total = 0;
        for (int i = 0; i < keno.length; i++) {
            total += keno[i];
        }
        return total;
    }
}
