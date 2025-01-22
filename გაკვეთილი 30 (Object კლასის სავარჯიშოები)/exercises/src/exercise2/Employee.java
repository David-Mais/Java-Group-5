package exercise2;

import java.util.Objects;

public class Employee {
    private int id;
    private String name;
    private Address address;

    public Employee(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return getId() == employee.getId() && Objects.equals(getName(), employee.getName()) && Objects.equals(getAddress(), employee.getAddress());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getAddress());
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address=" + address +
                '}';
    }

    public Employee clone() {
        return new Employee(
                id,
                name,
                address.clone()
        );
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "a", new Address("aStreet", "aCity"));
        Employee emp2 = emp1.clone();
        System.out.println(emp1);
        System.out.println(emp2);
        emp1.getAddress().setCity("anotherCity");
        System.out.println(emp1);
        System.out.println(emp2);
    }
}
