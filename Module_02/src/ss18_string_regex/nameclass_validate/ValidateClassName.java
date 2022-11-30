package ss18_string_regex.nameclass_validate;

public class ValidateClassName {
    public boolean validate(String inputClassName) {
        String classNameRegex = "[CAP][0-9]{4}[GHIKLM]";
        return inputClassName.matches(classNameRegex)  ;
    }
}


