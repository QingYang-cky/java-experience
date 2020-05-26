public class experience2 {

    public static void main(String[]args){
        Circle2D c1=new Circle2D(2, 2, 5.5);
        System.out.println("周长为： "+c1.getPerimeter());
        System.out.println("面积为： "+c1.getArea());

        System.out.println("c1.contains(3, 3)为： "+c1.contains(3, 3));

        System.out.println("c1.contains(new Circle2D(4, 5, 10.5))为： "+c1.contains(new Circle2D(4,5,10.5)));

        System.out.println("c1.overlaps(new Circle2D(3, 5, 2.3))为： "+c1.overlaps(new Circle2D(3, 5, 2.3)));

    }



    public static class Circle2D{
    private double x,y;
    private double radius;

        public double getX() {
            return x;
        }

        public double getY() {
            return y;
        }

        public double getRadius() {
            return radius;
        }
        public Circle2D(){
            x=0;
            y=0;
            radius=1;
        }

        public Circle2D(double x,double y,double radius){
            this.x=x;
            this.y=y;
            this.radius=radius;

        }

        public double getArea(){
            return radius*radius*3.14159;
        }
        public double getPerimeter(){
            return radius*2*3.14159;
        }

        boolean contains(double x, double y){
            return Math.sqrt(Math.abs(x - this.x) * Math.abs(x - this.x) + Math.abs(y - this.y) * Math.abs(y - this.y)) < radius;
        }

        boolean contains(Circle2D circle){
            return Math.sqrt((circle.x - x) * (circle.x - x) + (circle.y - y) * (circle.y - y)) > circle.radius;
        }

        boolean overlaps(Circle2D circle){
            return Math.sqrt((circle.x - x) * (circle.x - x) + (circle.y - y) * (circle.y - y))>Math.abs(circle.radius-radius)&&Math.sqrt((circle.x - x) * (circle.x - x) + (circle.y - y) * (circle.y - y))<(radius+circle.radius);
        }
    }




}
