package sda.threads.callable;

import java.util.Random;
import java.util.concurrent.Callable;

public class NumberGenerator implements Callable {
    int threadNo;

    public NumberGenerator(int threadNo) {
        this.threadNo = threadNo;
    }

    //wątek zwracający w odstępach 1s losowe dane
    @Override
    public String call() throws Exception {
        Thread.sleep(1000);
        Random random = new Random();
        return "Random z wątku nr " + threadNo +": " + random.nextInt();
    }
}
