package luyenthi_lan2.service.impl;

import luyenthi_lan2.data.Read_Write_File.ReadFile;
import luyenthi_lan2.data.Read_Write_File.WriteFile;
import luyenthi_lan2.model.Teacher;
import luyenthi_lan2.service.ITeacherService;

import java.util.List;

public class TeacherServiceImpl implements ITeacherService {
    private static final String PATH_NAME_TEACH = "src/luyenthi_lan2/data/teacher.csv";
    @Override
    public void display() {
        List<Teacher> teacherList = ReadFile.readFile(PATH_NAME_TEACH);
        for (int i = 0; i < teacherList.size(); i++) {
            System.out.println(teacherList.get(i));
        }
    }

    @Override
    public void add(Teacher teacher) {
        List<Teacher> teacherList = ReadFile.readFile(PATH_NAME_TEACH);
        teacherList.add(teacher);

        WriteFile.writeFileTeach(PATH_NAME_TEACH,teacherList);
        System.out.println("Successfull");

    }

    @Override
    public void searchId(String str) {
        List<Teacher> teacherList = ReadFile.readFile(PATH_NAME_TEACH);
        for (Teacher teacher:teacherList){
            if (teacher.getIdTeach().equals(str)){
                System.out.println(teacher);
            }
        }

    }

    @Override
    public void edit(String str) {
        List<Teacher> teacherList = ReadFile.readFile(PATH_NAME_TEACH);
        List<Teacher> teachers ;
        for (Teacher teacher:teacherList){
            if (teacher.getIdTeach().contains(str)){

            }
        }

    }

    @Override
    public void delete(String str) {

    }

    @Override
    public void searchName(String str) {
        List<Teacher> teacherList = ReadFile.readFile(PATH_NAME_TEACH);
        for (Teacher teacher:teacherList){
            if (teacher.getClassTeach().contains(str)){
                System.out.println(teacher);
            }
        }
    }
}
