package student.grade.system;

import java.util.Comparator;
import java.util.List;

public class Student implements Comparable<Student> {
    private int id;
    private String name;
    private int age;
    private int grade;
    private String letterGrade;

    /**
     * To create a new student object by initializing.
     * @param id id for the student.
     * @param name name of the student.
     * @param age age of the student.
     * @param grade grade of the student.
     */
    public Student(int id, String name, int age, int grade) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.grade = grade;
        if(grade > 80 && grade <= 100) {
            this.letterGrade = "A";
        } else if (grade > 60 && grade <= 80) {
            this.letterGrade = "B";
        } else if (grade > 40 && grade <= 60) {
            this.letterGrade = "C";
        } else if (grade > 20 && grade <= 40) {
            this.letterGrade = "D";
        } else {
            this.letterGrade = "F";
        }
    }

    public Student() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getLetterGrade() {
        return letterGrade;
    }

    public void setLetterGrade(String letterGrade) {
        this.letterGrade = letterGrade;
    }

    /**
     *
     * @param student list of the Software Engineering students.
     * @return average grade of Software Engineering students.
     */
    public static double getAverageGrade(List<Student> student) {
        int sum = 0;

        for(int i = 0; i < student.size(); i++) {
            sum += student.get(i).getGrade();
        }

        double avg = sum/student.size();
        return avg;
    }

    /*Comparator for sorting the list by Student Grade*/
    public static Comparator<Student> StuGradeComparator = new Comparator<Student>() {

        public int compare(Student s1, Student s2) {
            int studentGrade1 = s1.getGrade();
            int studentGrade2 = s2.getGrade();

            //ascending order
            //return studentGrade1-studentGrade2;

            //descending order
            return studentGrade2-studentGrade1;
        }};

    @Override
    public  int compareTo(Student student) {
        if(this.getGrade() > student.getGrade()) {
            return 1;
        } else if (this.getGrade() < student.getGrade()) {
            return -1;
        }

        return 0;
    }

    @Override
    public String toString() {
        return "id:" + id + ", " + "name:" + name + ", " + "age:" + age + ", " + "grade:" + grade + ", " + "letterGrade: " + letterGrade;
    }
}
