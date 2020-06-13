
import java.util.Scanner;

public class experience2 {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);

        ComparableCircle c1=new ComparableCircle();
        ComparableCircle c2=new ComparableCircle();
        System.out.print("请输入第一个圆的半径：");
        c1.setRadius(in.nextDouble());
        System.out.print("请输入第二个圆的半径：");
        c2.setRadius(in.nextDouble());

        if(c1.compareTo(c2)<0)
            System.out.println("两圆中第二个较大，面积为:" + c2.getArea());
        else if(c1.compareTo(c2)>0)
            System.out.println("两圆中第一个较大，面积为:" + c1.getArea());
        else
            System.out.println("两圆等大，面积为"+c1.getArea());
    }
    public static class Circle {
        private double radius;
        public Circle() {
            radius = 1;
        }
        public Circle(double Radius){
            radius = Radius;
        }
        public double getArea(){
            return radius * radius * Math.PI;
        }
        public double getPerimeter(){
            return 2 * radius * Math.PI;
        }
        public void setRadius(double radius) {
            this.radius = radius;
        }
        public double getRadius() {
            return radius;
        }
    }
    public static class ComparableCircle extends Circle implements Comparable<ComparableCircle>{
        @Override
        public int compareTo(ComparableCircle o) {
            if(this.getArea() < o.getArea())
                return -1;
            else if(this.getArea() == o.getArea())
                return 0;
            else
                return 1;
        }
    }
}
