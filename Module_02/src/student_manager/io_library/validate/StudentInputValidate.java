package student_manager.io_library.validate;

public class StudentInputValidate {
    public boolean validateName(String inputName) {
        String studentNameRegex = "^[a-zA-Z]{6,29}";
        return inputName.matches(studentNameRegex);
    }
}
