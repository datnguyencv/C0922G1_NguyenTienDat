package exercise4.model.service;

import exercise4.model.Student;

import java.util.Map;
import java.util.TreeMap;

public abstract class StudentServiceImpl implements IStudentService{

    private static Map<Integer, Student> studentMap = new TreeMap<>();
//    CGDN00023,Nguyễn Văn An,0903123456,25/05/2000,C1223G1
    static {
        Student student1= new Student();
//        Student.put(1,student1);
    }
    @Override
    public void displayData() {

    }

    @Override
    public boolean checkId(String id) {
        return false;
    }

    @Override
    public String getStudentName(String id) {
        return null;
    }

    @Override
    public void writeFile() {

    }

    @Override
    public void readFile() {

    }
}
