package chap26_MultiThreading.Synchronize;

public class Counter {


        private int count = 0;

        public synchronized void increment(){
            count ++;

        }

    public int getCount() {
        return count;
    }
}
