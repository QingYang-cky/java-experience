import java.util.Date;
import java.util.Scanner;

public class experience1 {
    public static void main(String[]args) {
        double s1, s2, s3;
        String color;
        boolean filled;
        Scanner in = new Scanner(System.in);
        System.out.println("请输入三角形的三条边长、颜色、填充信息： ");
        System.out.print("第一条边长:");
        s1 = in.nextDouble();
        System.out.print("第二条边长:");
        s2 = in.nextDouble();
        System.out.print("第三条边长:");
        s3 = in.nextDouble();
        System.out.print("三角形的颜色是：");
        color = in.next();
        System.out.print("三角形是否被填充？true/false");
        filled = in.nextBoolean();
        Triangle triangle = new Triangle(s1, s2, s3, color, filled);
        System.out.println(triangle.toString());
    }
    public static class Triangle extends GeometricObject {
        private double s1, s2, s3;
        public Triangle(double s1, double s2, double s3, String color, boolean filled) {
            this.s1 = s1;
            this.s2 = s2;
            this.s3 = s2;
            setColor(color);
            setFilled(filled);
            Date dateCreated = new Date();
            setDateCreated(dateCreated);
        }

        public double getArea() {
            double p = (s1 + s2 + s3) / 2;
            return Math.sqrt(p * (p - s1) * (p - s2) * (p - s3));
        }

        public double getPerimeter() {
            return s1 + s2 + s3;
        }

        public String toString() {
            return super.toString() + " and area: " + getArea() + " and perimeter: " + getPerimeter();
        }
    }
    public abstract static class GeometricObject {
        private String color = "white";
        private boolean filled;
        private Date dateCreated;

        protected GeometricObject(){
            dateCreated = new Date();
        }
        protected GeometricObject(String color,boolean filled){
            dateCreated = new Date();
            this.color = color;
            this.filled = filled;
        }

        public String getColor(){
            return color;
        }
        public void setColor(String color) {
            this.color = color;
        }
        public boolean isFilled() {
            return filled;
        }
        public void setFilled(boolean filled) {
            this.filled = filled;
        }
        public void setDateCreated(Date dateCreated) {
            this.dateCreated = dateCreated;
        }
        public Date getDateCreated() {
            return dateCreated;
        }
        public String toString() {
            return "created on " + dateCreated + " \ncolor: " + color
                    + " and filled: " + filled;
        }
        public abstract double getArea();
        public abstract double getPerimeter();
    }

}
