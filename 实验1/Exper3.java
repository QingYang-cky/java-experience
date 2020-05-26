import java.util.Scanner;

public class Exper3 {
    public static void main(String[] args){
    String []A={"","Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};//存放大小
    String []B={"Clubs","Diamond","Heart","Spades"};//存放花色
    double index=Math.random();
    int idex=(int)(index*52+1);
    System.out.println("抽到的牌为："+B[idex/13]+" "+A[(idex-1)%13+1]);
    }

}
