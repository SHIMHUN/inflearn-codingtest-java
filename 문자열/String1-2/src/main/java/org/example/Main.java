package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //1. 문자열 입력
        String str = sc.next();

        //2. for문으로 문자열 내 문자 접근
        String result = "";

//        for(int i=0; i<str.length(); i++){
//            //3.if문으로 대문자인지 판별
//            if(str.charAt(i) == Character.toUpperCase(str.charAt(i))){
//                result += Character.toLowerCase(str.charAt(i));
//            }else{
//                result += Character.toUpperCase(str.charAt(i));
//            }
//        }

//        for(char c : str.toCharArray()){
//            if(Character.isLowerCase(c)){
//                result+=Character.toUpperCase(c);
//            }else{
//                result+=Character.toLowerCase(c);
//            }
//        }

        //아스키 코드로(대 - 소 32바이트 차이)
        for(char c : str.toCharArray()){
            if(c>=65 && c<=90){ //대문자라면 소문자로
                result+=(char)(c+32); //char로 캐스팅 해주기
            }else{ //소문자는 대문자로
                result+=(char)(c-32);
            }
        }

        //4. 새로운 문자열 출력
        System.out.println(result);
    }
}