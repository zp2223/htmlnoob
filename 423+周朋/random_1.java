package loop;

import java.util.Random;

public class random_1 {
    public static void main(String[] args) {
        Random H = new Random();

        //用循环获取10个随机数
        for (int i = 0; i < 10; i++) {
            int number = H.nextInt(10);
            System.out.println("number:" + number);
        }

        //获取一个1-100以内的随机数
        int x = H.nextInt(100) + 1;
        System.out.println(x);
    }
}
