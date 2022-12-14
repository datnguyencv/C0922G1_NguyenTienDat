package student_manager.model;

public class Student {
    private String studentID;
    private String studentName;
    private String yearOld;
    private int studentPhoneNumber;
    private String address;

    public Student() {
    }

    public Student(String studentID, String studentName, String yearOld, int studentPhoneNumber, String address) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.yearOld = yearOld;
        this.studentPhoneNumber = studentPhoneNumber;
        this.address = address;
    }

    public Student(String[] strings){
        this.studentID = strings[0];
        this.studentName = strings[1];
        this.yearOld = strings[2];
        this.studentPhoneNumber = Integer.parseInt(strings[3]);
        this.address = strings[4];
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getYearOld() {
        return yearOld;
    }

    public void setYearOld(String yearOld) {
        this.yearOld = yearOld;
    }

    public int getStudentPhoneNumber() {
        return studentPhoneNumber;
    }

    public void setStudentPhoneNumber(int studentPhoneNumber) {
        this.studentPhoneNumber = studentPhoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String formatStudentForCSV(){
        return studentID + "," + studentName + "," + yearOld + "," + studentPhoneNumber + "," + address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentID='" + studentID + '\'' +
                ", studentName='" + studentName + '\'' +
                ", yearOld='" + yearOld + '\'' +
                ", studentPhoneNumber=" + studentPhoneNumber +
                ", address='" + address + '\'' +
                '}';
    }
}
