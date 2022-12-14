package exercise2;

public class IsValidatePassword {
    public boolean isValidatePassword(String inputPassword) {
        String isValidate = "^((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%!]).{6,20})";
        return inputPassword.matches(isValidate)  ;
    }
}
