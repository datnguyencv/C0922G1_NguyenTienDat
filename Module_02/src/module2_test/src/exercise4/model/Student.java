package exercise4.model;

    /*
    Tính kế thừa
     */
public class Student extends Person {
    /*
    Tính bao đóng
    */
    private String phoneNumberStudent;
    private String dateOfBirthStudent;
    private String classStudent;

    public Student() {
    }

    public Student(String id, String name, String phoneNumberStudent, String dateOfBirthStudent, String classStudent) {
        super(id, name);
        this.phoneNumberStudent = phoneNumberStudent;
        this.dateOfBirthStudent = dateOfBirthStudent;
        this.classStudent = classStudent;
    }

    /*
    Tính bao đóng
     */
    public String getPhoneNumberStudent() {
        return phoneNumberStudent;
    }

    public void setPhoneNumberStudent(String phoneNumberStudent) {
        this.phoneNumberStudent = phoneNumberStudent;
    }

    public String getDateOfBirthStudent() {
        return dateOfBirthStudent;
    }

    public void setDateOfBirthStudent(String dateOfBirthStudent) {
        this.dateOfBirthStudent = dateOfBirthStudent;
    }

    public String getClassStudent() {
        return classStudent;
    }

    public void setClassStudent(String classStudent) {
        this.classStudent = classStudent;
    }

    /*
    Tính đa hình
     */
    @Override
    public String getInfo() {
        return null;
    }

    @Override
    public String toString() {
        return "Student{" +
                "phoneNumberStudent='" + phoneNumberStudent + '\'' +
                ", dateOfBirthStudent='" + dateOfBirthStudent + '\'' +
                ", classStudent='" + classStudent + '\'' +
                '}';
    }

}
