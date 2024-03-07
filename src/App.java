


public class App {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread());
        new FrontDeskCounter(1).start();
        new FrontDeskCounter(2).start();
        System.out.println("ooo");
        System.out.println(Thread.activeCount());
        new LabDeskCounter().start();
    }
}
