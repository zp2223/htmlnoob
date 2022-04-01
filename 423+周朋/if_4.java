package loop;


import java.util.Scanner;
public class if_4 {
    public static void main(String[] args) {
        Scanner H=new Scanner(System.in);
        System.out.println("请输入一个星期（1——7）：");
        int week = H.nextInt();

        if (week == 1){
            System.out.println("星期一");
        }
        else if (week == 2){
            System.out.println("星期二");
        }
        else if (week == 3){
            System.out.println("星期三");
        }
        else if (week == 4){
            System.out.println("星期四");
        }
        else if (week == 5){
            System.out.println("星期五");
        }
        else if (week == 6){
            System.out.println("星期六");
        }
        else {
            System.out.println("星期天");
        }
        System.out.println("结束");
    }
}
