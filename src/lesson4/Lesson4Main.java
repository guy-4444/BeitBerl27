package lesson4;

import java.util.Random;

public class Lesson4Main {

    public void start() {
        System.out.println(" - - -Lesson4Main- - - ");

        // random.nextInt(max - min + 1) + min;
        Random random = new Random();
        int x = random.nextInt(100 - 90 + 1) + 90;

//        Student[] students = new Student[6];
//        students[0] = s0;
//        students[1] = s1;
//        students[2] = s2;
//        students[3] = s3;
//        students[4] = s4;
//        students[5] = s5;

        // same
        // Student[] students = new Student[] {s0, s1, s2, s3, s4, s5};

        Student[] students = new Student[6];

        students[0] = new Student("");
        students[1] = new Student("");
        students[2] = new Student("");
        students[3] = new Student("");
        students[4] = new Student("");
        students[5] = new Student("");

        String[] names = new String[]{"Avi", "Eli", "Tal", "Ron", "Rom", "Tom", };
        for (int i = 0; i < students.length; i++) {
            students[i].setName(names[i]);
        }

        for (Student student : students) {
            for (int i = 0; i < student.getGrades().length; i++) {
                student.getGrades()[i] = random.nextInt(11) + 90;
            }
        }


        for (Student s : students) {
            s.printDetails();
        }
    }



}
