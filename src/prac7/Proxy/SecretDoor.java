package prac7.Proxy;

public class SecretDoor implements Door{
    private boolean isOpened = false;
    @Override
    public void open(Employee person) {
        if(person.getAccessCode() >= 5) {
            System.out.println("SecretDoor is opened by " + person.getName());
            isOpened = true;
        }
        else {
            System.out.println("Access denied for " + person.getName());
            System.out.println("Your access code is " +person.getAccessCode());
            System.out.println("Access code is needed: 5 or higher");
        }
    }

    @Override
    public void close(Employee person) {
        if(isOpened) {
           System.out.println("SecretDoor is closed by " + person.getName());
           isOpened = false;
        }
        else{
            System.out.println("SecretDoor is already closed");
        }
    }
}
