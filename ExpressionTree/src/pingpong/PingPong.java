package pingpong;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class PingPong
{
    
    public static void main(String [] args)
    {
        
        Lock lock = new ReentrantLock();  
        Condition condition = lock.newCondition();
        
        CountDownLatch countDownLatch = new CountDownLatch(1);
        
        Worker worker1 = new Worker("Ping", lock,condition, countDownLatch);
        Worker worker2 = new Worker("Pong", lock, condition, countDownLatch);
        
        new Thread(worker1).start();
        new Thread(worker2).start();
        
        countDownLatch.countDown();
        
    }

}
