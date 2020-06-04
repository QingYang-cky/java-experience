import java.util.Scanner;

public class experience1 {
    public static void main(String[] args){
        System.out.print("Please enter your password:");
        Scanner in=new Scanner(System.in);
        String password=in.next();
        boolean flag=true;
        int numberOf123=0;
        if(password.length()<8)
            flag=false;
        for(int i=0;i<password.length();i++){
            if (!((password.charAt(i) >= 'a' && password.charAt(i) <= 'z') || (password.charAt(i) >= 'A' && password.charAt(i) <= 'Z') || (password.charAt(i) >= '0' && password.charAt(i) <= '9'))) {
                flag = false;
                break;
            }
            if(password.charAt(i) >= '0' && password.charAt(i) <= '9')
                numberOf123++;
        }
        if(numberOf123<2)
            flag=false;

        if(flag)
            System.out.println("Valid Password");
        else
            System.out.println("Invalid Password");
    }
}
