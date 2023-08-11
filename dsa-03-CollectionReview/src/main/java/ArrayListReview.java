import java.util.ArrayList;
import java.util.List;

public class ArrayListReview {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();


        //Add elements to Student

        students.add(new Student(1, "Jack"));
        students.add(new Student(2, "Julia"));
        students.add(new Student(3, "Mike"));
        students.add(new Student(4, "Mary"));

        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }


    }
}
