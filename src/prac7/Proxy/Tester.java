package prac7.Proxy;

public class Tester {
    public static void main(String[] args) {
        Employee Jim = new Employee(5, "Jim");
        Employee Tom = new Employee(1, "Tom");
        Door sd = new SecretDoor();
        Door ud = new UsualDoor();
        sd.open(Tom);
        sd.close(Tom);
        sd.open(Jim);
        sd.close(Jim);
        ud.open(Tom);
        ud.close(Tom);
        ud.open(Jim);
        ud.close(Jim);
    }
}
