package Siniflar.OgrenciNotSistemi;

public class Student {
    String name, stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double average;
    boolean isPass;


    Student(String name, int classes, String stuNo, Course mat, Course fizik, Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAvarage();
        this.isPass = false;
    }


    public void addBulkExamNote(int mat, int fizik, int kimya) {

        if (mat >= 0 && mat <= 100) {
            this.mat.examNote = mat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.examNote = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.examNote = kimya;
        }

    }

    public void addOpinionNote(int mat, int fizik, int kimya) {
        if (mat >= 0 && mat <= 100) {
            this.mat.opinionNote = mat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.opinionNote = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.opinionNote = kimya;
        }
    }

    public void isPass() {
        if (this.mat.examNote == 0 || this.fizik.examNote == 0 || this.kimya.examNote == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();

            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void calcAvarage() {

        this.mat.courseAverageNote = (this.mat.examNote * 0.7 + this.mat.opinionNote * 0.3);

        this.fizik.courseAverageNote = (this.fizik.examNote * 0.8 + this.fizik.opinionNote * 0.2);

        this.kimya.courseAverageNote = (this.kimya.examNote * 0.75 + this.kimya.opinionNote * 0.25);

        this.average = (this.mat.courseAverageNote + this.fizik.courseAverageNote + this.kimya.courseAverageNote) / 3;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.average > 55;
    }

    public void printNote() {
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.mat.courseAverageNote);
        System.out.println("Fizik Notu : " + this.fizik.courseAverageNote);
        System.out.println("Kimya Notu : " + this.kimya.courseAverageNote);
        System.out.println("Ortalama : " + this.average);
    }

}
