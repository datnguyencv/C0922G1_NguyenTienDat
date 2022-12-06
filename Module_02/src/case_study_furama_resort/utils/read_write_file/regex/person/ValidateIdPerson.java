package case_study_furama_resort.utils.read_write_file.regex.person;

public class ValidateIdPerson {
    public boolean validateEp(String inputId) {
        String nameRegex = "[E][p][-][0-9]{4}";
        return inputId.matches(nameRegex);
    }

    public boolean validateCt(String inputId) {
        String nameRegex = "[C][t][-][0-9]{4}";
        return inputId.matches(nameRegex);
    }
}

