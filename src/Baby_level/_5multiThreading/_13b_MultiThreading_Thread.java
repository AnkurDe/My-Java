package Baby_level._5multiThreading;

public class _13b_MultiThreading_Thread {

    private static class MyThread extends Thread {
        public void run() {
            System.out.println("Thread Running: ");
        }
    }

    public static void main(String[] args) {
        // Launching 8 threads
        MyThread[] threads = new MyThread[8];
        System.out.println("Main thread");

        // Initialize each thread in the array
        for (int i = 0; i < threads.length; i++)
            threads[i] = new MyThread();

        for (MyThread t : threads)
            t.start();
    }
}