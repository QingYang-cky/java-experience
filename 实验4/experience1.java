import javax.swing.*;
import java.util.Scanner;

public class experience1 {
    private static Object GeometricObject;

    public static void main(String[]args){
        System.out.println("输入颜色，填充与否：");
        Scanner in=new Scanner(System.in);
        String color=in.next();
        boolean fill;
        fill= in.next().equals("true");
        double side1,side2,side3;
        side1=in.nextDouble();
        side2=in.nextDouble();
        side3=in.nextDouble();
        Triangle T1=new Triangle(color,fill,side1,side2,side3);
        System.out.println(T1.toString());




    }
    public static class Triangle extends GeometricObject{
        private double side1,side2,side3;
        Triangle(){
            super();
            side1=1.0;
            side2=1.0;
            side3=1.0;
        }
        Triangle(String color,boolean filled,double a,double b,double c){
            super(color, filled);
            side1=a;
            side2=b;
            side3=c;
        }


        public double get_side1(){
            return side1;
        }
        public double get_side2() {
            return side2;
        }

        public double get_side3() {
            return side3;
        }

        public double getArea(){
            double p=(side1+side3+side2)/2;
            return Math.sqrt(p*(p-side1)*(p-side2)*(p-side3));
        }
        public double getPerimeter(){
            return (side1+side2+side3)*2;
        }
        public String toString(){

        return super.toString()+"\nArea of Triangle is "+getArea()+"\nPerimeter of Triangle is "+getPerimeter()+
                "\nside1 is "+get_side1()+"\nside2 is "+get_side2()+"\nside3 is "+get_side3();
        }
    }
    public static class GeometricObject {
        private String color = "white";
        private boolean filled;
        private java.util.Date dateCreated;

        public GeometricObject() {
            dateCreated = new java.util.Date();
        }

        public GeometricObject(String color, boolean filled) {
            dateCreated = new java.util.Date();
            this.color = color;
            this.filled = filled;
        }

        public String getColorf() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public boolean isFilled() {
            return filled;
        }

        public void setFilied(boolean filled) {
            this.filled = filled;
        }

        public java.util.Date getDateCreated() {
            return dateCreated;
        }

        public String toString() {
            return "created on " + dateCreated + "\ncolor: " + color +
                    " and filled: " + filled;
        }
    }
}
