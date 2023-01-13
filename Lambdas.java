public class Lambdas {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        // myAnimal.print();

        // printThing(myAnimal);

        // printThing(
        //     () -> {
        //         System.out.println("Meowwwww");
        //     }
        // );

        // printThing(() -> System.out.println("Meowwwww")
        // );

        Printable lambdaPrintable = () -> System.out.println("Meowwwww");
        printThing(lambdaPrintable);

        // For single line return style with argument s:
        // Printable lambdaPrintable = (s) -> "Meow" + s;
    }
    
    static void printThing(Printable thing) {
        thing.print();
    }
}