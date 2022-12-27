package case_study_furama_resort_part_two.services;

import case_study_furama_resort_part_two.models.person.Employee;

public interface IEmployeeService extends IService{
    void addElement(Employee e);

    void deleteEmployee(int employeeID);

    void editEmployee(int employeeID);

    boolean employeeExisted(int employeeID);

    void setEmployeeName(int employeeEditedID, String name);

    void setEmployeeDateOfBirth(int employeeIDEdited, String newDateOfBirth);

    void setEmployeeGender(int employeeEditedId, String newGender);

    void setEmployeeIdentification(int employeeEditedId, String newIdentification);

    void setEmployeePhoneNumber(int employeeEditedId, String newPhoneNumber);

    void setEmployeeEmail(int employeeEditedId, String newEmail);

    void setEmployeeLevel(int employeeEditedId, String newLevel);

    void setEmployeePosition(int employeeEditedId, String newPosition);

    void setEmployeeSalary(int employeeEditedId, double newSalary);

}
