import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class experience2 {
    public static void main(String[] args)throws IOException {
        File file=new File(args[0]);
        if(file.exists()) {
            Scanner in = new Scanner(file);
            int numOfLine = 0, i = 0;
            int numOfWord = 0, numOfLetter = 0;
            while (in.hasNextLine()) {
                numOfLine++;//统计行数
                String x = in.nextLine();
                x+='\n';//把因为nextline吸收的回车加上
                for (i = 0; i < x.length(); i++) {
                    if (x.charAt(i) == '\n' || x.charAt(i) == '\r' || x.charAt(i) == ' ' || x.charAt(i) == '\t') {
                        numOfWord++;//统计单词数
                    }
                    if (Character.isLetter(x.charAt(i))) {
                        numOfLetter++;//统计字母数
                    }
                }
            }
            System.out.println("File " + file.getName() + " has");
            System.out.println(numOfLetter + " Characters");
            System.out.println(numOfWord + " Words");
            System.out.println(numOfLine + " Lines");
        }
        else {
            System.out.println("未找到相应文件，请检查后重新输入。");
        }
    }
}
