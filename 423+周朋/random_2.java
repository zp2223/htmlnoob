package loop;

import java.util.Random;
import java.util.Scanner;

public class random_2 {
    public static void main(String[] args) {
        Scanner h = new Scanner(System.in);
        Random H = new Random();
        System.out.println("请输入：");
        int i = H.nextInt(100) + 1;
        for (int j = 1; j <= 100; j++) {
            int x = h.nextInt();
            if (x > i) {
                System.out.println("大了");
                continue;
            }
            if (x < i) {
                System.out.println("小了");
                continue;
            } else {
                System.out.println("相等");
                break;
            }

        }
    }
}
