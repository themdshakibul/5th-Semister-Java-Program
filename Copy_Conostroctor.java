//  কপি কনস্ট্রাক্টর 


class Student{
    String name;
    int age;
    
    Student (String n, int a){
        name = n;
        age = a;
    }

    void Showinfo(){
        System.out.println("Enter the name" + name);
        System.out.println("Enter the age" + age);
    }
}


/**
 * Copy_Conostroctor
 */
public class Copy_Conostroctor {
    public static void main(String[] args){
        Student s1 = new Student("Md Shakibul Islam", 20);
        Student s2 = new Student("Md Rokibul Islam", 18);
        Student s3 = new Student("Md Rifat", 20);

        s1.Showinfo();
        System.out.println("Enter the first info");

        s2.Showinfo();
        System.out.println("Enter the second info");

        s3.Showinfo();
        System.out.println("Enter the third info");
    }
}