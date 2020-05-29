import java.util.InputMismatchException;
import java.util.Scanner;

public class exper3 {
    public static void main(String[]args){
        try{
            method1();
            System.out.println("method1运行结束");
        }
        catch(MyException ex1){
            System.out.println("main中捕获的除数小于0错误");
        }
        System.out.println("Statement2");
    }

    public static void method1()throws MyException{
        try{
            method2();
            System.out.println("method2运行结束");
        }
        catch(ArrayIndexOutOfBoundsException ex1){
            System.out.println("method1中捕获的下标越界异常");
        }
        System.out.println("Statement4");
    }

    public static void method2()throws MyException{
        try{
            method3();
            System.out.println("method3运行结束");
        }
        catch(InputMismatchException ex2){
            System.out.println("method2中捕获的输入格式异常");
        }
        System.out.println("Statement6");
    }
    public static void method3()throws MyException{
        Scanner in=new Scanner(System.in);
        int[]a=new int[5];
        System.out.print("请输入一个整数：");
        a[0]=in.nextInt();//输入格式异常
        System.out.print("请输入一个下标：");
        int x=in.nextInt();
        System.out.println(a[x]);//下标越界异常
        System.out.print("请输入被除数和除数(除数应大于0)：");

        int b=in.nextInt();
        int c=in.nextInt();
        if(c<0)
            throw new MyException("除数小于零错误");
        System.out.print(b/c);//自定义的除数小于零错误
    }

    public static class MyException extends Exception {
        public MyException(String msg)
        {
            super(msg);
        }
    }
}
