package Baby_level;

public class _13d_ThreadSpawningThreads {

    private static class MyThread1 extends Thread {
        @Override
        public void run() {
            MyThread2[] threads = new MyThread2[4];
            System.out.println("-----Thread 1 running-----");
            for (int i = 0; i < threads.length; i++) {
                threads[i] = new MyThread2();
            }
            for (MyThread2 thread : threads)
                thread.start();
        }
    }

    private static class MyThread2 extends Thread {
        @Override
        public void run() {
            System.out.println("*****Thread 2 Running*****");
        }
    }

    public static void main(String[] args) {
        System.out.println("Main thread");

        MyThread1[] threads = new MyThread1[800]; // Launching 8 threads
        // Initialize each thread in the array
        for (int i = 0; i < threads.length; i++)
            threads[i] = new MyThread1();

        // Initialize each thread in the array
        for (MyThread1 t : threads)
            t.start();
    }
}