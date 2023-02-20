package prac2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class HumanTest {

/*
    public List<Human> CreateHuman(int size) {
        List<Human> data = new ArrayList<Human>();
        for(int i = 0; i < size; i++){
            int age = (int) Math.random();
            int weight = (int) Math.random();
            String firstName = "Hum" + Integer.toString(i);
            String lastName = "An" + Integer.toString(i);
            LocalDate date = LocalDate.now();
            Human temp = new Human(age, weight,firstName,lastName,date);
            data.add(temp);
        }
        return data;
    }
*/



    public static void main(String[] args) {
        List<Human> data = new ArrayList<Human>();

        for(int i = 0; i < 5; i++){
            int age = (int) (Math.random() * (40 - 10) + 10);
            int weight = (int) (Math.random() * (40 - 10) + 10);
            String firstName = "Hum" + Integer.toString(i);
            String lastName = "An" + Integer.toString(i);
            LocalDate date = LocalDate.now();
            Human temp = new Human(age, weight,firstName,lastName,date);
            data.add(temp);
        }
        for( Human h : data){
            System.out.println(h.toString());
        }

        System.out.println("-------------------------");
        data.stream().filter(h1 -> h1.getAge() < 20)
         .forEach(System.out::println);

        System.out.println("-------------------------");
        data.stream().sorted((h1,h2) -> (h1.getAge() -  h2.getAge()))
                .forEach(System.out::println);

        System.out.println("-------------------------");
        data.stream().filter(h -> (h.getLastName().contains("0") || h.getFirstName().contains("2")))
                .forEach(System.out::println);
        System.out.println("-------------------------");
        String names = "";
        String nig = data.stream().reduce("",(x,y)-> {return x+y.getFirstName().charAt(0);},
                (x,y)->x+y);
        System.out.println(nig);
    }
}
