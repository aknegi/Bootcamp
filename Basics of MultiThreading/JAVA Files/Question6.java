import java.util.concurrent.*;

class Counter6 {
    private int id;
    public Counter6(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
}

public class Question6 {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newCachedThreadPool();

        Future<Integer> future = executor.submit(new Callable<Integer>() {
            @Override
            public Integer call() {
                Counter6 counter = new Counter6(20);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                return counter.getId();
            }
        });
        executor.shutdown();
        try {
            System.out.println("main method ends and the id is= " + future.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        System.out.println("Is Cancelled? " + future.isCancelled());
        System.out.println("Is Done? " + future.isDone());
    }
}
