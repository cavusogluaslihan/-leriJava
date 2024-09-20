package com.example.lerijava;

public class ThreadObjectMain {
    public static void main(String args[]){


        Student s1 = new Student(23, "jeremy");

        myThread task1 = new myThread("First Task ", s1);
        task1.start();

        myThread task2 = new myThread("Second Task ", s1);
        task2.start();

    }

    static class myThread extends Thread{
        private String nameOfTheTask;
        private Student s;

        public myThread (String nameOfTheTask,Student s){
            this.nameOfTheTask = nameOfTheTask;
            this.s = s;
        }

        public void run() {
           s.getInfo(nameOfTheTask);
        }
    }
}
