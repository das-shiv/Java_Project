public class ArrayOfObjects{
    public static class Student{
        String name;
        int rollNo;
        int marks ;

        public void studying(){
            System.out.println("studying.");
        }
    }

    public static void main(String[] args) {

        Student s1 = new Student();
        s1.name = "raju";
        s1.marks = 76;
        s1.rollNo = 2;

        Student s2  = new Student();
        s2.name = "shiv";
        s2.marks = 84;
        s2.rollNo = 1;

        Student s3 = new Student();
        s3.name = "leo";
        s3.marks = 70;
        s3.rollNo = 4;

       Student[] students = new Student[3]; // creating an array named students to hold Student class's objects
       students[0] = s1;
       students[1] = s2;
       students[2] = s3;

        for (Student stud : students) { // stud is a variable of type Student. It holds the value of students[] array at each iteration
            System.out.println("The name of this student is " + stud.name + " . His Roll no. is " + stud.rollNo + " . He has got " + stud.marks + " marks.");
            System.out.print(stud.name + " is now ");
            stud.studying();

        }
        
    }
}
