// Could also be done by extending Thread class, however since Java does not allow multiple inheritance it is much better to implement Runnable interface instead
public class MultithreadThing implements Runnable {
    @Override
    public void run() {
        for(int i = 0; i < 7; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }
}