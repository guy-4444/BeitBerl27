package lesson4;

public class Student {

    private static int ID = 1000;

    private int id;
    private String name = "NA";
    private int[] grades = new int[5];

    public Student(String name) {
        this.id = ID++;
        setName(name);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.isBlank()) {
            this.name = name;
        }
    }

    public int[] getGrades() {
        return grades;
    }

    public int getAverageGrade() {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        int avg = sum / grades.length;
        return avg;
    }

    public void printDetails() {
        String str = "";
        for (int grade : grades) {
            str += grade + " ";
        }
        System.out.println(getName() + " | The Average: " + getAverageGrade() + " | grades: " + str);
    }

    public static void printStudentDetails(Student st) {
        st.printDetails();
    }
}
