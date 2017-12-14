package dp;

public class Application {
    public static void main(String[] args) {
        for (int i=1;i<=5;i++){
            ThreadedTask threadedTask=new ThreadedTask("T"+i);
            threadedTask.start();
        }
    }
}
