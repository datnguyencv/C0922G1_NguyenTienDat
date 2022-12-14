package case_study_furama_resort.utils.read_write_file.regex.facility;

public class ValidateId {
    public boolean validateVilla(String inputId) {
        String nameRegex = "[S][V][V][L][-][0-9]{4}";
        return inputId.matches(nameRegex);
    }

    public boolean validateRoom(String inputId) {
        String nameRegex = "[S][V][R][O][-][0-9]{4}";
        return inputId.matches(nameRegex);
    }
}
