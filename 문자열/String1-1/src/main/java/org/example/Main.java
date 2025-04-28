package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str = sc.next().toLowerCase();

//        char c = sc.next().toLowerCase().charAt(0); /환문자열을 먼저 소문자 변환
        char c = Character.toLowerCase(sc.next().charAt(0)); //char 가져온 다음에 소문자 변

        int cnt=0;

//        //1. 일반 for문
//        for(int i=0; i<str.length(); i++){
//            if(str.charAt(i)==c){
//                cnt++;
//            }
//        }

        //2. 향상된 for문
        for(char x : str.toCharArray()){ //순회 객체는 iterator가 와야함
            if(x==c){
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}