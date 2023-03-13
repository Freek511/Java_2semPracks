package prac7.Composition;

public class Senior implements Employee{
    @Override
    public void takeTask() {
        System.out.println("Senior took a task");
    }

    @Override
    public void removeTask() {
        System.out.println("Senior has done a task");
    }
}
