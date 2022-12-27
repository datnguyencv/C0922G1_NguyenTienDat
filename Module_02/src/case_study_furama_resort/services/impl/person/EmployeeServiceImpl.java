package case_study_furama_resort.services.impl.person;

import case_study_furama_resort.models.person.Employee;
import case_study_furama_resort.services.IEmployeeService;
import case_study_furama_resort.utils.read_write_file.exception.InvalidStringException;
import case_study_furama_resort.utils.read_write_file.ReadFileUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static case_study_furama_resort.utils.read_write_file.WriteFileUtil.writeFile;

public class EmployeeServiceImpl implements IEmployeeService {
    public static final String EMPLOYEE_CSV = "src/case_study_furama_resort/data_libs/employee.csv";
    Scanner scanner = new Scanner(System.in);
    private static List<Employee> employeeList = new ArrayList<>();
    private static final InputInfoPeronServiceImpl inputInfoPeronService = new InputInfoPeronServiceImpl();

    @Override
    public void add() {
        Employee employeeAdd = check(inputString("ID"), "ID");
        if (employeeAdd != null) {
            System.out.println("Id đã tồn tại vui lòng kiêm tra thao tác lại");
            return;
        }
        employeeAdd = this.infoEmployee("info");
        List<Employee> employeeListNew = new ArrayList<>();
        employeeListNew.add(employeeAdd);
        writeFile(EMPLOYEE_CSV, true, convertListEmployeeToListString(employeeListNew));
        System.out.println("Thêm mới thành công");
    }

    @Override
    public void display() {
        employeeList = this.readFileEmployee();
        for (Employee x : employeeList) {
            System.out.println(x.toString());
        }
    }

    @Override
    public void update() {
        Employee employeeGetId = check(inputString("ID"), "ID");
        if (employeeGetId != null) {
            int idIndex = employeeList.indexOf(employeeGetId);
            Employee employeeUpdate = infoEmployee(employeeGetId.getId());
            System.out.println("Bạn có chắc muốn update đối tượng có ID là " + employeeGetId.getId() + " không?");
            System.out.println("1. Yes");
            System.out.println("2. No");
            int choice = Integer.parseInt(scanner.nextLine());
            if (choice == 1) {
                employeeList.set(idIndex, employeeUpdate);
                writeFile(EMPLOYEE_CSV, false, convertListEmployeeToListString(employeeList));
                System.out.println("Update thành công!");
            }
        } else {
            System.out.println("Không tìm thấy đối tượng cần update");
        }
    }

    /*
     * Nhập thông tin nhân viên
     */
    public Employee infoEmployee(String booleanId) {
        String infoID;
        if (booleanId.equals("info")) {
            infoID = inputInfoPeronService.infoId("Employee", "ID Employee ");
        } else {
            infoID = booleanId;
        }
        return new Employee(infoID, inputInfoPeronService.infoName(), inputInfoPeronService.infoGender(), inputInfoPeronService.infoDateOfBirth(), infoNumberPhone(), infoNumberIdentity(), inputInfoPeronService.infoEmail(), infoLevel(), infoLocation(), infoSalary());
    }

    /*
     * nhập thông tin level
     */
    public String infoLevel() {
        while (true) {
            String level;
            System.out.println("Mời bạn chọn level\n" + "1.\tTrung cấp\n" + "2.\tCao đẳng\n" + "3.\tĐại học\n" + "4.\tSau Đại học\n");
            switch (choice()) {
                case 1:
                    return level = "Trung cấp";
                case 2:
                    return level = "Cao đẳng";
                case 3:
                    return level = "Đại học";
                case 4:
                    return level = "sau Đại học";
                default:
                    System.out.println("Lựa chọn bạn nhập không đúng!");
            }
        }
    }

    /*
     * nhập thông tin vị trí
     */
    public String infoLocation() {
        while (true) {
            String location;
            System.out.println("Mời bạn chọn location\n" + "1.\tLễ tân\n" + "2.\tPhục vụ\n" + "3.\tChuyên viên\n" + "4.\tGiám sát\n" + "5.\tQuản lý\n" + "6.\tGiám đốc\n");
            switch (choice()) {
                case 1:
                    return location = "Lễ tân";
                case 2:
                    return location = "Phục vụ";
                case 3:
                    return location = "Chuyên viên";
                case 4:
                    return location = "Giám sát";
                case 5:
                    return location = "Quản lý";
                case 6:
                    return location = "Giám đốc";
                default:
                    System.out.println("Lựa chọn bạn nhập không đúng!");
            }
        }
    }

    /*
     * nhập thông tin lương
     */
    protected double infoSalary() {
        double salary;
        while (true) {
            try {
                System.out.print("Mời bạn nhập salary : ");
                salary = Double.parseDouble(scanner.nextLine());
                return salary;
            } catch (NumberFormatException e) {
                System.out.println("Bạn nhập không phải là số. Yêu cầu nhập lại.");
            }
        }
    }


    /*
     * check giá trị nhập (inputValue) vào không đc để rỗng
     */
    public String inputString(String inputString) {
        String inputValue;
        while (true) {
            System.out.print("Mời bạn nhập " + inputString + " : ");
            inputValue = scanner.nextLine();
            if (inputValue.equals("")) {
                try {
                    throw new InvalidStringException("Vui lòng nhập lại ,bạn chưa nhập dữ liệu vào!");
                } catch (InvalidStringException e) {
                    System.out.println(e.getMessage());
                }
            }
            return inputValue;
        }
    }

    /*
     * kiểm tra (ID, NumberIdentity, NumberPhone) có tồn tại hay không
     */
    public Employee check(String Value, String what) {
        employeeList = this.readFileEmployee();
        for (int i = 0; i < employeeList.size(); i++) {
            if (what.equals("ID") && employeeList.get(i).getId().equals(Value)) {
                return employeeList.get(i);
            }
            if (what.equals("NumberIdentity") && employeeList.get(i).getNumberIdentity().equals(Value)) {
                return employeeList.get(i);
            }
            if (what.equals("NumberPhone") && employeeList.get(i).getNumberPhone().equals(Value)) {
                return employeeList.get(i);
            }
        }
        return null;
    }

    public String infoNumberPhone() {
        boolean aa= true;
        while (aa) {
            try {
                if (check(inputInfoPeronService.infoNumberPhone(), "NumberPhone") != null) {
                    throw new NumberFormatException();
                }
                aa=false;
                return inputInfoPeronService.infoNumberPhone();
            } catch (NumberFormatException e) {
                System.out.println("Bạn nhập bị trùng số điện thoại. Yêu cầu nhập lại.");
            }
        }
        return null;
    }

    public String infoNumberIdentity() {
        while (true) {
            try {
                if (check(inputInfoPeronService.infoNumberIdentity(), "NumberIdentity") != null) {
                    throw new Exception();
                }
                return inputInfoPeronService.infoNumberIdentity();
            } catch (Exception e) {
                System.out.println("Bạn nhập bị trùng số CMND. Yêu cầu nhập lại.");
            }
        }
    }

    public int choice() {
        int choice;
        while (true) {
            try {
                System.out.print("Mời bạn nhập các chức năng : ");
                choice = Integer.parseInt(scanner.nextLine());
                return choice;
            } catch (NumberFormatException e) {
                System.out.println("Bạn nhập không phải là số. Yêu cầu nhập lại.");
            }
        }
    }

    /*
     * chuyển mảng thành dữ liệu String
     */
    public List<String> convertListEmployeeToListString(List<Employee> employeeList) {
        List<String> stringsEmployeeList = new ArrayList<>();
        for (Employee employee : employeeList) {
            stringsEmployeeList.add(employee.toString());
        }
        return stringsEmployeeList;
    }

    /*
     * đọc file danh sách model
     */
    public List<Employee> readFileEmployee() {
        List<String> employeeArrString = null;
        List<Employee> employeeArr = new ArrayList<>();
        try {
            employeeArrString = ReadFileUtil.readFile(EMPLOYEE_CSV);
            if (employeeArrString.size() == 0) {
                System.out.println("Dữ liệu trong file không có");
            }
        } catch (NullPointerException e) {
            System.out.println("Dữ liệu trong file không có");
        }
        for (int i = 0; i < employeeArrString.size(); i++) {
            String[] infoEmployee = employeeArrString.get(i).split(",");
            Employee employee = new Employee(infoEmployee[0], infoEmployee[1], infoEmployee[2], infoEmployee[3], infoEmployee[4], infoEmployee[5], infoEmployee[6], infoEmployee[7], infoEmployee[8], Double.parseDouble(infoEmployee[9]));
            employeeArr.add(employee);
        }
        return employeeArr;
    }
}
