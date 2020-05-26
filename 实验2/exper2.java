import java.util.Scanner;

public class exper2 {
    public static void main(String[] args){
    System.out.print("请输入十个数字：");
    double[]A=new double[10];
    int min=0;
    Scanner in=new Scanner(System.in);

    //数组的输入部分
    for(int i=0;i<10;i++)
        A[i]=in.nextDouble();

    //输出部分
    min=indexofSmallestElement(A);
    System.out.println("数组的最小的数字的下标为："+min);
    System.out.println("最小的下表值为："+A[min]);
    }

    public static int indexofSmallestElement(double[] array){
    int min;
    double numOfMin;
    min=0;numOfMin=array[0];//初始化选择第一个为最小的与后面的进行比较

    for(int i=1;i<10;i++){
        if(array[i]<numOfMin){
            min=i;
            numOfMin=array[i];
        }
    }

    return min;
    }
}
