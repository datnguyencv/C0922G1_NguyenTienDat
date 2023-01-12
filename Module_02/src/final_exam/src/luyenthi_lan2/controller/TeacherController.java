package luyenthi_lan2.controller;

import luyenthi_lan2.model.Teacher;
import luyenthi_lan2.service.impl.TeacherServiceImpl;

import java.util.Scanner;

public class TeacherController {
    public static TeacherServiceImpl teacherService = new TeacherServiceImpl();


    public static void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        int choise = 0;
        do {
        System.out.println("--------------------------");
        System.out.println("1. Hiển thị\n" +
                "2. Thêm mơi\n" +
                "3. Sắp xếp\n" +
                "4. Sửa xoá\n" +
                "5. Tìm kiếm theo id\n" +
                "6. Tìm kiếm theo tên\n" +
                "7. Thoát");

                choise = Integer.parseInt(scanner.nextLine()) ;

                switch (choise) {
                    case 1:
                        teacherService.display();
                        break;
                    case 2:
                        // private String idTeach;
                        //    private String nameTeach;
                        //    private String yearOld;
                        //    private String classTeach;
                        //    private String email;
                        //    private String address;
                        System.out.println("Nhập infor");
                        System.out.println("Nhập ID");
                        String id = scanner.nextLine();
                        System.out.println("Nhập tên");
                        String name = scanner.nextLine();
                        System.out.println("Nhập Tuổi");
                        String yearOld = scanner.nextLine();
                        System.out.println("Nhập lớp dạy ");
                        String classTeach = scanner.nextLine();
                        System.out.println("Nhập email");
                        String email = scanner.nextLine();
                        System.out.println("Nhập Địa chỉ ");
                        String address = scanner.nextLine();
                        Teacher teacher = new Teacher(id, name, yearOld, classTeach, email, address);
                        teacherService.add(teacher);
                        teacherService.display();
                        break;
                    case 3:
                        break;
                    case 4:

                        System.out.println("1. Sửa\n" +
                                "2. Xoá\n" +
                                "3. Quay lại");
                        int choises= Integer.parseInt(scanner.nextLine());
                        if (choises==1) {
                            String input = scanner.nextLine();
                            teacherService.edit(input);
                        }else if (choises==2) {
                            String input = scanner.nextLine();
                            teacherService.delete(input);
                        }else


                         break;

                    case 5:
                        System.out.println("nhập id");
                        String idFind=scanner.nextLine();
                        teacherService.searchId(idFind);

                        break;
                    case 6:
                        System.out.println("nhập tên lớp ");
                        String classFind=scanner.nextLine();
                        teacherService.searchName(classFind);
                        break;
                    case 7:
                        System.out.println("bye");
                        System.exit(1);
                        break;
                }

            }
            while (true) ;

        }
    }









