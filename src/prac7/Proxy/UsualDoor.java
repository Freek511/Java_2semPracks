package prac7.Proxy;

public class UsualDoor implements Door{
    private boolean isOpened = false;
    @Override
    public void open(Employee person) {
        if(person.getAccessCode() >= 0) {
            System.out.println("UsualDoor is opened by " + person.getName());
            isOpened = true;
        }
        else {
            System.out.println("Access denied for " + person.getName());
            System.out.println("Your access code is " +person.getAccessCode());
            System.out.println("Access code is needed: 0 or higher");
        }
    }

    @Override
    public void close(Employee person) {
        if(isOpened) {
            System.out.println("UsualDoor is closed by "+ person.getName());
            isOpened = false;
        }
        else{
            System.out.println("UsualDoor is already closed");
        }
    }
}
