package prac7.Composition;
import java.util.ArrayList;
import java.util.List;

public class TeamBuilder implements Employee {
    private final List<Employee> team = new ArrayList<>();

    private void addPerson(Employee people){
        team.add(people);
    }
    private void removePerson(Employee people){
        team.remove(people);
    }
    public TeamBuilder(Employee ...people){
        for(Employee person : people){
            team.add(person);
        }
    }

    @Override
    public void takeTask() {
        for (Employee person : team){
            person.takeTask();
        }
        System.out.println("Team working is started");
    }

    @Override
    public void removeTask() {
        for (Employee person : team){
            person.removeTask();
        }
        System.out.println("Team working is done");
    }
}
