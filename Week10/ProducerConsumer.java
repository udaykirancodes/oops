import java.util.*;
class consumer extends Thread{
    public void run()
    {
        int i=0;
        while(i<1000)
        {
            System.out.println(i++);
        }
    }
}


class ProducerConsumer {
    public static void main(String[] args) {
        consumer c=new consumer();
        c.start();
        while(true){
            System.out.println(c.getState());
            try{
                Thread.sleep(10000);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
            if(!c.isAlive()){
                break;
            }
        }
        System.out.println(c.getState());
    }   
}
