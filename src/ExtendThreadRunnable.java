public class ExtendThreadRunnable implements Runnable{
    private Thread th;

    @Override
    public void run() {
        System.out.println("anything");
    }

    public void Start(){
        System.out.println("Thread testing");
        if(th == null)
            th = new Thread(this,"Text");
        th.start();
    }

    public Thread getTh() {
        return th;
    }

    public void setTh(Thread th) {
        this.th = th;
    }
}
