package case_study_furama_resort.utils.read_write_file.regex.person;

public class ValidateGender {
    public boolean validate(String inputGender) {
        String genderRegex = "([N][a][m])|([N][ữ])|([K][h][á][c])";
        return inputGender.matches(genderRegex) ;
    }
}
