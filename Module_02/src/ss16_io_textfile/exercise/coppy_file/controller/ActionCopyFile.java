package ss16_io_textfile.exercise.coppy_file.controller;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ActionCopyFile {
    public static void main(String[] args) {
        String readPath = "src/ss16_io_textfile/exercise/coppy_file/repository/first_text";
        String writePath = "src/ss16_io_textfile/exercise/coppy_file/repository/copy_text";

        String data = "";

        try {
            data = ReadAndWrite.readFile(readPath);
        } catch (FileNotFoundException e) {
            System.out.println("Không tìm thấy file nguồn!");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try {
            ReadAndWrite.writeFile(writePath, data);
        } catch (FileNotFoundException e) {
            System.out.println("Không tìm thấy file đích!");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}