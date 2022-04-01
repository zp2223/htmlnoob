package loop;

public class homework2 {
        public static void main(String[] args) {
            int num_1 = 1;
            int num_2 = 1;
            for (int i = 0; i <= 10; i++) {
                if (i == 1 || i == 2) {
                    System.out.println(1 + "");
                }
                if (i > 2) {
                    int b = num_1 + num_2;
                    num_1 = num_2;
                    num_2 = b;
                    System.out.println(b + "");
                }
            }
        }
    }


