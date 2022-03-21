package garammar_demo;

public class BMI {
    public static void main(String[] args) {
        double h = 1.72;
        System.out.println("你的身高为：" + h);
        int w = 60;
        System.out.println("你的体重为：" + w);
        double BMI = w / (h * h);
        System.out.println("你的BMI指数为：" + BMI);
        System.out.println("你的体重属于：");
        if (BMI < 18.5) {
            System.out.println("体重较轻");

        } else if (BMI > 18.5 && BMI < 24.9)
            System.out.println("正常范围");
    else if (BMI>=24.9&&BMI<29.9)
        System.out.println("体重过重");
    else
        System.out.println("肥胖");

;
    }
}
