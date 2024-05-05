package CONCURRENCY;

// for Concurrency1
class Task1 implements Runnable
{
    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        for(int i=1; i<=5; i++) {
            System.out.println(threadName + "--> Counter= " + i);
        }
        System.out.println(threadName+" Completed..");
    }
}
class Task2 implements Runnable
{
    @Override
    public void run() {
        String threadName=Thread.currentThread().getName();
        System.out.println(threadName+" Nothing to do ..");
        System.out.println(threadName+" Completed..");
    }
}
