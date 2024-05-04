package CONCURRENCY.EX1;

class SimpleTask implements Runnable{
    public void run() {
        String name=Thread.currentThread().getName();
        System.out.println(name + " is running ");
    }
}