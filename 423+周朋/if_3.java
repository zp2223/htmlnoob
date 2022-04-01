package loop;

import java.util.Scanner;
public class if_3 {
    public static void main(String[] args) {
        Scanner R = new Scanner(System.in);

        System.out.println("请输入整数A：");
        int A = R.nextInt();

        if (A % 2 == 0) {
            System.out.println(A+"为偶数");
        }
        if (A % 2 != 0) {
            System.out.println(A+"为奇数");
        }
        System.out.println("结束");
    }
}
