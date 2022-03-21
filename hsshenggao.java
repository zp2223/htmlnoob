package garammar_demo;

import java.util.Scanner;

public class hsshenggao {
    public static void main(String[] args) {
        Scanner ac=new Scanner(System.in);
        int a=ac.nextInt();
        int b=ac.nextInt();
        int c=ac.nextInt();

        int s=a>b?a:b;
        int q=s>c?s:c;
        System.out.println("最高身高:"+q);
    }
}
