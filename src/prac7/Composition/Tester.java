package prac7.Composition;

public class Tester {
    public static void main(String[] args) {
        Employee Jim = new Junior();
        Employee Tom = new Junior();
        Employee Rick = new Middle();
        Employee Mary = new Senior();
        Employee team = new TeamBuilder(Jim, Rick);

        TaskMenger tm = new TaskMenger(team, Mary);
        tm.doSomeThing();
    }
}
