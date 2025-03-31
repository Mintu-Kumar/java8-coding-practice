package Sem;

import java.util.concurrent.ConcurrentHashMap;

/**
 * Write code to implement concurrentHashMap where one thread will read the value and
 * 2nd thread will write the value in the thread
 */
public class Coding {
  static  ConcurrentHashMap<Character,Integer>  map;
    class MyThread implements Runnable{


        @Override
        public void run() {

            try{
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        map.put('D',4);
        }
    }

    public static void main(String[] args){

        map =  new ConcurrentHashMap();
        map.put('A',1);
        map.put('B',2);
        map.put('C',3);

    }
}
