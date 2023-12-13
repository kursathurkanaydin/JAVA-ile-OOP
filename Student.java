package StudentDataProject;
public class Student {
    String name,surname,no;
    Lesson lesson;
    Student(String name,String surname,String no){
        this.name=name;
        this.surname=surname;
        this.no=no;
    }
    void dersEkle(Lesson lesson){
        this.lesson=lesson;
    }
    void studentInfo(){
        System.out.println("AD   : "+name);
        System.out.println("SOYAD: "+surname);
        System.out.println("NO   : "+no);
    }

    void dersInfo(Lesson lesson){
        lesson.lessonInfo();

    }
    void ortalama(){
        lesson.notHesapla();
    }
}
