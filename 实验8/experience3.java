import java.util.Date;
import java.util.Random;

import static java.lang.Math.random;

public class experience3 {
    public static void main(String[]args){
        GeometricObject[]geometricObject=new Square[5];
        Random random = new Random();
        for(int i=0;i<5;i++)
            geometricObject[i]=new Square((int)(random.nextDouble()*10),random.nextBoolean());//随机生成

        for(int i = 0; i < 5;i++){
            System.out.println("第" + (i+1) + "个对象，"+"边长为"+((Square)geometricObject[i]).getSide());
            if(((Square)geometricObject[i]).getcolorable()){
                ((Square)geometricObject[i]).howToColor();
            }
            else
                System.out.println();
        }

    }
    public static class Square extends GeometricObject implements Colorable{
        private boolean colorable;
        private double side;

        Square(){
            side=1;
        }
        Square(double side,boolean colorable){
            this.colorable=colorable;
            this.side=side;
        }

        public void setcolorable(boolean colorable) {
            this.colorable = colorable;
        }
        public boolean getcolorable() {
            return colorable;
        }

        public double getSide() {
            return side;
        }
        public void setSide(double side) {
            this.side = side;
        }

        @Override
        public void howToColor() {
            System.out.println("给所有的四条边着色.");
        }

        @Override
        public double getArea() {
            return side * side;
        }

        @Override
        public double getPerimeter() {
            return 4 * side;
        }
    }




    public interface Colorable {
        public abstract void howToColor();
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
