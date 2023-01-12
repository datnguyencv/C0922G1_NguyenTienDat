package luyenthi_lan2.model;

public class Teacher {
    private String idTeach;
    private String nameTeach;
    private String yearOld;
    private String classTeach;
    private String email;
    private String address;

    public Teacher() {
    }

    public Teacher(String idTeach, String nameTeach, String yearOld, String classTeach, String email, String address) {
        this.idTeach = idTeach;
        this.nameTeach = nameTeach;
        this.yearOld = yearOld;
        this.classTeach = classTeach;
        this.email = email;
        this.address = address;
    }

    public String getIdTeach() {
        return idTeach;
    }

    public void setIdTeach(String idTeach) {
        this.idTeach = idTeach;
    }

    public String getNameTeach() {
        return nameTeach;
    }

    public void setNameTeach(String nameTeach) {
        this.nameTeach = nameTeach;
    }

    public String getYearOld() {
        return yearOld;
    }

    public void setYearOld(String yearOld) {
        this.yearOld = yearOld;
    }

    public String getClassTeach() {
        return classTeach;
    }

    public void setClassTeach(String classTeach) {
        this.classTeach = classTeach;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "idTeach='" + idTeach + '\'' +
                ", nameTeach='" + nameTeach + '\'' +
                ", yearOld='" + yearOld + '\'' +
                ", classTeach='" + classTeach + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public String chuyenDoiSCV(){
        return this.getIdTeach() +","+ this.getNameTeach() +","+ this.getYearOld() +","+ this.getEmail() +","+ this.getClassTeach() +","+ this.getAddress();
    }
}
