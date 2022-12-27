package student_manager_mvc.view;

import student_manager_mvc.controller.MainController;

public class MainView {
    public static void main(String[] args) {
        MainController mainController = new MainController();
        mainController.manage();
    }
}
