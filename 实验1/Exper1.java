import java.util.Scanner;

public class Exper1 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int x;//存放输入的数字
        int i=0,sum=0;System.out.print("请输入一个0-1000的整数");
        int []a={0,0,0,0};//用于存放各个位数的数字的数组
        x=in.nextInt();
        if(0>x||x>1000){
            System.out.println("输入的数据有误，请重新输入！");
            System.exit(1);
        }
        while (x>0){
            a[i]=x%10;
            x=x/10;
            i++;
        }
        for(int j=0;j<4;j++){
            sum+=a[j];
        }
        System.out.println("该整数的各位数字相加之和为"+sum);
    }

}
