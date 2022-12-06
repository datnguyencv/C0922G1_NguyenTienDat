package case_study_furama_resort.utils.read_write_file.regex.person;

public class ValidateNumberPhone {
    public boolean validate(String inputNumberPhone) {
        String numberPhoneRegex = "^[0][0-9]{9}$";
        return inputNumberPhone.matches(numberPhoneRegex);
    }
}
