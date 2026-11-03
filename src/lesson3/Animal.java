package lesson3;

public class Animal {

    private String type;
    private String name;
    private int yearOfBirth;

    public Animal(String type, int yearOfBirth) {
        this.type = type;
        this.yearOfBirth = yearOfBirth;
    }

    public Animal(String type, String name, int yearOfBirth) {
        setType(type);
        setName(name);
        setYearOfBirth(yearOfBirth);
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    private void setType(String type) {
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }

    private void setYearOfBirth(int yearOfBirth) {
        if (yearOfBirth > 2026) {
            this.yearOfBirth = 2026;
        }
        else {
            this.yearOfBirth = yearOfBirth;
        }
    }
}
