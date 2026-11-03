import lesson3.Animal;
import lesson3.Car;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello Main");

        Car c1 = new Car("Mitsubishi Carisma", 1998);
        c1.km = 100_000;
        c1.consumption = 13.4;
        c1.hp = 90;

        Car c2 = new Car("Mercedes C", 1990);
        c2.km = 200_000;
        c2.consumption = 8.4;
        c2.hp = 200;
        c2.isHybrid = true;

        c1.print();
        c2.print();

        Car.printLastID();



        Animal a2 = new Animal("Jackal", 1900);
        a2.name = "Avi";

        Animal a3 = new Animal("Elephant", "Yossi", 1980);

        if (a3.getType().equals("Elephant")) {

        }



    }




}
