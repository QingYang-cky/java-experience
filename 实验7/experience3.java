import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class experience3 {
    public static void main(String[] args) throws IOException {
        File file =new File("Exercise9_19.txt");
        PrintWriter printWriter=new PrintWriter(file);
        Random random=new Random();
        for(int i=0;i<10;i++){
            printWriter.print(random.nextInt(200)+" ");//生成随机数并输入文件
        }
        printWriter.close();//关闭文件
        
        Scanner in=new Scanner(file);
        int []A=new int[10];
        for(int i=0;i<10;i++){
            A[i]=in.nextInt();//读取进数组
        }
        
        Arrays.sort(A);
        for(int i=0;i<10;i++)
            System.out.print(A[i]+" ");
        System.out.println();
    }


}
