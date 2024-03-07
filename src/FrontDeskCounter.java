public class FrontDeskCounter extends Thread{
    int id;
    public FrontDeskCounter( int i){
        this.id=i;
    }
    @Override
    public void run() {
        System.out.println(Thread.currentThread());
        int i=1;
        for(;i<10;)
            System.out.print("Thunder "+id+" : "+i+++" ");
    }
}
