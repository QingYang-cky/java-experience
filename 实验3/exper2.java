import java.util.Scanner;

public class exper2 {
    public static void main(String[]agrs){
        Scanner in=new Scanner(System.in);
        System.out.print("请输入风扇的速度：" );
        int speed=in.nextInt();
        System.out.print("请输入风扇的半径：");
        double r=in.nextDouble();
        System.out.print("请输入风扇的颜色：");
        String co=in.next();
        System.out.print("请输入风扇的状态(0关1开)：");
        int on_off=in.nextInt();
        boolean on_or_off= on_off != 0;
        Fan f1=new Fan();
        f1.set_color("co");
        f1.set_on(on_or_off);
        f1.set_radius(r);
        f1.set_speed(speed);
        System.out.print(f1.toString());
    }

    public static class Fan {
        final int SLOW=1;
        final int MEDIUM=2;
        final int FAST=3;
        private int speed;
        private boolean on;
        private double radius;
        private String color;

        public void set_speed(int a){
            speed=a;
        }
        public int get_speed(){
            return speed;
        }

        public void set_on(boolean a){
            on=a;
        }
        public boolean get_on(){
            return on;
        }

        public void set_radius(double a){
            radius=a;
        }
        public double get_radius(){
            return radius;
        }

        public void set_color(String a){
            color=a;
        }
        public String get_color(){
            return color;
        }

//        Fan(int speed, boolean on, double radius, String color){
//            this.speed=speed;
//            this.on=on;
//            this.color=color;
//            this.radius=radius;
//        }
        Fan(){
            speed=SLOW;
            on=false;
            radius=5;
            color="blue";
        }

        public String toString(){
            String x = "";
            if(this.on){
                x+= "风扇的速度为：";
                x+=speed;
            }
            else {
                x+="fan is off";
            }
            x+="\n风扇的颜色为：";
            x+=color;
            x+="\n风扇的半径:";
            x+=radius;
            return x;
        }
    }
}
