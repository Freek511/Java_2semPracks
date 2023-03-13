package prac7.Proxy;

public class DoorProxy implements Door{
    private final Door door;

    public DoorProxy(Door door){
        this.door = door;
    }
    @Override
    public void open(Employee person) {
        door.open(person);
    }

    @Override
    public void close(Employee person) {
        door.close(person);
    }
}
