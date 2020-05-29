import java.util.Scanner;

public class exper2 {
    public static void main(String[]args) {
        int[] A = new int[100];
        for (int i = 0; i < 100; i++) {
            A[i] = (int) (Math.random() * 100);
        }
        System.out.print("请输入数组的下标（0-99）：");
        Scanner in = new Scanner(System.in);
        try {
            int x = in.nextInt();
            System.out.println("该下标对应的数字是：" + A[x]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("out of bounds");
        }
    }
}
