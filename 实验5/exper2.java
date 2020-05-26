import java.util.ArrayList;

public class exper2 {
    public static void main(String[] args) {
        Course course1 = new Course("Data Structures");
        Course course2 = new Course("Database Systems");

        course1.addStudent("Peter Jones");
        course1.addStudent("Brian Smith");
        course1.addStudent("Anne Kennedy");

        course2.addStudent("Peter Jones");
        course2.addStudent("Steve Smith");

        System.out.println("Number of students in course1: "
                + course1.getNumberOfStudents());
        String[] students = course1.getStudents();
        for (int i = 0; i < course1.getNumberOfStudents(); i++)
            System.out.print(students[i] + ", ");

        System.out.println();
        System.out.print("Number of students in course2: "
                + course2.getNumberOfStudents());
        System.out.println();
        students = course1.getStudents();
        for (int i = 0; i < course2.getNumberOfStudents(); i++)
            System.out.print(students[i] + ", ");
        course2.dropStudent("Steve Smith");//删除一个学生后打印结果
        System.out.println();
        System.out.print("删除后的打印结果：");
        students = course1.getStudents();
        for (int i = 0; i < course2.getNumberOfStudents(); i++)
            System.out.print(students[i] + ", ");
    }



    public static class Course {
        private String courseName;
//        private String[] students = new String[100];
//        private int numberOfStudents;
         ArrayList<String> student=new ArrayList<String>();

        public Course(String courseName) {
            this.courseName = courseName;
        }

        public void addStudent(String student) {
//            students[numberOfStudents] = student;
//            numberOfStudents++;
            this.student.add(student);
        }

        public String[] getStudents() {
//            return students;
            String[] A=new String[student.size()];
            for(int i=0;i<student.size();i++)
                A[i]=(String)student.get(i);
            return A;
        }

        public int getNumberOfStudents() {
            return student.size();
        }

        public String getCourseName() {
            return courseName;
        }

        public void dropStudent(String student) {
            this.student.remove(student);
            // Left as an exercise in Exercise 9.9
        }
    }
}
