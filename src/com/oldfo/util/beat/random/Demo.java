package com.oldfo.util.beat.random;

import java.util.Random;

/**
 * Created by Administrator on 2015-04-17.
 */
public class Demo {
    public  static void main(String[] args){
        //System.out.println("ddd");
      //  for(int i=30;i<100;i++){
            calcOnce();
     //   }


    }

    private static void calcOnce() {
        int[] betRsArr = makeRandomRsArray(1000000);
     //   int calcLen = 60;
       // int diff = 28;
   //     boolean run = true;
        boolean occur = false;
        for(int calcLen=10;calcLen<10000;calcLen+=100){
            for(int diff=5;diff<10000;diff++){
                occur = false;
                for(int i=0;i<betRsArr.length-calcLen;i++){
                    int[] tmp = new int[2];
                    for(int j=0;j<calcLen;j++){
                        tmp[betRsArr[i+j]]++;
                    }
                    if(Math.abs(tmp[0]-tmp[1])>=diff){
                        //System.out.println("found:"+Math.abs(tmp[0]-tmp[1]));
                        occur = true;
                        //System.out.println("calc len ["+calcLen+"] times ["+diff+"] out!!");
                        break;
                    }
                }
                if(occur){

                }else{
                    System.out.println("calc len ["+calcLen+"], ["+diff+"] never occurs!! 百分比["+diff*100.0/calcLen+"]");
                    break;
                }

                //    run = true;
            }
        }

    }


    public static int[] makeRandomRsArray(int length){
        int[] rs = new int[length];
        Random r = new Random();

        for(int i=0;i<length;i++){
            rs[i]= r.nextInt(10)%2;
        }
        return rs;
    }
}
