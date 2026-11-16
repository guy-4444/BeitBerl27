package lesson4;

public class PrimitiveArrays {

    public void start() {
        int[] arr1 = new int[3];
        int[] arr2 = new int[]{0, 0, 0};
        int[] arr3 = new int[]{0, 1, 2, 3, 4, 5, 6};
        String[] animals = new String[10];
        Student[] students = new Student[10];

        for (int i = 0; i < arr3.length; i++) {
            System.out.println(i + ": " + arr3[i]);
        }

        int j = 0;
        while (j < arr3.length) {
            System.out.println(j + ": " + arr3[j]);
            j++;
        }


        String[] names = new String[] {"Tal", "Avi", "Eli"};
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }


        for (String name : names) {

        }

        for (int x : arr3) {

        }
    }
}
