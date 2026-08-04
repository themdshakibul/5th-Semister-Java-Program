class Method_overloding{
    void info(String name){
        System.out.println("Enter The Name" + name);
    }

    void info(String name, int age){
        System.out.println("Enter The Name" + name);
        System.out.println("Enter The Age" + age);
    }

    void info(String name, int age, String dep){
        System.out.println("Enter The Name" + name);
        System.out.println("Enter The Age" + age);
        System.out.println("Enter The Dep" + dep);
    }
}


public class InnerMethod_overloding {
    public static void main(String [] args){
        Method_overloding obj = new Method_overloding();
        obj.info("Md Shakibul Islam");
        obj.info("Md Shakibul Islam", 20);
        obj.info("Md Shakibul Islam", 20, "CSE");
    }
}