package com.qq.nacos.provider.controller;

import java.util.Scanner;

public class demo {
    static String a = "1234";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入第一个字符串");
        String fstr = "";
        String in = "";
        if(sc.hasNextLine()){
            in = sc.nextLine();
            System.out.println("输入查找的字符串");
            Scanner fsc = new Scanner(System.in);
            if(fsc.hasNextLine()){
                fstr = fsc.nextLine();
            }
        }
        System.out.println(index(in,fstr));
    }

    public static int index(String str,String f){
        char[] chars = str.toCharArray();
        char[] chars1 = f.toCharArray();
        int index = -1;
        int temp = 0;
        int sy = -1;
        for (int i = 0; i < chars1.length; i++) {
            for (int i1 = temp + i; i1 < chars.length; i1++) {
                if(chars1[i] == chars[i1]){
                    if(temp == 0){
                        temp = i1;
                    }
                    sy = i1;
                    break;
                }
            }
            if(temp != -1 && sy != -1){
                if(chars1[i] != chars[sy]){
                    index = -1;
                    break;
                }else {
                    index = temp;
                }
            }
        }
        return index;
    }
}
