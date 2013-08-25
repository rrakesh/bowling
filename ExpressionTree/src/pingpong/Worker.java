package pingpong;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

public class Worker implements Runnable
{
    private String name;
    private Lock lock;
    private Condition condition;
    private CountDownLatch countDownLatch;
    
    public Worker(String name, Lock lock, Condition condition, CountDownLatch countDownLatch) {
        this.name = name;
        this.lock = lock;
        this.condition = condition;
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run()
    {
        try {
            this.countDownLatch.await();
        } catch(Exception e) {
            
        }
        lock.lock();
        for(int i = 0; i < 3; i++) {
            try {
                condition.await();
                System.out.println(this.name);
            } catch (InterruptedException e)
            {
                System.out.println("Unexpected exception");
                throw new RuntimeException(e);
            } finally {
                condition.signal();
                lock.unlock();
            }
        }
    }
}
