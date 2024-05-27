public class Copy_Const {
    public static void main(String[] args){

        Student s1 = new Student();
        s1.name = " Pratham ";
        s1.roll = 23;
        s1.marks[0]= 67;
        s1.marks[1]=98;
        s1.marks[2]=100;
        Student s2 = new Student(s1);
        s1.marks[2]= 100;
        
        for(int i=0;i<3;i++){
            System.out.println(s2.marks[i]);
        }
    }
    
}

class Student{
    String name ;
    int roll;
    String password;
    int marks[]={1,2,3};

    // Student(Student s1){
    //      marks = new int[3];
    //     this.name = s1.name;
    //     this.roll = s1.roll;
    //     this.marks = s1.marks;
    // }

    Student(Student s1){
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        for(int i =0;i<marks.length;i++){
            this.marks[i]=s1.marks[i];
        }

    }

    Student(){
        System.out.println("COnstructor is called");

    }
}
