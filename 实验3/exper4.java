import java.util.Scanner;

public class exper4 {
    public static void main(String[]agrs){
    System.out.print("输入二维数组的行数和列数: ");
        Scanner in = new Scanner(System.in);
        int m,n;
        m=in.nextInt();n=in.nextInt();
        double [][]A=new double[m][n];
        System.out.println("输入数组:");
        for(int i=0;i<m;i++)
            for (int j=0;j<n;j++)
                A[i][j]=in.nextDouble();//输入数组

            Location L;
            L=locateLargetst(A);
            System.out.println("最大元素及其下标是:"+L.maxValue+"在("+L.row+","+L.column+")");
    }
    public static class Location{
        public int row;//行号
        public int column;//列号
        public double maxValue;

    }
    public static Location locateLargetst(double[][] a){
    Location l=new Location();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (l.maxValue < a[i][j]){
                    l.maxValue = a[i][j];//找出二维数组中元素的最大值并赋值给数据域中的实例变量maxValue
                    l.row = i;//找出最大值的行赋值给实例变量row
                    l.column = j;//找出最大值的列赋值给实例变量column
                }
            }
        }
    return l;
    }
}
