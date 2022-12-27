package student_manager_mvc.model;

import java.util.Comparator;

public class Student extends Person implements Comparable<Student>, Comparator<Student> {
    private double point;
    private String address;

    public Student() {
    }

    public Student(int id, String name, String dateOfBirth, String gender) {
    }

    public Student(double point, String address) {
        this.point = point;
        this.address = address;
    }

    public Student(int id, String name, String dateOfBirth, String gender, double point, String address) {
        super(id, name, dateOfBirth, gender);
        this.point = point;
        this.address = address;
    }


    public double getPoint() {
        return point;
    }

    public void setPoint(double point) {
        this.point = point;
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
//        return "Student{" +
//                super.toString() +
//                "point=" + point +
//                ", address='" + address + '\'' +
//                '}';
        return String.format("%s,%s,%s,%s,%s,%s",this.getId(),this.getName(),this.getDateOfBirth(), this.getGender(),point, address);
    }

    @Override
    public int compareTo(Student o) {
        return this.getName().compareTo(o.getName());
    }

    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getPoint()-o2.getPoint()>0){
            return 1;
        }else {
            return -1;
        }
    }
}
