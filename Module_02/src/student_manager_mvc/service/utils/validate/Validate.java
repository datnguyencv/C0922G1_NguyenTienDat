package student_manager_mvc.service.utils.validate;

import student_manager_mvc.service.utils.exception.*;

import java.util.Scanner;

public class Validate {
    private static Scanner scanner = new Scanner(System.in);
    private static final String CLASS_NAME_REGEX = "(A|C)[0-9]{4}(G|I)[1]";
    private static final String NAME_REGEX = "^[A-Za-zvxyỳọáầảấờễàạằệếýộậốũứĩõúữịỗìềểẩớặòùồợãụủíỹắẫựỉỏừỷởóéửỵẳẹèẽổẵẻỡơôưăêâđĐ ]{5,50}$";
    private static final String GENDER_REGEX = "^(NAM|NỮ|nam|nữ|nu|NU)$";
    private static final String DATE_OF_BIRTH_REGEX = "^(?:(?:31(\\\\/|-|\\\\.)(?:0?[13578]|1[02]))\\\\1|(?:(?:29|30)(\\\\/|-|\\\\.)(?:0?[13-9]|1[0-2])\\\\2))(?:(?:1[6-9]|[2-9]\\\\d)?\\\\d{2})$|^(?:29(\\\\/|-|\\\\.)0?2\\\\3(?:(?:(?:1[6-9]|[2-9]\\\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\\\d|2[0-8])(\\\\/|-|\\\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\\\4(?:(?:1[6-9]|[2-9]\\\\d)?\\\\d{2})$";
    private static final String SPECIALIZE_REGEX = "^[A-Za-zvxyỳọáầảấờễàạằệếýộậốũứĩõúữịỗìềểẩớặòùồợãụủíỹắẫựỉỏừỷởóéửỵẳẹèẽổẵẻỡơôưăêâđ ]{5,50}$";

    public static String inputClassName(String message) {
        String className;
        while (true) {
            try {
                System.out.println("Enter " + message + " :");
                className = scanner.nextLine();
                if (className.matches(CLASS_NAME_REGEX)) {
                    return className;
                } else {
                    throw new ClassNameException("Tên lớp không hợp lệ");
                }
            } catch (ClassNameException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static String inputName(String message) {
        String name;
        while (true) {
            try {
                System.out.println("Enter " + message + " :");
                name = scanner.nextLine();
                if (name.matches(NAME_REGEX)) {
                    break;
                } else {
                    throw new NameException("Tên không hợp lệ");
                }
            } catch (NameException e) {
                System.out.println(e.getMessage());
            }
        }
        return name;
    }

    public static double inputPoint(String message) {
        double point;
        while (true) {
            try {
                System.out.println("Enter " + message + " :");
                point = Double.parseDouble(scanner.nextLine());
                if (point < 0 || point > 10) {
                    throw new PointException("Điểm bạn nhập vào không hợp lệ. Hãy nhập lại! (1->10)");
                }
                break;
            } catch (PointException e) {
                System.out.println(e.getMessage());
            }
        }
        return point;
    }

    public static String inputGender(String message) {
        String gender;
        while (true) {
            try {
                System.out.println("Enter " + message + " :");
                gender = scanner.nextLine();
                if (gender.matches(GENDER_REGEX)) {
                    break;
                } else {
                    throw new GenderException("Giới tính không hợp lệ");
                }
            } catch (GenderException e) {
                System.out.println(e.getMessage());
            }
        }
        return gender;
    }

    public static String inputDateOfBirth(String message) {
        String dateOfBirth;
        while (true) {
            try {
                System.out.println("Enter " + message + " :");
                dateOfBirth = scanner.nextLine();
                if (dateOfBirth.matches(DATE_OF_BIRTH_REGEX)) {
                    break;
                } else {
                    throw new DayBirthDayException("Ngày tháng năm sinh không hợp lệ");
                }
            } catch (DayBirthDayException e) {
                System.out.println(e.getMessage());
            }
        }
        return dateOfBirth;
    }

    public static int inputId(String message) {
        int id;
        while (true) {
            try {
                System.out.println("Enter input " + message + " :");
                id = Integer.parseInt(scanner.nextLine());
                if (id <= 0) {
                    throw new IdException("ID not True >0. Try agains : ");
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("ID only Number. Try agains: ");
            } catch (IdException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println("");
            }
        }
        return id;
    }
    public static String inputSpecialize(String message) {
        String specialize;
        while (true) {
            try {
                System.out.println("Enter " + message + " :");
                specialize = scanner.nextLine();
                if (specialize.matches(SPECIALIZE_REGEX)) {
                    break;
                } else {
                    throw new SpecializeException("Ngành nghề không hợp lệ");
                }
            } catch (SpecializeException e) {
                System.out.println(e.getMessage());
            }
        }
        return specialize;
    }
}
