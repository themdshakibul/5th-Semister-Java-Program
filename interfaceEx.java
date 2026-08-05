//? ইন্টারফেস ও মালটি ইন্টারফেস  প্রক্রিয়া  Example

interface Student{
    static final int roll = 20202;
    static final String name = "Md Shakibul Islam";
    void display();
}

interface Exam{
    static final String Exam_name = "Java Programming";
    static final int Exam_Marks = 100;
    void display();
}

class Result implements Student, Exam{
    public void display(){
        System.out.println("Roll No: " + roll);
        System.out.println("Name: " + name);
    }

    public void display2(){
        System.out.println("Exam Name: " + Exam_name);
        System.out.println("Marks: " + Exam_Marks);
    }
}


public class interfaceEx{
    public static void main(String[] args) {
        Result r1 = new Result();

        r1.display();
        r1.display2();
    }
}