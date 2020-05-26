import java.util.Scanner;

public class exper3 {
    public static void main(String[]agrs){
        System.out.print("请输入一元二次方程的a,b,c：");
        Scanner in=new Scanner(System.in);
        double a=in.nextDouble();
        double b=in.nextDouble();
        double c=in.nextDouble();
        QuadraticEquation q1=new QuadraticEquation(a,b,c);
        System.out.println("Discriminant is "+q1.getDiscriminant());
        if(q1.getDiscriminant()>0){
            System.out.print("The Root is"+q1.getRoot1()+" and "+q1.getRoot2());
        }
        else if(q1.getDiscriminant()==0){
            System.out.print("The Root is"+q1.getRoot1());
        }
        else{
            System.out.print("The equation has no roots");
        }

    }
    public static class QuadraticEquation{
        private double a,b,c;

        QuadraticEquation(double a,double b,double c){
            this.a=a;this.b=b;this.c=c;
        }
        public double get_a() {
            return a;
        }
        public double get_b(){
            return b;
        }
        public double get_c(){
            return c;
        }

        public double getDiscriminant(){
            return b*b-4*a*c;
        }

        public double getRoot1(){
            return (-b+Math.sqrt(b*b-4*a*c))/(2*a);
        }
        public double getRoot2(){
            return (-b-Math.sqrt(b*b-4*a*c))/(2*a);
        }
    }
}
