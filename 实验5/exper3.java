import java.util.ArrayList;
import java.util.Objects;

public class exper3 {

    public static void main(String[] args) {

        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.println("请输入5个字符串:  ");
        String[] o = new String[5];
        Stack_my mystack = new Stack_my();
        for(int i = 0; i < 5; i++) {
            o[i] = input.next();
            mystack.push(o[i]);

        }
        System.out.println("逆序输出为 : ");
        while(mystack.peek() != null){
            System.out.print(mystack.peek() + " ");
            mystack.pop();
        }
    }

public static class Stack_my extends ArrayList<Object>{
        public Object peek(){
            if(this.size()==0)//防止下标越界
                System.exit(1);
            return this.get(size()-1);
        }
        public void pop(){
            if(this.size()==0)//防止下标越界
                System.exit(1);
            this.remove(size()-1);
        }
        public void push(Object o){
            this.add((Object) o);
        }
    }


/*
    public static class MyStack{
        private ArrayList<Object> list = new ArrayList<>();

        public boolean isEmpty() {
            return list.isEmpty();
        }
        public int getSize(){
            return list.size();
        }
        public Object peek() {
             return list.get(getSize() - 1);
        }

        public Object pop() {
             Object o = list.get(getSize() - 1);
             list.remove(getSize() - 1);
             return 0;
        }
        public void push(Object o) {
            list.add(o);
        }
        public String toString() {
             return "stack: " + list.toString();
        }
    }*/
}
