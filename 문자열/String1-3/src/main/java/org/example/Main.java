package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

//        //1. split 사용
//        String[] s = sc.nextLine().split(" ");
//
//        int max_length = Integer.MIN_VALUE;
//        String result = "";
//        for(String word : s){
//            int length = word.length();
//
//            if(length > max_length){
//                max_length = length;
//                result = word;
//            }
//        }
//
//        System.out.println(result);

        //2. indexOf(), substring() 사용
        String str=sc.nextLine();
        String answer="";
        int m=Integer.MIN_VALUE, pos;
        while((pos=str.indexOf(' '))!=-1){
            String tmp=str.substring(0, pos);
            int len=tmp.length();
            if(len>m){
                m=len;
                answer=tmp;
            }
            str=str.substring(pos+1);
        }
        if(str.length()>m) answer=str;

        System.out.println(answer);
    }
}
