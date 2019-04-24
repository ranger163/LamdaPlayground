package me.inassar.unit1;

public class RunnableExample {

    public static void main(String[] args) {

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Printed Inside Runnable");
            }
        });
        thread.run();

        Thread lambdaThread = new Thread(() -> System.out.println("Printed Inside Lambda Runnable"));
        lambdaThread.run();
    }

}
