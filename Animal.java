@VeryImportantCustomAnnotation
public class Animal implements Printable {
    // String name;
    // int age;

    // Animal(String name, int age) {
    //     this.name = name;
    //     this.age = age;
    // }

    @ImportantString
    String taxonomicKingdom = "Animalia";

    @RunImmediately(times = 3)
    public void makeNoise() {
        System.out.println("Humanah humanah");
    } 

    public void print() {
        System.out.println("I have satisfied the interface");
    }
}