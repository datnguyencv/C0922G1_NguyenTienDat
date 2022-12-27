package case_study_furama_resort_part_two.libs.read_and_write_file_facility;

import case_study_furama_resort_part_two.models.facility.Facility;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class WriteFileFacility {
    public static void writeFileFacility(String pathName, Map<Facility,Integer> map) {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(pathName);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Map.Entry<Facility, Integer> entry : map.entrySet()){
                bufferedWriter.write(entry.getKey().toStringCSV() + "," + entry.getValue());
                bufferedWriter.flush();
                bufferedWriter.newLine();
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                fileWriter.close();
                bufferedWriter.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
