package prac3;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;



public class LockList<E>  {
    private static final Lock lock = new ReentrantLock();
    private List<E> list = new ArrayList<>();

    public int size() {
        lock.lock();
        try{
            return list.size();
        }
        finally {
            lock.unlock();
        }
    }

    public void add(E temp){
        lock.lock();
        list.add(temp);
        lock.unlock();
    }

    public E get(int index){
        lock.lock();
        try{
            return list.get(index);
        }
        finally {
            lock.unlock();
        }
    }
    public void remove(int index){
        lock.lock();
        list.remove(index);
        lock.unlock();
    }
}
