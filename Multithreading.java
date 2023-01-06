public class Multithreading {
    public static void main(String[] args) {
        // Threads will print out in random order; firstly created thread not necessarily first to be printed
        for(int i = 0; i < 4; i++) {
            MultithreadThing myThing = new MultithreadThing();
            Thread myThread = new Thread(myThing);
            myThread.start();
        }
    }
}