package loop;

import java.util.Scanner;

public class for_5 {
    public static void main(String[] args) {

        int num1=1,num2=1,temp;

        Scanner H=new Scanner(System.in);
        System.out.println("请输入:");

        int num=H.nextInt();

        for (int i=2;i<num;i++){
            num1 += num2;
            temp = num1;
            num1 = num2;
            num2 = temp;
        }
        System.out.println("第"+num+"个数为"+num2);
    }
}
