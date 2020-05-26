import java.util.Scanner;

public class exper4 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n,m;//n，m分别存储两个数组的个数

        //输入数组
        System.out.print("输入list1：");
        n=in.nextInt();
        int[]A=new int[n];
        for(int i=0;i<n;i++){
            A[i]=in.nextInt();
        }
        System.out.print("输入list2：");
        m=in.nextInt();
        int[]B=new int[m];
        for(int i=0;i<m;i++){
            B[i]=in.nextInt();
        }

        //对数组的处理
        //用sort函数进行升序排序
        java.util.Arrays.sort(A,0,n);
        java.util.Arrays.sort(B,0,m);
        //判断两个数组是否相同
        if(equal(A,B)){
            System.out.println("这两个数列是相同的");
        }
        else{
            System.out.println("这两个数列是不同的");
        }

    }
    public static boolean equal(int[ ] list1, int[ ] list2){
    return java.util.Arrays.equals(list1,list2);
    }
}
