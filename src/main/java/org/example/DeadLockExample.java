package org.example;

public class DeadLockExample {

    public static void main(String[] args){

           DeadLockExample deadLockExample = new DeadLockExample();
           Pen pen = deadLockExample.new Pen();
           Paper paper = deadLockExample.new Paper();
           Task1 task1 = deadLockExample.new Task1(pen,paper);
           Task2 task2 = deadLockExample.new Task2(pen,paper);

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
            pen.writeWithPenAndPaper(paper);
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
            paper.writeWithPenAndPaper(pen);
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
