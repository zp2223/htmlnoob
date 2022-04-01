package loop;

import java.util.Scanner;

public class Multiplication_table {
    public static void main(String[] args) {
        Scanner H = new Scanner(System.in);
        System.out.println("请输入num：");

        int num = H.nextInt();
        int i,j;
        for (i = 1;i < num;i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(i + "*" + j + "=" + j * i + "\t");
            }
            System.out.println();
        }
    }
}
