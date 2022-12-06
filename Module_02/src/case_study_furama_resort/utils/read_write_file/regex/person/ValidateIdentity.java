package case_study_furama_resort.utils.read_write_file.regex.person;

public class ValidateIdentity {
    public boolean validate(String inputIdentity) {
        String identityRegex = "[0-9]{9}";
        return inputIdentity.matches(identityRegex);
    }
}
