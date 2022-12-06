package case_study_furama_resort.utils.read_write_file.regex.facility;

public class ValidateNameFacility {
    public boolean validate(String inputName) {
        String nameRegex= "\\p{Lu}\\p{Ll}+(\\s\\p{Ll}+)*";
        return inputName.matches(nameRegex) ;
    }
}
