import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = 1;
        int b = 1;
        String s = "";

        System.out.println("Enter net worth:");
        a = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter num of kids:");
        b = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter your name:");
        s = scanner.nextLine();
        System.out.println("Enter some number");

        int result = a / b;

        System.out.println(s + " - result: " + result);

        double gross = 10000;


        int x = 1000;





        x = Math.min(x, 5000);
        x = Math.max(x, 5000);


    }

}

















/**
int n = 0;
String s = "";
Scanner scanner = new Scanner(System.in);
System.out.println("enter number:");
n = scanner.nextInt();
System.out.println(" number:" + n);

System.out.println("enter name:");
s = scanner.nextLine();
System.out.println(" name:" + s);

System.out.println("enter number:");
n = scanner.nextInt();
System.out.println(" number:" + n);
 */