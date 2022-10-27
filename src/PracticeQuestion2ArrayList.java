import java.util.ArrayList;

/*
Create an ArrayList of Student, the attributes of student are name, rollNo, email.

Display all the elements of the list

Print only the details of student whose name not starting with V
*/
public class PracticeQuestion2ArrayList {
    public static void main(String[] args) {
        ArrayList<Student> studentArrayList = new ArrayList<>();
        Student student1 = new Student();
        student1.setName("vaibhav");
        student1.setRollNo(10);
        student1.setEmail("v@d");
        Student student2 = new Student("Ramesh", 11, "R@S");
        studentArrayList.add(student1);
        studentArrayList.add(student2);
        studentArrayList.add(new Student("Suresh", 15, "S@S"));

        System.out.println("studentArrayList.size() = " + studentArrayList.size());

        System.out.println(studentArrayList);
        System.out.println();
        System.out.println();

        for (Student student : studentArrayList) {
            if (!(student.getName().startsWith("V") || student.getName().startsWith("v"))){
                System.out.println(student);
            }
        }

        studentArrayList.add(0, new Student("Ravi", 19, "R@K"));
        System.out.println("--------------------------------------------------------");
        System.out.println(studentArrayList);
        System.out.println();
        System.out.println();


    }
}
