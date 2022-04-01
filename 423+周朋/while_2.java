package loop;

public class while_2 {
    public static void main(String[] args) {
        int i = 1;
        int num = 0;
        while (i<=5){
            num += i;
            i++;
        }
        System.out.println("和为："+num);
    }
}
