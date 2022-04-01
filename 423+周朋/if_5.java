package loop;

import java.util.Scanner;

public class if_5 {
    public static void main(String[] args) {
        Scanner H=new Scanner(System.in);
        System.out.println("小明的分数：");
        int A =H.nextInt();

        if(A<60){
            System.out.println("一顿教育");
        }
        if (A>=60&&A<70){
            System.out.println("仍需努力");
        }
        if (A>=70&&A<80){
            System.out.println("继续努力");
        }
        if(A>=80&&A<90){
            System.out.println("还可以");
        }
        if (A>=90&&A<100){
            System.out.println("可以了");
        }
        if (A==100){
            System.out.println("很棒了");
        }

    }
}
