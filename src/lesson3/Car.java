package lesson3;

public class Car {

    private static int ID = 0;

    private String model;
    private int id;
    public int year;
    public int km = -1;
    public int hp;
    public int numOfWheels;
    public double consumption = 0;
    public boolean isHybrid = false;

    public Car(String model, int year) {
        this.id = ++ID;
        this.model = model;
        this.year = year;
    }

    public void print() {
        System.out.println(id + ": " + model + ", year: " + year + ", km: " + km + ", hp: " + hp + ", consumption: " + consumption + ", isHybrid: " + isHybrid + ", wheels: " + numOfWheels);
    }

    public static void printLastID() {
        System.out.println("ID: " + ID);
    }

}
