package loop;

import java.util.Scanner;

public class season {
    public static void main(String[] args) {
        Scanner H = new Scanner(System.in);
        System.out.println("请输入月份（1—12）：");
        int a = H.nextInt();
        switch (a){
            case 3:
            case 4:
            case 5:
                System.out.println(a+"月为春季");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(a+"月为夏季");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(a+"月为秋季");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println(a+"月为冬季");
                break;
                default:
                    System.out.println("无效");
        }
    }
}
