package student.grade.system;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        List<Student> sengList = new ArrayList<>();

        sengList.add(new Seng(1,"Tolga",27, random.nextInt(101)));
        sengList.add(new Seng(2,"Fırat",26, random.nextInt(101)));
        sengList.add(new Seng(3,"Atakan",25, random.nextInt(101)));
        sengList.add(new Seng(4,"Barış",24, random.nextInt(101)));
        sengList.add(new Seng(5,"Kaan",23, random.nextInt(101)));
        sengList.add(new Seng(6,"Efe",22, random.nextInt(101)));
        sengList.add(new Seng(7,"Sinem",21, random.nextInt(101)));
        sengList.add(new Seng(8,"Tuğçe",20, random.nextInt(101)));
        sengList.add(new Seng(9,"Fatma",19, random.nextInt(101)));
        sengList.add(new Seng(10,"Kardelen",19, random.nextInt(101)));
        sengList.add(new Seng(11,"Ayten",20, random.nextInt(101)));
        sengList.add(new Seng(12,"Ayşe",21, random.nextInt(101)));

        List<Student> cengList = new ArrayList<>();

        cengList.add(new Ceng(1, "Enver",18, random.nextInt(101)));
        cengList.add(new Ceng(2, "Talat",19, random.nextInt(101)));
        cengList.add(new Ceng(3, "Cemal",20, random.nextInt(101)));
        cengList.add(new Ceng(4, "Mustafa",21, random.nextInt(101)));
        cengList.add(new Ceng(5, "Kemal",22, random.nextInt(101)));
        cengList.add(new Ceng(6, "Fahrettin",23, random.nextInt(101)));
        cengList.add(new Ceng(7, "Nazım",24, random.nextInt(101)));
        cengList.add(new Ceng(8, "Niyazi",25, random.nextInt(101)));
        cengList.add(new Ceng(9, "İbrahim",26, random.nextInt(101)));
        cengList.add(new Ceng(10, "Remziye",24, random.nextInt(101)));
        cengList.add(new Ceng(11, "Safiye",24, random.nextInt(101)));
        cengList.add(new Ceng(12, "Süreyya",24, random.nextInt(101)));
        cengList.add(new Ceng(13, "Sabiha",24, random.nextInt(101)));
        cengList.add(new Ceng(14, "Leman",24, random.nextInt(101)));
        cengList.add(new Ceng(15, "Feriha",24, random.nextInt(101)));
        cengList.add(new Ceng(16, "Lale",24, random.nextInt(101)));
        cengList.add(new Ceng(17, "Jale",24, random.nextInt(101)));
        cengList.add(new Ceng(18, "Esma",24, random.nextInt(101)));

        Engineering engineering = new Engineering(sengList, cengList);

        Scanner scanner = new Scanner(System.in);
        String transactions = "İşlemler\n"
                            + "1. Yazılım Mühendisliği Bölümü Not Listeleri(En başarılıdan en başarıza)\n"
                            + "2. Bilgisayar Mühendisliği Bölümü Not Listeleri(En başarılıdan en başarıza)\n"
                            + "3. Yazılım Mühendisliği En Başarılı Öğrenci ve En Başarısız Öğrenci\n"
                            + "4. Bilgisayar Mühendisliği En Başarılı ve En Başarısız Öğrenci \n"
                            + "5. Her iki bölüm için not ortalamaları \n"
                            + "6. Mühendislik Fakültesi bazında not ortalaması \n"
                            + "7. Mühendislik Fakültesi En Başarılı ve En Başarısız Öğrenci \n"
                            + "0. Çıkış";
        System.out.println("*****************************");
        System.out.println(transactions);
        System.out.println("*****************************");
        while(true) {
            System.out.print("İşlem seçiniz: ");
            String islem = scanner.nextLine();

            if(islem.equals("1")) {
                Collections.sort(sengList, Student.StuGradeComparator);

                for(Student str: sengList){
                    System.out.println(str);
                }
            } else if (islem.equals("2")) {
                Collections.sort(cengList, Student.StuGradeComparator);

                for(Student str: cengList){
                    System.out.println(str);
                }
            } else if (islem.equals("3")) {
                Student studentMostSuccesfull = Collections.max(sengList);
                System.out.println("Yazılım Mühendisliği En Başarılı Öğrenci --> Adı: " + studentMostSuccesfull.getName() + ", " + "Harf Notu: " + studentMostSuccesfull.getLetterGrade());

                Student studentMostUnsuccessful = Collections.min(sengList);
                System.out.println("Yazılım Mühendisliği En Başarısız Öğrenci --> Adı: " + studentMostUnsuccessful.getName() + ", " + "Harf Notu: " + studentMostUnsuccessful.getLetterGrade());
            } else if (islem.equals("4")) {
                Student studentMostSuccesfull = Collections.max(cengList);
                System.out.println("Bilgisayar Mühendisliği En Başarılı Öğrenci --> Adı: " + studentMostSuccesfull.getName() + ", " + "Harf Notu: " + studentMostSuccesfull.getLetterGrade());

                Student studentMostUnsuccessful = Collections.min(cengList);
                System.out.println("Bilgisayar Mühendisliği En Başarısız Öğrenci --> Adı: " + studentMostUnsuccessful.getName() + ", " + "Harf Notu: " + studentMostUnsuccessful.getLetterGrade());
            } else if (islem.equals("5")) {
                double sengAverage = Seng.getAverageGrade(sengList);
                System.out.println("Yazılım Mühendisliği Not Ortalaması: " + sengAverage);

                double cengAverage = Ceng.getAverageGrade(cengList);
                System.out.println("Bilgisayar Mühendisliği Not Ortalaması: " + cengAverage);
            } else if (islem.equals("6")) {
                double engAveregae = engineering.getEngineeringAverageGrade(sengList, cengList);
                System.out.println("Mühendislik Fakültesi Not Ortalaması: " + engAveregae);
            } else if (islem.equals("7")) {
                engineering.getEngineeringBestAndWorst(sengList, cengList);
            } else if (islem.equals("0")) {
                System.out.println("İşlemlerden çıkılıyor");
                return;
            } else {
                System.out.println("Geçersiz işlem. Lütfen yukardaki işlemlerden birini seçiniz");
            }

        }
    }
}
