
public class Main {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.fname="Piotr";
        s1.lname="Pietruszkiewicz";
        s1.averageCalculate();

        Student s2 = new Student();
        s2.fname="Ada";
        s2.lname="Gruszka";
        s2.averageCalculate();

        StudentGroup g1 = new StudentGroup();
        g1.addStudent(s1);
        g1.addStudent(s2);




    }
}