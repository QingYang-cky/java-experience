public class Exper4 {
    public static boolean zc(int x, int y){
        return x % y == 0;
    }
    public static void main(String[] agrs){
        int i=0;
        for(int k=100;k<=200;k++){
            if((zc(k,5)||zc(k,6))&&!zc(k,30)){
            System.out.print(k+" ");
            i++;
            }
            if (i==10){
            System.out.println();
            i=0;
            }
        }
    }
}