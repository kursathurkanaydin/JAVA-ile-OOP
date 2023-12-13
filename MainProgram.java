package StudentDataProject;

public class MainProgram {
    public static void main(String[] args) {
        Student s1=new Student("Kürşat","Aydın","9031");
        Lesson lesson=new Lesson("Math",100,80,90);
        Lesson lesson2=new Lesson("PHY",80,70,68);
        s1.dersEkle(lesson);
        s1.dersEkle(lesson2);
        s1.dersInfo(lesson);
        s1.dersInfo(lesson2);
    }
}
