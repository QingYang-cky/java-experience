import java.util.Scanner;

public class Exper2 {
    public static void main(String[] args){
        System.out.print("请输入三角形的三个点： ");
        Scanner in=new Scanner(System.in);
        double x1,x2,x3,y1,y2,y3;
        x1=in.nextDouble();y1=in.nextDouble();
        x2=in.nextDouble();y2=in.nextDouble();
        x3=in.nextDouble();y3=in.nextDouble();
        double l1,l2,l3;//记录三条边的长度
        l1=Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
        l2=Math.sqrt((x3-x2)*(x3-x2)+(y3-y2)*(y3-y2));
        l3=Math.sqrt((x1-x3)*(x1-x3)+(y1-y3)*(y1-y3));
        double s=(l1+l2+l3)/2;
        if(l1+l2>l3&&l1+l3>l2&&l2+l3>l1)//判断是否可以构成三角形
        {
            double sq=Math.sqrt(s*(s-l1)*(s-l2)*(s-l3));
            System.out.print("三角形的面积为:"+sq);
        }
        else{
            System.out.println("三个点不能构成三角形！");
        }
    }

}
