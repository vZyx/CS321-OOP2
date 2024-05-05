package CONCURRENCY.EX1;


class ThreadEx1 {
    public static void main(String [] args ) {
        SimpleTask task1 = new SimpleTask();
        Thread t1 = new Thread(task1);
        Thread t2 = new Thread(task1);
        t2.start(); // Schedules this thread to begin execution. The thread will execute independently of the current thread.
        t1.start(); //A thread can be started at most once. In particular, a thread can not be restarted after it has terminated.
        System.out.println("End of Main Thread");
    }
}
/* for MyThread
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        t2.start(); // Schedules this thread to begin execution. The thread will execute independently of the current thread.
        t1.start(); //A thread can be started at most once. In particular, a thread can not be restarted after it has terminated.

////for SimpleTask/////

        SimpleTask task1 = new SimpleTask();
        Thread t1 = new Thread(task1);
        Thread t2 = new Thread(task1);
        t2.start(); // Schedules this thread to begin execution. The thread will execute independently of the current thread.
        t1.start(); //A thread can be started at most once. In particular, a thread can not be restarted after it has terminated.
        System.out.println("End of Main Thread");

*/