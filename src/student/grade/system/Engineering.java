package student.grade.system;

import java.util.Collections;
import java.util.List;

public class Engineering extends Student{
    private List<Student> sengStudents;
    private List<Student> cengStudents;



    public Engineering(List<Student> sengStudents, List<Student> cengStudents) {
        super();
        this.sengStudents = sengStudents;
        this.cengStudents = cengStudents;
    }


    public List<Student> getSengStudents() {
        return sengStudents;
    }

    public void setSengStudents(List<Student> sengStudents) {
        this.sengStudents = sengStudents;
    }

    public List<Student> getCengStudents() {
        return cengStudents;
    }

    public void setCengStudents(List<Student> cengStudents) {
        this.cengStudents = cengStudents;
    }

    public void getEngineeringStudents(List<Student> sengList, List<Student> cengList) {
        sengList.addAll(cengList);
        Collections.sort(sengList, Student.StuGradeComparator);

        for(Student str: sengList){
            System.out.println(str);
        }
    }

    public double getEngineeringAverageGrade(List<Student> sengList, List<Student> cengList) {
        sengList.addAll(cengList);

        int sum = 0;

        for(int i = 0; i < sengList.size(); i++) {
            sum += sengList.get(i).getGrade();
        }

        double avg = sum/sengList.size();
        return avg;
    }

    public void getEngineeringBestAndWorst(List<Student> sengList, List<Student> cengList) {
        sengList.addAll(cengList);

        Student studentMostSuccesfull = Collections.max(sengList);
        System.out.println("Mühendislik Fakültesi En Başarılı Öğrenci --> Adı: " + studentMostSuccesfull.getName() + ", " + "Harf Notu: " + studentMostSuccesfull.getLetterGrade());

        Student studentMostUnsuccessful = Collections.min(sengList);
        System.out.println("Mühendislik Fakültesi En Başarısız Öğrenci --> Adı: " + studentMostUnsuccessful.getName() + ", " + "Harf Notu: " + studentMostUnsuccessful.getLetterGrade());

    }
}
