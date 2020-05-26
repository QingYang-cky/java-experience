import java.util.Scanner;

public class exper1 {
    public static void main(String[]agrs){
        Scanner in=new Scanner(System.in);
        double a,b;
        System.out.print("请分别输入宽和高：");
        a=in.nextDouble();
        b=in.nextDouble();
        Rectangle r1=new Rectangle(a,b);
        System.out.println("输入的长方形的宽为："+r1.width);
        System.out.println("输入的长方形的高为："+r1.height);
        System.out.println("输入的长方形的面积为："+r1.getArea());
        System.out.println("输入的长方形的周长为："+r1.getPerimeter());
    }

    public static class Rectangle{
        private double width,height;
        Rectangle(){
            width=1;
            height=1;
        }//无参构造方法
        Rectangle(double a,double b){
            width=a;
            height=b;
        }

        double getArea(){
            return (double) Math.round(width*height * 100) / 100;//四舍五入保留两位小数
        }

        double getPerimeter(){
            return (width+height)*2;
        }
    }
}
