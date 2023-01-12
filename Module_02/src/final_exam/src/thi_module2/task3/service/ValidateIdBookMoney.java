package thi_module2.task3.service;

public class ValidateIdBookMoney {
    private static final String ID_BOOK = "^(MO-)\\d{3}$";

    public static boolean isValidateIdBookMoney(String str){
        return str.matches(ID_BOOK);
    }
}
