public class construct {
    public static void main(String[] args){
        Student s1 = new Student("Pratham");
        Student s2 = new Student();
        Student s3 = new Student(15);
        System.out.println(s1.name);
    }
    
}


class Student{
    String name ;
     int roll;

     Student(){
        System.out.println("Contructor is called...");
     }

     Student(String name){
        this.name  = name;
     }

     Student(int roll){
        this.roll = roll;
     }
}
