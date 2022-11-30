package ss18_string_regex.phonenumber_validate;

public class ValidateNumberPhone {
    public boolean validate(String inputNumberPhone) {
        String ValidateNumberPhoneRegex = "[(][8][4][)]-[(]0\\d{9}[)]";
        return inputNumberPhone.matches(ValidateNumberPhoneRegex);
    }
}
