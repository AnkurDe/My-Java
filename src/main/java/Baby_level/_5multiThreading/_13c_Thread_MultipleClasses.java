package Baby_level._5multiThreading;

public class _13c_Thread_MultipleClasses {

    private static class MyThread1 extends Thread {
        private int x;
        @Override
        public void run() {
            x = x+1;
            System.out.println("Thread 1 running");
        }
    }

    private static class MyThread2 extends Thread {
        private int x;
        @Override
        public void run() {
            x = x+1;
            System.out.println("Thread 2 Running: ");
        }
    }

    public static void main(String[] args) {
        System.out.println("Main thread");

        MyThread1[] threads = new MyThread1[8]; // Launching 8 threads
        MyThread2[] threads2 = new MyThread2[8]; // Launching 8 threads
        // Initialize each thread in the array
        for (int i = 0; i < threads.length; i++)
            threads[i] = new MyThread1();

        for (int i = 0; i < threads2.length; i++)
            threads2[i] = new MyThread2();

        // Initialize each thread in the array
        for (MyThread1 t : threads)
            t.start();

        for (MyThread2 t : threads2)
            t.start();
    }
}