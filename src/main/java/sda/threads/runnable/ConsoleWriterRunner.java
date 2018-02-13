package sda.threads.runnable;

public class ConsoleWriterRunner {

    public static void main(String[] args) {
        Runnable r1 = new ConsoleWriter(1);
        Runnable r2 = new ConsoleWriter(2);

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();

        System.out.println("Ostatnia instrukcja metody main");
    }
}
