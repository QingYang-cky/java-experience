import java.util.Scanner;

public class exper1 {

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.print("请输入1-100以内的整数（以0作为输入结束的标志）：");
        int []A=new int[110];//创建一个数组储存每个数字出现的次数
        int x,c=0;//作为计数器

        //输入部分
        for(int i=1;i<=100;i++)//数组的初始化
            A[i]=0;
        x=in.nextInt();
        while(x!=0){
            if(x>0&&x<=100)
            {
                A[x]++;//对应的数组计数器加一
            }
            else {
                System.out.println("输入的数据有误！");
                System.exit(0);//退出程序
            }
            x=in.nextInt();//读取下一个输入
        }

        //输出部分
        for(int i=1;i<=100;i++){
            if(A[i]>0)//若有记录则输出
            {
                System.out.println(i+"出现"+A[i]+"次");
            }
        }

    }
}

