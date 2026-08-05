//!  কনস্ট্রাক্টর মেথদ ব্যবহার করে একটি জাভা প্রোগ্রাম লেখ

class Student {
    String name;

    Student (String n) {
        name = n;
    }

    Student (Student s) {
        name = s.name;
    }

    void display() {
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
        Student s1 = new Student("Md Shakibul Islam");
        Student s2 = new Student(s1);

        s1.display();
        s2.display();
    }
}
