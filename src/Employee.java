public class Employee implements Comparable<Employee> {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Employee other) {
        // Implementa a comparação com base no nome
        return this.name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return "Employee: " + name;
    }
}