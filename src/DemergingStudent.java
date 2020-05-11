import java.util.LinkedList;
import java.util.Queue;

public class DemergingStudent {
    public static void main(String[] args) {
        Student[] students = creatStudent();
        Student[] sortedStudent = demergingStudents(students);

        for (int i = 0; i < 10; i++) {
            System.out.println(sortedStudent[i].toString());
        }

    }

    private static Student[] demergingStudents(Student[] students) {
        Queue<Object> male = new LinkedList<>();
        Queue<Object> female = new LinkedList<>();

        for (Student student : students) {
            if (student.isGenderMale()) {
                male.add(student);
            } else
                female.add(student);
        }

        int numberOfFemale = female.size();
        int numberOfMale = male.size();

        Student[] sortedStudent = new Student[students.length];
        for (int i = 0; i < numberOfFemale; i++) {
            sortedStudent[i] = (Student) female.poll();
        }
        for (int j = 0; j < numberOfMale; j++) {
            sortedStudent[j + numberOfFemale] = (Student) male.poll();
        }
        return sortedStudent;
    }

    public static Student[] creatStudent() {
        Student student1 = new Student("Bob", true, "19/02/2000");
        Student student2 = new Student("Jame", true, "22/03/2000");
        Student student3 = new Student("Linda", false, "27/05/2000");
        Student student4 = new Student("Tom", true, "24/06/2000");
        Student student5 = new Student("Mary", false, "08/07/2000");
        Student student6 = new Student("Carly", false, "17/07/2000");
        Student student7 = new Student("Kelly", false, "30/09/2000");
        Student student8 = new Student("Micheal", true, "28/09/2000");
        Student student9 = new Student("John", true, "16/11/2000");
        Student student10 = new Student("Andy", true, "02/12/2000");

        return new Student[]{student1, student2, student3, student4, student5, student6, student7, student8, student9, student10};
    }

}