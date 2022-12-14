package student_manager_mvc.model;

public class Teacher extends Person {
    private String specialize;

    public Teacher() {
    }

    public Teacher(String specialize) {
        this.specialize = specialize;
    }

    public Teacher(int id, String name, String dateOfBirth, String gender, String specialize) {
        super(id, name, dateOfBirth, gender);
        this.specialize = specialize;
    }

    @Override
    public String toString() {
//        return "Teacher{" +
//                super.toString() +
//                "specialize='" + specialize + '\'' +
//                '}';
        return String.format("%s,%s,%s,%s,%s",this.getId(),this.getName(),this.getDateOfBirth(),this.getGender(),specialize);
    }
}
