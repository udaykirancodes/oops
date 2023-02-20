import java.util.*;

class MyThread extends Thread{
    public void run(){
        int i=1;
        while(i<10000)
        {
            System.out.println(i++);
        }
    }
}
class MyThreadMain{
    public static void main(String[] args) {
        MyThread t=new MyThread();
        t.start();
    }
}