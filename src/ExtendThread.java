public class ExtendThread extends Thread{

    private Thread th;
    private Long number;
    private String threadName;

    public ExtendThread(Long number, String threadName){
        this.number = number;
        this.threadName = threadName;
    }

    public void run(){
        for(int i =0; i<= getNumber().intValue(); i++){
            System.out.println("insideThread: "+getName()+ " Number: " + i);
        }
    }

    public void Start(){
        if(th == null)
            th = new Thread(this,"Text");
            th.start();
    }


    // Getters and Setters

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public String getThreadName() {
        return threadName;
    }

    public void setThreadName(String threadName) {
        this.threadName = threadName;
    }
}