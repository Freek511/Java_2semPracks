package prac3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Semaphore;

public class Main {
    int sum = 0;
    public static void main(String[] args) {
        LockList<Integer> list = new LockList<>();
        SemaphoreSet<Integer> set = new SemaphoreSet<>();
        Set<Integer> unsafeSet = new HashSet<>();
        ArrayList<Integer> unsafeList = new ArrayList<>(30);

        int sum=0;
        new Thread(()->{
            System.out.println("Первый поток работает");
            for(int i = 0; i < 10; i++){
                list.add(i);
                set.add(i);
                unsafeList.add(i);
                unsafeSet.add(i);

            }

        }).start();

        new Thread(()->{
            System.out.println("Второй поток работает");
            for(int i = 10; i < 20; i++){
                list.add(i);
                set.add(i);
                unsafeList.add(i);
                unsafeSet.add(i);
            }

        }).start();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("LockList size = " + list.size());
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
//
//        System.out.println("SemaphoreSet size = " + set.size());
//        for (Integer i : set) {
//            System.out.print(set.get(i) + " ");
//        }
//        System.out.println();

        for(Integer i : unsafeList)
            System.out.println(i);

        System.out.println();
        System.out.println("ArrayList size = " + unsafeList.size());
        System.out.println("HashSet size = " + unsafeSet.size());

    }



}
