package prac7.Composition;

public class Middle implements Employee{
    @Override
    public void takeTask() {
        System.out.println("Middle took a task");
    }

    @Override
    public void removeTask() {
        System.out.println("Middle has done a task");
    }
}
