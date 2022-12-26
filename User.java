public class User {
    public String name;
    public int birthYear;

    public int currentAge() {
        return 2023 - birthYear;
    }
}