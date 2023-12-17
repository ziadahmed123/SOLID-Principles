public class Print_info {
    public student ss ;

    public Print_info(student ss) {
        this.ss = ss;
    }
    public void printinfo(){
        System.out.println("the information for the student is :");
        System.out.print("Name  :");
        System.out.println(ss.name);
        System.out.print("national_Id   :");
        System.out.println(ss.National_ID);
        System.out.print("Student ID :");
        System.out.println(ss.Stud_ID);
    }
}
