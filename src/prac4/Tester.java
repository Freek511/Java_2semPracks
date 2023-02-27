package prac4;

import java.util.concurrent.*;

public class Tester {
    public static void main(String[] args) throws ExecutionException, InterruptedException, TimeoutException {
        MyExecutorService executorService = new MyExecutorService(3);
        executorService.submit(() -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("We run it");
        });
        executorService.submit(() -> System.out.println("Start"));
    }
}