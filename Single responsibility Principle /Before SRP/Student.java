public class Student {
    public String name ;
    public String national_ID ;
    public int Stud_ID ;

    public Student(String name, String national_ID, int stud_ID) {
        this.name = name;
        this.national_ID = national_ID;
        Stud_ID = stud_ID;
    }
    public void printinfo (){
        System.out.println("the information for the student is : ");
        System.out.print("name :");
        System.out.println(name);
        System.out.print("national_id :");
        System.out.println(national_ID);
        System.out.print("Student id :");
        System.out.println(Stud_ID);
    }
}
