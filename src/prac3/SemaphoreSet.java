package prac3;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Semaphore;

public class SemaphoreSet<E>{
    private Set<E> set = new HashSet<>();
    private final Semaphore sem = new Semaphore(1, true);

    public int size() {
        try{
            sem.acquire();
            return set.size();
        }
        catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        finally {
            sem.release();
        }
    }

    public void add(E temp){
        try{
            sem.acquire();
            set.add(temp);
        }
        catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        finally {
            sem.release();
        }
    }

    public Iterator<E> iterator() {
        Iterator<E> iterator = null;
        try {
            sem.acquire();
            iterator = set.iterator();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            sem.release();
        }
        assert iterator != null;
        return iterator;
    }


    public void remove(E temp){
        try{
            sem.acquire();
            set.remove(temp);
        }
        catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        finally {
            sem.release();
        }
    }

}
