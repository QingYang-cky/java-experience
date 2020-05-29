import java.util.InputMismatchException;
import java.util.Scanner;

public class exper1 {
    public static void main(String[]args){
        System.out.print("请输入两个不同整数：");
        int a,b;
        Scanner in=new Scanner(System.in);
        while (true){
            try{
                a=in.nextInt();
                b=in.nextInt();
                System.out.print("两个数的和为："+(a+b));
            }
            catch (InputMismatchException ex){
                in.nextLine();//消除空格防止死循环
                System.out.print("发生NumberFormatException异常，请重新输入两个数：");
                continue;//继续循环直到输入正确为止
            }
            break;
        }
    }
}
