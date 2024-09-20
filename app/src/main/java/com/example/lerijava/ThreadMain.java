package com.example.lerijava;

public class ThreadMain {
    public static void main(String args[]){

        firstThread t1 = new firstThread();
        t1.start(); // .run ile de thread çalışır ancak .start ile multitasking özelliği de devreye girerek çalışıyor.
        Thread t2 = new Thread(new SecondThread());
        t2.start();


        for (int i=0;i<100;i++){
            System.out.println("Main : "+ i);
        }
    }

    static class firstThread extends Thread{
        @Override
        public void run() {
            for (int i=0;i<100;i++){
                System.out.println("First Thread : "+ i);

        }
    }

}
}
