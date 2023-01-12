package luyenthi_lan2.service;

import luyenthi_lan2.model.Teacher;

public interface ITeacherService {
    void display();
    void add(Teacher teacher);
    void searchName(String str);
    void searchId(String str);
    void edit(String str);
    void delete(String str);
}
