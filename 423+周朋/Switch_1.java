package loop;

import java.util.Scanner;

public class Switch_1 {
    public static void main(String[] args) {
        Scanner H=new Scanner(System.in);
        System.out.println("请输入成绩：");

        int g = H.nextInt();
        switch (g) {
            case 10:
            case 9:
                System.out.println("成绩为优");
                break;
            case 8:
                System.out.println("成绩为良");
                break;
            case 7:
            case 6:
                System.out.println("成绩为中");
                break;
            case 5:
            case 4:
            case 3:
            case 2:
            case 1:
            case 0:
                System.out.println("成绩为差");
                break;
            default:
                System.out.println("成绩无效");
        }
    }
}
