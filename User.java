public class User {
    private String name;
    private int birthYear;

    User(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    public String getName() {
        return this.name;
    }

    public int getBirthYear() {
        return this.birthYear;
    }

    public int currentAge() {
        return 2023 - birthYear;
    }
}