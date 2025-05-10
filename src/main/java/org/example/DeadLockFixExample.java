package org.example;

public class DeadLockFixExample {

    public static void main(String[] args){

        DeadLockFixExample deadLockFixExample = new DeadLockFixExample();
        Pen pen = deadLockFixExample.new Pen();
        Paper paper = deadLockFixExample.new Paper();
        Task1 task1 = deadLockFixExample.new Task1(pen,paper);
        Task2 task2 = deadLockFixExample.new Task2(pen,paper);

        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);
        thread1.start();
        thread2.start();

    }

    class Task1 implements Runnable {

        Pen pen;
        Paper paper;

        Task1(Pen pen , Paper paper){
            this.pen = pen;
            this.paper = paper;
        }

        public void run(){

            synchronized (paper) {
                pen.writeWithPenAndPaper(paper);
            }
        }
    }

    class Task2 implements Runnable {

        Pen pen;
        Paper paper;

        Task2(Pen pen , Paper paper){
            this.pen = pen;
            this.paper = paper;
        }

        public void run(){

            synchronized (pen) {
                paper.writeWithPenAndPaper(pen);
            }

        }
    }

    class Pen {

        public synchronized void writeWithPenAndPaper(Paper paper){
            System.out.println(Thread.currentThread().getName() + " is using pen " + this +
                    "and trying to write");

                paper.finishWriting();
        }

        public synchronized void finishWriting(){
            System.out.println(Thread.currentThread().getName() + "finished writing with pen and paper");
        }

    }

    class Paper {

        public synchronized void writeWithPenAndPaper(Pen pen){
            System.out.println(Thread.currentThread().getName() + " is having paper " + this +
                    "and trying to get Pen");

                pen.finishWriting();

        }

        public synchronized void finishWriting(){
            System.out.println(Thread.currentThread().getName() + "finished writing with pen and paper");
        }

    }
}
