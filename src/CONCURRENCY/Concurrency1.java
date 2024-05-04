package CONCURRENCY;

public class Concurrency1 {
    public static void main(String[] args) {

    Thread thread1 =new Thread (new Task1());
    Thread thread2 =new Thread(new Task2());
    Thread thread3 =new Thread (new Task1());
    thread1.start();
    thread2.start();
    thread3.start();
    System.out.println("End of Main Thread ");
} }