package prac7.Composition;

public class Junior implements Employee{
    @Override
    public void takeTask() {
        System.out.println("Junior took a task");
    }

    @Override
    public void removeTask() {
        System.out.println("Junior has done a task");
    }
}
