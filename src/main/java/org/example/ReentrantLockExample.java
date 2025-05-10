package org.example;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReentrantLockExample {

       Lock lock = new ReentrantLock();
       Lock writeLock = new ReentrantReadWriteLock().writeLock();

       public static void main(String[] args){
             ReentrantLockExample reentrantLockExample = new ReentrantLockExample();
             reentrantLockExample.firstMethod();
       }

       public void firstMethod(){
              // lock count 1
              lock.lock();

              try {
                  System.out.println("Lock is acquired on first method");
                  secondMethod();
              } finally {
                  // lock count 0
                  lock.unlock();
              }

       }

       public void secondMethod(){
              //lock count 2
              lock.lock();

              try{
                  System.out.println("Lock is acquired on second method");
              } finally {
                  // lock count 1
                  lock.unlock();
              }
       }
}
