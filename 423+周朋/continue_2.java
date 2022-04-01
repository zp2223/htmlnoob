package loop;

public class continue_2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 10; j++) {
                if (j == 1 || j == 10) {
                    continue;
                } else {
                    System.out.print(i + "行" + j + "列" + ",");
                }
                if (i <= 4 && j == 9) {
                    System.out.println();
                }
            }
        }
    }
}
