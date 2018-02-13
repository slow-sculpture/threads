package sda.threads.runnable;

public class ConsoleWriter implements Runnable {
    private int threadNo;

    public ConsoleWriter(int threadNo) {
        this.threadNo = threadNo;
    }

    //prosty wątek wypisujący co 1 sekundę tekst na konsoli
    @Override
    public void run() {
        int i = 0;
        while (i <=10) {
            try {
                Thread.sleep(1000);
                System.out.println("JESTEM WĄTKIEM NR " + threadNo);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
