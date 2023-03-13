package prac7.Proxy;

public class Employee {
    private int accessCode;
    String name;

    @Override
    public String toString() {
        return "Employee{" +
                ", name='" + name + '\'' +
                '}';
    }

    public Employee(int accessCode, String name) {
        this.accessCode = accessCode;
        this.name = name;
    }

    public int getAccessCode() {
        return accessCode;
    }

    public void setAccessCode(int accessCode) {
        this.accessCode = accessCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
