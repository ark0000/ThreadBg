public class LabDeskCounter extends Thread{
    @Override
    public void run() {
        int i=1;
        for(;i<10;)
            System.out.print("Lab "+i+++" ");
    }
}
