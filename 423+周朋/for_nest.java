package loop;

import java.util.Scanner;

public class for_nest {
    public static void main(String[] args) {
        Scanner H = new Scanner(System.in);
        System.out.println("请输入层数：");

        int num = H.nextInt();
        int i, j, k;

        if (num <= 1) {
            System.out.println("需要输入大于1的自然数！");
        } else {
            for (i = 1; i <= num; i++) {
                for (j = 1; j <= num - i; j++) {
                    System.out.print(" ");
                }

                for (k = 1; k <= 2 * i - 1; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
    }

