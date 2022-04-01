package loop;

public class HomeWork {
    public static void main(String[] args) {
        int sum_1 = 0;
        int sum_2 = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                sum_2 += i;
            } else {
                sum_1 += i;
            }
        }
        System.out.println("奇数和：" + sum_1);
        System.out.println("偶数和：" + sum_2);
    }
}
