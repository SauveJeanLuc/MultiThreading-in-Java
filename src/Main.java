public class Main {
    public static void main(String[] args) throws Exception{
        ExtendThread thread1 = new ExtendThread(2L,"A");
        thread1.start();

        thread1 = new ExtendThread(2L, "B");
        thread1.start();

    }
}
