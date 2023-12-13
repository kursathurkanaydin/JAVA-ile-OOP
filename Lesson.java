package StudentDataProject;

public class Lesson {
    String name;
    int note1,note2,note3;

    Lesson(String name,int note1,int note2,int note3){
        this.name=name;
        this.note1=note1;
        this.note2=note2;
        this.note3=note3;
    }
    void lessonInfo(){
        System.out.println("Ders Adı: "+name);
        System.out.println("1.Notu  : "+note1);
        System.out.println("2.Notu  : "+note2);
        System.out.println("3.Notu  : "+note3);
        notHesapla();
    }

    void notHesapla(){
        double sonuc=note1+note2+note3;
        sonuc/=3;
        System.out.println(name+" Dersinin Not Ortalaması: "+sonuc);
    }

}
