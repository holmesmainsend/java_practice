public class AnonymousInnerClass {
    public static void main(String[] args) {
        Animal normalAnimal = new Animal();
        normalAnimal.makeNoise();

        Animal anonymousBigfoot = new Animal() {
            @Override
            public void makeNoise() {
                System.out.println("GRAHWWWHHHH");
            }
        };
        anonymousBigfoot.makeNoise();

        // Runnable typically used for multithreading
        Runnable myAnonymousRunnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("I'm an anonymous runnable");
            }
        };
        myAnonymousRunnable.run();
    }
}