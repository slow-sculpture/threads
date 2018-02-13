package sda.threads.callable;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class NumberGeneratorRunner {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(10);

        //Przykład pojedyńczego wywowałania - zapisywany w zmiennej typu Future<>
        Callable callable = new NumberGenerator(0);
        Future<String> futureValue = executor.submit(callable);
        System.out.println(futureValue.get());

        //Przykład wielu wywołań w pętli - wykonywanie paczkami po 10
        List<Future<String>> randomResults = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            Callable generator = new NumberGenerator(i);
            randomResults.add(executor.submit(generator));
        }

        for (Future<String> randomResult : randomResults) {
            System.out.println(randomResult.get());
        }
        executor.shutdown();
    }
}
