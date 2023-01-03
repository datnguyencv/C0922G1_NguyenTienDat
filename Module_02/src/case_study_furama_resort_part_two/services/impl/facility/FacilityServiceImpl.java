package case_study_furama_resort_part_two.services.impl.facility;

import case_study_furama_resort_part_two.libs.read_and_write_file_facility.ReadFileFacility;
import case_study_furama_resort_part_two.libs.read_and_write_file_facility.WriteFileFacility;
import case_study_furama_resort_part_two.models.facility.Facility;
import case_study_furama_resort_part_two.services.IFacilityService;



import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class FacilityServiceImpl implements IFacilityService {
        private static Map<Facility, Integer> map = new LinkedHashMap<>();
    private static final String FACILITY_PATH_NAME = "src/case_study_furama_resort_part_two/datas/facility.csv";

    @Override
    public Map<Facility, Integer> getFacilityMaintenanceList() {
        map = ReadFileFacility.readFile(FACILITY_PATH_NAME);
        Facility facility;
        for (Map.Entry<Facility, Integer> entry : map.entrySet()) {
            facility = null;
            if (entry.getValue() < 5) {
                facility = entry.getKey();
            }
            if(facility!=null){
                map.remove(facility);
            }
        }

        return map;
    }

    @Override
    public List<Facility> getList() {
        return null;
    }

    public Map<Facility, Integer> getMap() {
        map = ReadFileFacility.readFile(FACILITY_PATH_NAME);
        return map;
    }

    @Override
    public void addElement(Facility o) {

    }


    public void addFacility(Facility facility, int usedTimes) {
        map = ReadFileFacility.readFile(FACILITY_PATH_NAME);
        for (Map.Entry<Facility, Integer> entry : map.entrySet()) {
            if (facility.equals(entry.getKey())) {
                System.out.println("Already existed!");
                return;
            }
        }
        map.put(facility, usedTimes);
        WriteFileFacility.writeFileFacility(FACILITY_PATH_NAME, map);
        System.out.println("Successful!");
    }

}
