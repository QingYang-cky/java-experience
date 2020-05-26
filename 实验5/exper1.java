public class exper1 {
    public static void main(String[]args){
    Person p1=new Person("13912341234 ","小明");
    Person p2=new Student("13812341234 ","小红",2);
    MyDate d1=new MyDate("2001","02","21");
    Person p3=new Employee("13512341234 ","老白",d1,20000);
    m1(p1);m2(p1);m3(p1);
    m1(p2);m2(p2);m3(p2);
    m1(p3);m2(p3);m3(p3);
    }
    public static void m1(Person p){
        System.out.println(p.getName());
    }
    public static void m2(Person p){
        System.out.println(p.toString());
    }
    public static void m3(Person p){
        if(p instanceof Student){
            System.out.println(((Student) p).displayObject());
        }
        else if(p instanceof Employee){
            System.out.println(((Employee) p).displayObject());
        }


    }
    public static class Person{
        private String phoneNumber;
        private String name;
        public Person(String phoneNumber,String name){
        this.phoneNumber=phoneNumber;
        this.name=name;
        }
        public String getName() {
            return name;
        }
        public String getPhoneNumber() {
            return phoneNumber;
        }
        public String toString(){
        return "姓名为 "+getName()+" 电话为"+getPhoneNumber();
        }
    }

    public static class Student extends Person{
        private String grade;
        public static final int dayi=1;
        public  static  final int daer=2;
        public  static final int dasan=3;
        public static final int dasi=4;
        public Student(String phoneNumber,String name,int nj){
            super(phoneNumber, name);
            if(nj==1)
                grade="大一";
            if(nj==2)
                grade="大二";
            if(nj==3)
                grade="大三";
            if(nj==4)
                grade="大四";
        }
        public String getGrade() {
            return grade;
        }
        public String toString(){
            return super.toString()+"年级为 "+getGrade();
        }
        public String displayObject(){
            return "To "+getName()+"：请按时交实验报告";
        }
    }

    public static class Employee extends Person{
        private MyDate emDate;
        private double money;
        public Employee(String phoneNumber,String name,MyDate emDate,double money ){
        super(phoneNumber, name);
        this.emDate=emDate;
        this.money=money;
        }
        public String getEmDate() {
            return emDate.getYear()+"年"+emDate.getMonth()+"月"+emDate.getDay()+"日";
        }

        public double getMoney() {
            return money;
        }
        public String toString(){
            return super.toString()+"工资为 "+getMoney()+" 受聘日期为 "+getEmDate();
        }
        public String displayObject(){
            return "To "+getName()+"：请按时上班";
        }
    }
    public static class MyDate{
        private String year,month,day;
        public MyDate(String year,String month,String day){
            this.day=day;
            this.month=month;
            this.year=year;
        }
        public String getDay() {
            return day;
        }
        public String getMonth() {
            return month;
        }
        public String getYear() {
            return year;
        }
        public void setDay(String day) {
            this.day = day;
        }
        public void setMonth(String month) {
            this.month = month;
        }
        public void setYear(String year) {
            this.year = year;
        }
    }
}
