package case_study_furama_resort.models.person;

public class Employee extends Person {
    private String level;
    private String location;
    private double salary;

    public Employee(String employeeId, String name, String dateOfBirth,
                    String gender, String numberIdentity, String numberPhone,
                    String email, String level, String location,
                    double salary) {
        super(employeeId, name, dateOfBirth, gender,
                numberIdentity, numberPhone, email);
        this.level = level;
        this.location = location;
        this.salary = salary;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(",%s,%s,%.2f",
                level, location, salary);

    }
}
