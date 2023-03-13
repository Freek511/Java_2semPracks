package prac7.Composition;

import java.util.ArrayList;
import java.util.List;

public class TaskMenger {
    private final List<Employee> team = new ArrayList<>();
    public TaskMenger(Employee person){
        team.add(person);
    }
    public TaskMenger(Employee ... person){
        for(Employee temp : person){
            team.add(temp);
        }
    }
    public void doSomeThing(){
        for(Employee person : team){
            person.takeTask();
        }
    }
}
