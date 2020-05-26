import java.util.Scanner;

public class exper3 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int[]A=new int[10];
        int c=0;//计数器
        boolean f=false;//标识符表示是否和之前的重复
        System.out.print("输入10个整数：");

        //输入并处理
        for(int i=0;i<10;i++){
            int x=in.nextInt();
            for(int j=0;j<c;j++){
                if (x == A[j]) {
                    f = true;//出现重复进行标记
                    break;
                }
            }
            if(!f){
                A[c++]=x;
            }//若无重复放入数组
            f=false;
        }

        //输出部分
        System.out.print("互不相同的数为：");
        for(int i=0;i<c;i++){
            System.out.print(A[i]+" ");
        }
    }

}
