public class Student {

    public String fname;
    public String lname;
    private int indexNumber;
    private String email;
    private String address;
    public double[] grades = new double[20];

    private StudentGroup studentGroup;

    public void averageCalculate() {

        this.grades = new double[]{3, 5, 4.5};

        double sum = 0.0;
        for (int i = 0; i < grades.length; i++) {
            sum += grades[i];
        }
        if (sum == 0.0) {
            throw new IllegalArgumentException();
        }
        double average = Math.ceil(sum / grades.length);

        System.out.println(average);


    }
}